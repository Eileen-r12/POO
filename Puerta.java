public class Puerta {
    protected boolean Abierta;
    

    public Puerta(boolean abierta) {
        this.Abierta = abierta;
        
        
    }

    public Puerta() {
    
    }

    public void abrir() {
    this.Abierta = true;
    }
    public void cerrar() {
    this.Abierta = false;
}
    
}
    

