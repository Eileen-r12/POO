public class Estudiantes {
    
    private int id;
    private String NombreCurso;
    private String Profesor;
    private int cantidadEstudiantes;
    public Estudiantes(int id, String nombreCurso, String profesor, int cantidadEstudiantes) {
        this.id = id;
        NombreCurso = nombreCurso;
        Profesor = profesor;
        this.cantidadEstudiantes = cantidadEstudiantes;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombreCurso() {
        return NombreCurso;
    }
    public void setNombreCurso(String nombreCurso) {
        NombreCurso = nombreCurso;
    }
    public String getProfesor() {
        return Profesor;
    }
    public void setProfesor(String profesor) {
        Profesor = profesor;
    }
    public int getCantidadEstudiantes() {
        return cantidadEstudiantes;
    }
    public void setCantidadEstudiantes(int cantidadEstudiantes) {
        this.cantidadEstudiantes = cantidadEstudiantes;
    }
    @Override
    public String toString() {
        return "Estudiantes [id=" + id + ", NombreCurso=" + NombreCurso + ", Profesor=" + Profesor
                + ", cantidadEstudiantes=" + cantidadEstudiantes + "]";
    }
    
    

}
