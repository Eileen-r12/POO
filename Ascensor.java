public class Ascensor {
    private int pisoActual;
    String direccion;
    private boolean enMovimiento;
    boolean puertasAbiertas;

    public Ascensor() {
        this.pisoActual = 2;
        this.direccion = "subiendo";
        this.enMovimiento = false;
        this.puertasAbiertas = false;
    }

    public void subir(){
        this.direccion = "subiendo";
        this.enMovimiento = true;
        this.puertasAbiertas = false;
    }

    public void bajar() {
        this.direccion = "bajando";
        this.enMovimiento = true;
        this.puertasAbiertas = false;
    }
    
    public void detenerse() {
        this.direccion = "detenido";
        this.enMovimiento = false;
        this.puertasAbiertas = true;
    }

    public void abrirPuertas() {
        this.puertasAbiertas = true;
    }
    
    public void cerrarPuertas() {
        this.puertasAbiertas = false;
    }

    public boolean estaEnMovimiento() {
        return this.enMovimiento;  
    }
    
    public int getPisoActual() {
        return this.pisoActual;    
    }

}