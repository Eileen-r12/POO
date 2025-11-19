public class PuertaPiso extends Puerta {
    private int piso;
    public PuertaPiso (int piso){
        super();
        this.piso = piso;
    }

    @Override
    public void abrir() {
    this.Abierta = true;
    System.out.println("Puerta del piso "+ piso + " boton encendido");
    }

    @Override
    public void cerrar() {
    this.Abierta = false;
    System.out.println("Cerrando puertas del piso "+ piso);
  }

}
