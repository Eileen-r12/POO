import java.util.Stack;

public class explicacionPilas {
    public static void main(String[] args) {
        //Creación del objeto pila de tipo stack
        Stack<String> objPila = new Stack<>();

        //Ingresar elementos a la pila 
        objPila.push("Camilo");
        objPila.push("Daniela");
        objPila.push("Francisco");
        objPila.push("Andrea");
        objPila.push("Dario");

        //Mostrar los elementos de la fila 
        System.out.println(objPila); //[Camilo, Daniela, Francisco, Andrea, Dario]
        
        //Mostrar sin remover la topa de la pila 
        System.out.println("Tope de la pila: " + objPila.peek()); //Dario"

        //Validar si la pila esta vacia 
        System.out.println("Pila vacia: " + objPila.empty()); //false

        //Eliminar el elemento del tope 
        System.out.println(objPila.pop());

        //Posiciones de los elementos con respecto al tope de la pila 
         System.out.println("Posicion: " + objPila.search("Camilo"));
         System.out.println("Posicion: " + objPila.search("Daniela"));
         System.out.println("Posicion: " + objPila.search("Francisco"));
         System.out.println("Posicion: " + objPila.search("Andrea"));

        


    }
    
}
