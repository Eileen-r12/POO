package Taller_clase13;

public class Foto {

    private String fichero;

    public Foto(String fichero) {
        this.fichero = fichero;
    }

    public String getFichero() {
        return fichero;
        }
    
    public void print() {
        System.out.println("mostrar foto" + fichero);
    }

    @Override
    public String toString() {
        return "Foto{" + "fichero=" + fichero + '}';
}
}