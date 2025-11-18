public class BotonAfuera {
    private boolean iluminado;
    private String direccion;
    private int numeroPiso;


    public BotonAfuera(boolean iluminado, String direccion, int numeroPiso) {
        this.iluminado = iluminado;
        this.direccion = direccion;
        this.numeroPiso = numeroPiso;
    }

    public void iluminar() {
        this.iluminado = true;
    }
    
    public void apagar() {
        this.iluminado = false;
    }
    
    public boolean estaIluminado() {
        return this.iluminado;
    }

     public String getDireccion() {
        return this.direccion;
    }
    
    public int getNumeroPiso() {
        return this.numeroPiso;
    }
}

