package Taller_clase13;

public class Producto {

    private int numero;
    
     public Producto(int numero) {
        this.numero = numero;
    }
    @Override
    public String toString() {
        return "Producto{" + "numero=" + numero + '}';
    }
}