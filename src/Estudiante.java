
public class Estudiante {
    private int id = 0;
    private String telefono = "";
    private String nombreEstudiante="";
    private int ahnosEstudiante = 0;

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public int getAhnosEstudiante() {
        return ahnosEstudiante;
    }

    public void setAhnosEstudiante(int ahnosEstudiante) {
        this.ahnosEstudiante = ahnosEstudiante;
    }
    

    public String getTelefono() {
        String nuevoTelefono= "(506) "+telefono.substring(0, 4)+"-"+telefono.substring(4, 8);
        return nuevoTelefono;
    }

    public void setTelefono(String telefono) {
        if (telefono.length() == 8) {
            this.telefono = telefono;
        } else {
            System.out.println("El numero no cumple con los requisitos.");
        }
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void modificarDatos(int id){
        
    }
    public void eliminarEstudiante(int id){
        
    }
    
    
}
