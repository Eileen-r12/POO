public class EjecutarHerencia {
    public static void main(String[] args) {

        Animal lucas = new Perro();
        Animal ceniza = new Gato();

        //hacersonido es la materializacion del polimorfismo, es decir,
        //la capacidad que tiene un metodo de comportarse 
        //segun quien lo llame 

        lucas.hacersonido();
        ceniza.hacersonido();


    }
}