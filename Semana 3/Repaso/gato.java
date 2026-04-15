public class gato {

   private String Raza;
    private int edad;
    String color;

public gato(String raza, int edad, String color) {
    this.Raza = raza;
    this.edad = edad;
    this.color = color;

}
public String getRaza() {
    return Raza;

    
}
public void setRaza(String raza) {
    this.Raza = raza;
}
public int getEdad() {
    return edad;
}
public void setEdad(int edad) {
    this.edad = edad;
}
public String getColor() {
    return color;
}
public void setColor(String color) {
    this.color = color;
}

@Override
public String toString() {
    return "gato [Raza=" + Raza + ", edad=" + edad + ", color=" + color + "]";
}
}