
public class Examen {

    public static void main(String[] args) {
        Libro libro = new Libro("Hola");
        Libro libro2 = new Libro("Hola",6,Estados.disponible);
        libro.setEstadoLibro(Estados.prestado);
        Estudiante estudiante =new Estudiante();
        estudiante.setTelefono("87786554");
        System.out.println(estudiante.getTelefono());
        System.out.println(libro.getEstadoLibro());
        System.out.println(libro.getNombreLibro());
        System.out.println(libro2.getNombreLibro()+" "+libro2.getId()+" "+libro2.getEstadoLibro());
        Configuracion.TiempoMaximoPrestamo=10;
        
    }
    
}
