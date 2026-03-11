public class EjecutarEstudiantes {
    public static void main(String args[]){
        Estudiantes[] e = new Estudiantes[5];

        e[0] = new Estudiantes(1120, "Humanidades", "Johana Ramirez", 20);
        e[1] = new Estudiantes(3050, "Ingles", "Sandra Castaño", 25);
        e[2] = new Estudiantes(1250, "Automatas y lenguajes formales", "Andres Valencia", 15);
        e[3] = new Estudiantes(2340, "Fisica mecanica", "Segundo Alberto Castro", 30);
        e[4] = new Estudiantes(3050, "estructuras de datos", "Jhon Cano", 27);
        e[1] = new Estudiantes(3050, "Calculo integral", "Segundo Alberto Castro", 32);


        int suma = 0;
        for (int i = 0; i < e.length; i++) {
            suma += e[i]. getCantidadEstudiantes(); 
        }
        System.out.println("El total de estudiantes es: " + suma);
    }
    
}
