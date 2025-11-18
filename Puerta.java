public class Puerta {
    private boolean abierta;
    

    public Puerta(boolean abierta) {
        this.abierta = abierta;
        
        
    }

    public void abrir() {
    this.abierta = true;
    }
    public void cerrar() {
    this.abierta = false;
}
    public boolean estaAbierta() {
    return this.abierta;
}
 
}
    
    

