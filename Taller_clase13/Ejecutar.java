package Taller_clase13;

import java.util.Date;

public class Ejecutar {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(1107856789, "Maddison Debedout");
        Producto producto1 = new Producto(2003);
        Producto producto2 = new Producto(4506);
        Producto[] productosPedido = {producto1, producto2};

        Pedido pedido = new Pedido(cliente, productosPedido, new Date(), 105692274);
        System.out.println(pedido);
        
    
        Foto foto1 = new Foto("Paisaje");
        Foto foto2 = new Foto("Retrato");
        
    
        Foto[] fotosImpresion = {foto1, foto2};
        Impresion impresion = new Impresion("Color", fotosImpresion);
        System.out.println(impresion);
        

        Camara camara = new Camara("Canon", "G7 Mark II");
        System.out.println(camara);
        
    
        foto1.print();
        foto2.print();
    }
}
