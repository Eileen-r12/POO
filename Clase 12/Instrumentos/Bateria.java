 public class Bateria extends Instrumentos {

    public Bateria(String nombre, String tipo){
        super(nombre, tipo);
    }

    public void hacersonido() {
        System.out.println("bum bum crash");
    }

    public void tocar() {
        System.out.println("Tocar la bateria");
    }

}
