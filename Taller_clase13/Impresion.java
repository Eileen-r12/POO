package Taller_clase13;

public class Impresion {
    private String color;
    private Foto[] fotos;

    public Impresion(String color, Foto[] fotos) {
        this.color = color;
        this.fotos = fotos;

    }

    public String getColor() {
        return color;
    }

    public void imprimirFotos() {
        for (Foto foto : fotos) {
        }
            System.out.println("Imprimir foto en color" + color);
    }

    @Override
    public String toString() {
        return "Impresion{" + "color=" + color + ", fotos=" + fotos + '}';
    }
    
}
