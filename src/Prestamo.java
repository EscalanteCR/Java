
public class Prestamo {
    private int id = 0;
    private int cantidadDeMeses =0;
    private String nombrePersona = "";
    private int numeroLibros = 0;

    public int getCantidadDeMeses() {
        return cantidadDeMeses;
    }

    public void setCantidadDeMeses(int cantidadDeMeses) {
        this.cantidadDeMeses = cantidadDeMeses;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public int getNumeroLibros() {
        return numeroLibros;
    }

    public void setNumeroLibros(int numeroLibros) {
        this.numeroLibros = numeroLibros;
    }

    
    
    public void prestamoLibro(int cantidadDeMeses, int id, String nombrePersona, int numeroLibros){
        
    }
    public void devolucionLibro(int cantidadDeMeses, int id, String nombrePersona, int numeroLibros){
        
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}

