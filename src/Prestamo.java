
public class Prestamo {
    private int id = 0;
    private String nombrePersona = "";
    private String hora = "";
    private String dia = "";
    private String Telefono = "";


    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

 
    
    public void prestamoCancha(String hora, int id, String dia, String telefono, String nombrePersona){
        
    }
    public void devolucionLibro(String hora, int id, String dia, String telefono, String nombrePersona){
        
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
    
    
    
}

