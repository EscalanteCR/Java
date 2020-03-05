
public class Libro {
    private Estados estadoLibro;
    private int id = 0;
    private String nombreLibro="";
    private String categoria ="";

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
    public void modificarLibro(int id){
        
    }
    public void eliminarLibro(int id){
        
    }
    
    
    public Libro() {
        
    }
    public Libro(String nombreLibro){
        setNombreLibro(nombreLibro);
    }
    public Libro(String nombreLibro, int id, Estados estadoLibro){
        setNombreLibro(nombreLibro);
        this.id=id;
        this.estadoLibro=estadoLibro;
    }

    public Estados getEstadoLibro() {
        return estadoLibro;
    }

    public void setEstadoLibro(Estados estadoLibro) {
        this.estadoLibro = estadoLibro;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        if(!"".equals(nombreLibro)){
            this.nombreLibro = nombreLibro;
        }else{
            System.out.println("El nombre no puede estar vacio");
        }
        
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
