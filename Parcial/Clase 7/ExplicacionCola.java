import java.util.LinkedList;
import java.util.Queue;
public class ExplicacionCola {
    public static void main(String[] args) {

        Queue<Integer> objCola = new LinkedList<>();

        //Agregar elementos a la cola (add(e), 
        objCola.add(29);
        objCola.add(16);
        objCola.offer(10);
        objCola.offer(34);

        //Agregar elementos a la cola 
        System.out.println(objCola); //[29, 16, 10, 34]

        //Mostrar la cabeza de la cola 
        System.out.println("Cabeza de la cola: " + objCola.element());
        System.out.println("Cabeza de la cola (peek): " + objCola.peek());
        
    
}
}
