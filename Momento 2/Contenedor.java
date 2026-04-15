
public class Contenedor {
    private String id;
    private double peso;
    private int prioridad;


    //Constructor 
    public Contenedor(String id, double peso, int prioridad) {
        this.id = id;
        this.peso = peso;
        this.prioridad = prioridad;
    }
    //Devuelve el id del contenedor 
    public String getId() {
        return id;
    }
    //Modifica el id del contenedor 
    public void setId(String id) {
        this.id = id;
    }
    //Devuelve el peso del contenedor 
    public double getPeso() {
        return peso;
    }
    //Modifica el peso del contenedor  
    public void setPeso(double peso) {
        this.peso = peso;
    }
    //Devuelve la prioridad del contenedor 
    public int getPrioridad() {
        return prioridad;
    }
    //Modifica la prioridad del contenedor
    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }
    
    //Método que calcula el peso total de los contenedores 
    public void pesoTotal(Contenedor[][] matrizPatio) {
        double pesoTotal = 0.0;
        
        //Recorre toda la matriz 
        for (int i = 0; i < matrizPatio.length; i++) {
            for (int j = 0; j < matrizPatio[i].length; j++) {
                if (matrizPatio[i][j] != null) {
                    pesoTotal += matrizPatio[i][j].getPeso();
                }
            }
        }
        System.out.println("El peso total de los contenedores en el patio es: " + pesoTotal + " kg");
    }

    @Override
    public String toString() {
        return "Contenedor{id='" + id + "', peso=" + peso + ", prioridad=" + prioridad + "}";
    }
}