public class Contenedor {
    private int id;
    private String pais_origen;
    private int peso;
    public Contenedor(int id, String pais_origen, int peso) {
        this.id = id;
        this.pais_origen = pais_origen;
        this.peso = peso;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getPais_origen() {
        return pais_origen;
    }
    public void setPais_origen(String pais_origen) {
        this.pais_origen = pais_origen;
    }
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    @Override
    public String toString() {
        // representation compacta para mostrar en consola
        return String.format("ID:%d Origen:%s Peso:%dkg", id, pais_origen, peso);
    }

    

    
}
