import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Ejecutar {
    private static Scanner sc = new Scanner(System.in);

//Método para insertar un contenedor en la primera posicion libre del patio 
    public static boolean insertarEnPatio(Contenedor[][] patio, Contenedor c) {
        for (int i = 0; i < patio.length; i++) {
            for (int j = 0; j < patio[i].length; j++) {
                if (patio[i][j] == null) {
                    patio[i][j] = c;
                    System.out.println("  → Contenedor " + c.getId() + " ubicado en patio[" + i + "][" + j + "]");
                    return true;
                }
            }
        }
        //En caso de no haber espacio disponible en el patio 
        System.out.println(" Puerto Saturado - No hay espacio para " + c.getId());
        return false;
    }

    //Método para mostrar el estado actual del patio 
    public static void mostrarPatio(Contenedor[][] patio) {
        System.out.println("\n ESTADO DEL PATIO");
        for (int i = 0; i < patio.length; i++) {
            for (int j = 0; j < patio[i].length; j++) {
                if (patio[i][j] == null) {
                    System.out.print("[VACIO] ");
                } else {
                    System.out.print("[" + patio[i][j].getId() + "] ");
                }
            }
            System.out.println();
        }
    }

   //Método para apilar contenedores en el buque 
    public static void apilarSeguro(Stack<Contenedor> buque, Contenedor c) {
        if (buque.isEmpty() || c.getPeso() <= buque.peek().getPeso()) {
            buque.push(c);
            System.out.println("  ✓ Contenedor " + c.getId() + " cargado en el buque (estable)");
        } else {
            System.out.println("  ✗ Contenedor " + c.getId() + " RECHAZADO: peso " + c.getPeso() +
                    " > tope " + buque.peek().getPeso() + " (inestable)");
        }
    }

//Método para eliminar un contenedor del fondo de la pila 
    public static void eliminarFondo(Stack<Contenedor> buque, String idBuscado) {
        //Verifica si la pila esta vacia 
        if (buque.isEmpty()) {
            System.out.println("El buque está vacío, no hay nada que eliminar.");
            return;
        }

        Stack<Contenedor> aux = new Stack<>();

        //Se pasan todos los elementos a una pila auxiliar 
        while (!buque.isEmpty()) {
            aux.push(buque.pop());
        }

        boolean encontrado = false;
        //Se revisa el elemento del fondo 
        if (!aux.isEmpty() && aux.peek().getId().equals(idBuscado)) {
            Contenedor eliminado = aux.pop();
            System.out.println("Contenedor dañado " + eliminado.getId() + " eliminado del fondo.");
            encontrado = true;
        } else {
            System.out.println("El contenedor con ID " + idBuscado + " no está en el fondo. No se eliminó nada.");
        }

        while (!aux.isEmpty()) {
            buque.push(aux.pop());
        }

        if (!encontrado) {
            System.out.println("Operación cancelada: el fondo no coincide con el ID indicado.");
        }
    }

    public static void main(String[] args) {
        System.out.println("SISTEMA DATA-BAY\n");

        //Solicita cantidad de contenedores 
        System.out.print("Ingrese el número de contenedores que llegan: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        Contenedor[] manifiesto = new Contenedor[n];
        double pesoTotalManifiesto = 0.0;

        //Registro de contenedores 
        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Contenedor " + (i + 1) + " ---");
            System.out.print("ID: ");
            String id = sc.nextLine();
            System.out.print("Peso (kg): ");
            double peso = sc.nextDouble();
            System.out.print("Prioridad (1 a 10, donde 10 es máxima): ");
            int prioridad = sc.nextInt();
            sc.nextLine();

            Contenedor c = new Contenedor(id, peso, prioridad);
            manifiesto[i] = c;
            pesoTotalManifiesto += peso;
        }
  

        //Muestra el resumen del manifiesto 
        System.out.println("\n resumen del manifiesto:");
        System.out.println("Total contenedores: " + n);
        System.out.println("Peso total de la carga: " + pesoTotalManifiesto + " kg");

        //Crear patio y ubicar contenedores 
        Contenedor[][] patio = new Contenedor[5][5];
        System.out.println("\n Moviendo contenedores al patio...");
        for (Contenedor c : manifiesto) {
            insertarEnPatio(patio, c);
        }
        mostrarPatio(patio);

       
        if (manifiesto.length > 0) {
            manifiesto[0].pesoTotal(patio);

        }

        //Cola para contenedores de alta prioridad 
        Queue<Contenedor> inspeccion = new LinkedList<>();
        System.out.println("\n🔍 Enviando contenedores de alta prioridad (>=8) a inspección");
        
        //Mover contenedores prioritarios a la cola 
        for (int i = 0; i < patio.length; i++) {
            for (int j = 0; j < patio[i].length; j++) {
                Contenedor c = patio[i][j];
                if (c != null && c.getPrioridad() >= 8) {
                    inspeccion.offer(c);    
                    patio[i][j] = null;      
                    System.out.println("  → " + c.getId() + " (prioridad " + c.getPrioridad() + ") a la cola de inspección");
                }
            }
        }
        System.out.println("Total contenedores en espera de inspección: " + inspeccion.size());
        mostrarPatio(patio);  

        //Pila para el buque 
        Stack<Contenedor> buque = new Stack<>();
        System.out.println("\n Cargando contenedores inspeccionados al buque...");
        while (!inspeccion.isEmpty()) {
            Contenedor c = inspeccion.poll();   
            apilarSeguro(buque, c);
        }

        //Pasar a la cola del buque 
        System.out.println("\n Contenedores en el buque (tope → último en entrar):");
        for (Contenedor c : buque) {
            System.out.println("  " + c);
        }

        System.out.println("\n Simulacion de daño: Eliminar contenedor del fondo del buque");
        System.out.print("Ingrese el ID del contenedor dañado que está en el FONDO: ");
        String idDanado = sc.nextLine();
        eliminarFondo(buque, idDanado);


        //Estado final 
        System.out.println("\n Estado final del buque");
        for (Contenedor c : buque) {
            System.out.println("  " + c);
        }

        sc.close();
    }
}
    
