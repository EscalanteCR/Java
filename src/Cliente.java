
public class Cliente {

    private int id = 0;
    private String telefono = "";
    private String nombreCliente = "";

    public String getNombreEstudiante() {
        return nombreCliente;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreCliente = nombreEstudiante;
    }
    
    public String getTelefono() {
        String nuevoTelefono = "(506) " + telefono.substring(0, 4) + "-" + telefono.substring(4, 8);
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

    public void modificarDatos(int id) {

    }

    public void eliminarCliente(int id) {

    }

}
