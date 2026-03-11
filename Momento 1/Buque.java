public class Buque {
    private String nombre;
    private String origen;
    private int id;


    

    public Buque(String nombre, String origen) {
        this.nombre = nombre;
        this.origen = origen;
        this.id = id;
    }

    

    public int getId() {
        return id;
    }

   public String getNombre() {
    return nombre;
}


public void setNombre(String nombre) {
    this.nombre = nombre;
}


public String getOrigen() {
    return origen;
}


public void setOrigen(String origen) {
    this.origen = origen;
}


 public void setId(int id) {
        this.id = id;
    }



 @Override
 public String toString() {
    return String.format("ID:%d Nombre:%s Origen:%s", id, nombre, origen);
 }

    

    
    


    
}
