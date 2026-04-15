/*
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Ejecutar {
    private static List<Buque> buques = new ArrayList<>();
    private static List<Contenedor> contenedores = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        generarContenedoresAleatorios(10);

        int opcion;
        do {
            mostrarMenuPrincipal();
            opcion = leerEntero("Seleccione una opción: ");
            switch (opcion) {
                case 1:
                    menuRegistroBuques();
                    break;
                case 2:
                    menuRegistroContenedores();
                    break;
                case 3:
                    mostrarPesoTotal();
                    break;
                case 4:
                    listarPorOrigen();
                    break;
                case 5:
                    System.out.println("Cerrando aplicación");
                    break;
                default:
                    System.out.println("Opción inválida, intente de nuevo.");
            }
        } while (opcion != 5);
    }

    private static void mostrarMenuPrincipal() {
       
        System.out.println("Menú");
        System.out.println("1. Registro de buques");
        System.out.println("2. Registro de contenedores");
        System.out.println("3. Mostrar peso total de los contenedores");
        System.out.println("4. Listar por origen de los contenedores");
        System.out.println("5. Cerrar aplicación");
        
    }

    private static void menuRegistroBuques() {
        System.out.println("\n-- Registro de Buques --");
        String nombre = leerCadena("Nombre del buque: ");
        String origen = leerCadena("País de origen: ");
        int id = buques.size() + 1;
        Buque b = new Buque(nombre, origen);
        b.setId(id);
        buques.add(b);
        System.out.printf("Buque registrado: id=%d, nombre=%s, origen=%s%n", b.getId(), b.getNombre(), b.getOrigen());
    }

    private static void menuRegistroContenedores() {
        System.out.println("\n-- Registro de Contenedores --");
        int id = contenedores.size() + 1;
        String origen = leerCadena("País de origen: ");
        int peso = leerEntero("Peso (kg): ");
        Contenedor c = new Contenedor(id, origen, peso);
        contenedores.add(c);
        System.out.printf("Contenedor registrado: id=%d, origen=%s, peso=%dkg%n", c.getId(), c.getPais_origen(), c.getPeso());
    }

    private static void mostrarPesoTotal() {
        int total = 0;
        for (Contenedor c : contenedores) {
            total += c.getPeso();
        }
        System.out.printf("\nPeso total de los contenedores: %d kg%n", total);
    }

    private static void listarPorOrigen() {
        if (contenedores.isEmpty()) {
            System.out.println("\nNo hay contenedores registrados.");
            return;
        }
        Map<String, List<Contenedor>> agrupado = new HashMap<>();
        for (Contenedor c : contenedores) {
            agrupado.computeIfAbsent(c.getPais_origen(), k -> new ArrayList<>()).add(c);
        }
       
        }


    private static int leerEntero(String mensaje) {
        System.out.print(mensaje);
        while (!sc.hasNextInt()) {
            System.out.print("Valor numérico inválido. " + mensaje);
            sc.next();
        }
        int valor = sc.nextInt();
        sc.nextLine(); 
        return valor;
    }

     
    private static void generarContenedoresAleatorios(int cantidad) {
        String[] paises = {"China", "Eslovaquia", "Brasil", "India", "Alemania", "Colombia", "Canadá"};
        java.util.Random rand = new java.util.Random();
        for (int i = 0; i < cantidad; i++) {
            int id = contenedores.size() + 1;
            String origen = paises[rand.nextInt(paises.length)];
            int peso = 100 + rand.nextInt(900); 
            Contenedor c = new Contenedor(id, origen, peso);
            contenedores.add(c);
        }
        System.out.println(cantidad + " contenedores aleatorios generados. (id/origen/peso)");
    }

    private static String leerCadena(String mensaje) {
        System.out.print(mensaje);
        return sc.nextLine();
    }
}
    /*  */