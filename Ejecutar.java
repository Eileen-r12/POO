import java.util.Scanner;

public class Ejecutar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Ascensor ascensor = new Ascensor();
        ControlAscensor control = new ControlAscensor("", ascensor, "");
        
        System.out.println("Bienvenido al Sistema de Ascensor");
        System.out.println("El ascensor está en el piso " + ascensor.getPisoActual());
        
        System.out.print("\n¿Desde qué piso llamas al ascensor? ");
        int pisoLlamada = scanner.nextInt();
        BotonAfuera botonLlamada = new BotonAfuera(false, pisoLlamada, false, null, false);
        
        System.out.println("\nLlamando al ascensor al piso " + pisoLlamada + "...");
        
        botonLlamada.iluminar();
        System.out.println("Botón de llamada en piso " + pisoLlamada + " se enciende");
        
        control.procesarSolicitud(pisoLlamada, "afuera");
        
        System.out.println("El ascensor está en el piso " + ascensor.getPisoActual());
        if (pisoLlamada > ascensor.getPisoActual()) {
            System.out.println("El ascensor sube hacia el piso " + pisoLlamada);
            ascensor.subir();
        } else if (pisoLlamada < ascensor.getPisoActual()) {
            System.out.println("El ascensor baja hacia el piso " + pisoLlamada);
            ascensor.bajar();
        }

        System.out.println("El ascensor ha llegado al piso " + pisoLlamada);
        ascensor.detenerse();
        
        botonLlamada.apagar();
        System.out.println("Botón de llamada en piso " + pisoLlamada + " se apaga");
        
        System.out.println("Abriendo puertas...");
        PuertaPiso puertaPiso = new PuertaPiso(pisoLlamada);
        puertaPiso.abrir();
        ascensor.abrirPuertas();

        System.out.print("\n¿A qué piso deseas ir? ");
        int pisoDestino = scanner.nextInt();
    
        BotonAscensor botonDestino = new BotonAscensor("Ascensor", pisoDestino);
    
        System.out.println("Botón " + pisoDestino + " se enciende");
        
        control.procesarSolicitud(pisoDestino, "adentro");
        
        System.out.println("Cerrando puertas...");
        puertaPiso.cerrar();
        ascensor.cerrarPuertas();

        System.out.println("\nDirigiéndose al piso " + pisoDestino + "...");
        if (pisoDestino > pisoLlamada) {
            System.out.println("El ascensor sube hacia el piso " + pisoDestino);
            ascensor.subir();
        } else if (pisoDestino < pisoLlamada) {
            System.out.println("El ascensor baja hacia el piso " + pisoDestino);
            ascensor.bajar();
        }
        
        System.out.println("El ascensor llegó al piso " + pisoDestino);
        ascensor.detenerse();
        System.out.println("Botón " + pisoDestino + " se apaga");
        
        System.out.println("Abriendo puertas");
        PuertaAscensor puertaAscensor = new PuertaAscensor(pisoDestino);
        puertaAscensor.abrir();
        ascensor.abrirPuertas();
        
        System.out.println("\n¡Has llegado!");
        
        scanner.close();
    }
}
