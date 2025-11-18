public class BotonAscensor {
    private boolean iluminado;
    private String tipo;
    private int numeroPiso;

    public BotonAscensor(boolean iluminado, String tipo, int numeroPiso) {
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
    
    public boolean estaIluminado() {
    return this.iluminado; 
}

    public String getTipo() {
    return this.tipo;
}
    public int getNumeroPiso() {
    return this.numeroPiso;
}

  
}
