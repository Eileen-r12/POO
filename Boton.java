public class Boton {
    protected boolean iluminado;
    protected String tipo;
    protected int numeroPiso;

    public Boton(boolean iluminado, String tipo, int numeroPiso) {
    this.iluminado = iluminado;
    this.tipo = tipo;
    this.numeroPiso = numeroPiso;
    }


    public void iluminar() {
        this.iluminado = true;

    }

    public void apagar() {
        this.iluminado = false;
    }
    
    

    
}
