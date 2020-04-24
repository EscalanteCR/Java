
public class Cliente {

    private String telefono = "";
    private String nombreCliente = "";
    public Plantel canchas = new Plantel();

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public Plantel getCanchas() {
        return canchas;
    }

    public void setCanchas(Plantel canchas) {
        this.canchas = canchas;
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

    public void modificarDatos(int id) {

    }

    public void eliminarCliente(int id) {

    }

}
