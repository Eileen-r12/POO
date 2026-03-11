public class EjecutarMoto {
    public static void main(String[] args) {
    
    Moto[] m = new Moto[8];
    
        //Creación de los objetos de tipo Moto y almacenados en cada posición del arreglo
        m[0] = new Moto(2026, "AKT Turing", "Negra", 125.0, 1250.0);
        m[1] = new Moto(2025, "kawasaki Ninja", "verde", 400.0, 25000.0);
        m[2] = new Moto(2026, "Honda", "Rojo", 350.0, 4000.0);
        m[3] = new Moto(2027, "Honda C90", "DoradoNegro", 90.0, 10000.0);    
        m[4] = new Moto(2027, "Sym Automatica", "Blanco", 150.0, 4500.0); 
        m[5] = new Moto(2027, "Suzuki", "Azul", 150.0, 2350.0); 
        m[6] = new Moto(2027, "BMW", "Gris", 90.0, 40000.0); 
        m[7] = new Moto(2027, "Harley Davidson", "Negro", 1800.0, 35000.0);  

        //Operaciones con los objetos del arreglo 

        //Obtener el promedio de los modelos de las motos del arreglo 
        double promedio = 0.0;
        int suma = 0;
        for (int i = 0; i < m.length; i++) {
            suma += m[i]. getModelo();
            
        }
        System.out.println("El promedio de los modelos de las motos del arreglo es: " + (suma / m.length));
        String cad = "";
        //Obtener las motos que puedo comprar con un presupuesto de 2000 dólares.
        for (int i = 0; i < m.length; i++) {
            if(m[i]. getPrecio() <= 20000.0){
                cad += m[i].getMarca() + " " + m[i].getPrecio()+ " \n";

            }
        }
        System.out.println("Las motos que puedo comprar con 20000.0US son: " + cad);
    }
    
}
