public class Puerta {
    private boolean abierta;
    private boolean seguridadPuerta;
    private int tiempoAbierta;

    public Puerta(boolean abierta, boolean seguridadPuerta) {
        this.abierta = abierta;
        this.seguridadPuerta = seguridadPuerta;
        this.tiempoAbierta = tiempoAbierta;
    }

    public void abrir() {
    this.abierta = true;
    this.tiempoAbierta = 0; 
}
    public void cerrar() {
    this.abierta = false;
}
    public boolean estaAbierta() {
    return this.abierta;
}
public boolean comprobarSeguridad() {
    return !this.seguridadPuerta; 
}
    }
    

