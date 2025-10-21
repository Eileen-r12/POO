public class Instrumentos {
    protected String nombre;
    protected String tipo;

    public Instrumentos(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    
    }
    public void hacersonido(){
        System.out.println("sonido del instrumento");
    }
    public void tocar(){
        System.out.println("Tocar el instrumento");

    }


    
}
