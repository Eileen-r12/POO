public class ControlAscensor {
    private String listaPisos;
    private Ascensor ascensor;
    private String listaBotones;

    public ControlAscensor(String listaPisos, Ascensor ascensor, String listaBotones) {
        this.listaPisos = listaPisos;
        this.ascensor = ascensor;
        this.listaBotones = listaBotones;
    }
    
    public void procesarSolicitud(int numeroPiso, String tipoBoton) {
        System.out.println("Procesando solicitud piso: " + numeroPiso);
        controlarIluminacionBotones(numeroPiso, true);
        
        ascensor.subir();
    }
    
    public void moverAscensor() {
        ascensor.subir();
        System.out.println("Moviendo ascensor");
    }
    
    public void abrirCerrarPuertas(boolean abrir) {
        if (abrir) {
            ascensor.abrirPuertas();
        } else {
            ascensor.cerrarPuertas();
        }
    }
    
    public void controlarIluminacionBotones(int numeroPiso, boolean encender) {
        if (encender) {
            System.out.println("Encendiendo botón piso: " + numeroPiso);
        } else {
            System.out.println("Apagando botón piso: " + numeroPiso);
        }
    }
}
       
    
   

