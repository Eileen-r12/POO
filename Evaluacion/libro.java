package Evaluacion;

public class libro {
    private String nombre;
    private String autor;
    private boolean disponible = true;

    public static void main(String[] args) {}

    public void mostrarInformacion() {
        System.out.println("Nombre:" + nombre);
        System.out.println("autor" + autor);
        System.out.println("disponible" + disponible);
    }
    public void prestar(String persona) {
        if (disponible) {
            disponible = false;
            System.out.println("El libro ha sido prestado a " + persona);
        } else {
            System.out.println("El libro no esta disponible en este momento");
        }
    }
}