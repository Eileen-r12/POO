public class PuertaAscensor extends Puerta {
    private int pisoActual;
    public PuertaAscensor (int pisoActual) {
        super();
        this.pisoActual = pisoActual;

    }
    @Override
    public void abrir() {
        this.Abierta = true;
        System.out.println("Puerta del ascensor en piso "+ pisoActual + " abierta");
    }
    @Override 
    public void cerrar() {
        this.Abierta = false;
        System.out.println("Cerrando puertas del ascensor en piso "+ pisoActual);
    }
}
