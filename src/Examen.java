
public class Examen {

    public static void main(String[] args) {
        Canchas canchas = new Canchas();
        canchas.setEstadaCancha(Estados.prestado);
        Cliente cliente =new Cliente();
        cliente.setTelefono("72792617");
        System.out.println(cliente.getTelefono());
        Configuracion.TiempoMaximoPrestamo="10pm";
        
    }
    
}
