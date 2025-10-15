
public class Persona {
     
    private String nombre;
    private String apellido;
    private int edad;
    private double peso;
    private double altura;
    private int telefono;
    private String nacionalidad;

    public Persona(String nombre, String apellido, int edad, double peso, double altura, int telefono, String nacionalidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.telefono = telefono;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public int getEdad() {
        return edad;
    }
    public double getPeso() {
        return peso;
    }
    public double getAltura() {
        return altura;
    }
    public int getTelefono() {
        return telefono;
    }
    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String toString() {
        return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", peso=" + peso
                + ", altura=" + altura + ", telefono=" + telefono + ", nacionalidad=" + nacionalidad + "]";
    }

    public String saludar () {
        return "Hola, mi nombre es " + nombre;
    }
    public boolean esMayorDeEdad() {
        return edad >= 18;
    }
    public double calcularIMC() {
        return peso / (altura * altura);
    }
        


}
    

