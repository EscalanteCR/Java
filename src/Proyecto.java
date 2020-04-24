
import javax.swing.JOptionPane;

public class Proyecto {

    public static int contador = 0;

    public static void main(String[] args) {

        Cliente cliente[] = new Cliente[15];
        Plantel cancha[] = new Plantel[24];

        int opcion;

        cliente = inicializarArreglo(cliente);
        cancha = inicializarArregloC(cancha);
        System.out.println(cancha[2].getEstado());

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("1. Apartar Cancha\n"
                    + "2. Modificar hora de Cancha\n"
                    + "3. Cancelar Cancha\n"
                    + "0. Salir"));
            switch (opcion) {
                case 1:
                    cliente = apartarCancha(cliente, cancha);
                    break;
                case 2:
                    cliente = modificarCancha(cliente, cancha);
                    break;
                case 3:
                    cliente = cancelarCancha(cliente, cancha);
                    break;
            }
        } while (opcion != 0);

    }

    public static Cliente[] inicializarArreglo(Cliente[] arreglo) {
        for (int i = 0; i < 15; i++) {

            arreglo[i] = new Cliente();

        }
        return arreglo;
    }
    public static Plantel[] inicializarArregloC(Plantel[] arreglo) {
        for (int i = 0; i < 24; i++) {
            arreglo[i] = new Plantel();

            arreglo[i].setEstado(Estados.disponible);

        }
        return arreglo;
    }
    
     

    public static Cliente[] apartarCancha(Cliente[] arreglo, Plantel[] arreglo1) {
        String opcion;

        do {
            boolean pasa;
            String nombre = "";
            String telefono = "";
            do {
                nombre = JOptionPane.showInputDialog("Ingrese su nombre.");
                if (nombre.equals("")) {
                    JOptionPane.showMessageDialog(null, "El espacio no puede estar vacio", "Error", JOptionPane.ERROR_MESSAGE);
                    pasa = false;
                } else {
                    pasa = true;
                }
            } while (pasa == false);

            do {
                telefono = JOptionPane.showInputDialog("Ingrese su telefono.");
                if (telefono.equals("")) {
                    JOptionPane.showMessageDialog(null, "El espacio no puede estar vacio", "Error", JOptionPane.ERROR_MESSAGE);
                    pasa = false;
                } else {
                    pasa = true;
                }
            } while (pasa == false);

            arreglo[contador].setNombreCliente(nombre);
            arreglo[contador].setTelefono(telefono);
            asignarCancha(arreglo1);
            

            System.out.println(contador);
            opcion = JOptionPane.showInputDialog("¿Desea apartar otra cancha?");

        } while (opcion.equals("SI") || opcion.equals("si") || opcion.equals("Si") || opcion.equals(""));

        return arreglo;

    }

    public static void asignarCancha(Plantel[] arreglo) {
        boolean pasa;
        int hora = 0;
        do {
            try {
                hora = Integer.parseInt(JOptionPane.showInputDialog("Ingrese hora a la que desea apartar la cancha."));
                if (hora > 21 || hora < 12) {
                    pasa = false;
                    JOptionPane.showMessageDialog(null, "En esa hora no hay canchas disponibles.", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    pasa = true;
                }
            } catch (NumberFormatException e) {
                pasa = false;
                JOptionPane.showMessageDialog(null, "El dato digitado no es correcto.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } while (pasa == false);
        if (verficarCancha(hora, arreglo) == 0) {
            arreglo[hora].setEstado(Estados.prestado);
            contador += 1;
            JOptionPane.showMessageDialog(null, "La cancha se ha apartado.");
        } else{
            JOptionPane.showMessageDialog(null, "La cancha esta prestada", "Error", JOptionPane.ERROR_MESSAGE);
        }

        

    }

    public static int verficarCancha(int hora, Plantel[] arreglo) {

        if (arreglo[hora].getEstado().equals(Estados.prestado)) {
            return -1;
        } else {
            return 0;
        }

    }

    public static Cliente[] modificarCancha(Cliente[] arreglo, Plantel[] arreglo1) {
        String opcion;
        boolean pasa;
        int hora = 0;
        int hora1 = 0;
        
        do {
            do {
                try {
                    hora = Integer.parseInt(JOptionPane.showInputDialog("Ingrese hora a la que desea modificar la cancha."));
                    if (hora > 21 || hora < 12) {
                        pasa = false;
                        JOptionPane.showMessageDialog(null, "En esa hora no hay canchas apartadas, no hay horario.", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        pasa = true;
                    }
                } catch (NumberFormatException e) {
                    pasa = false;
                    JOptionPane.showMessageDialog(null, "El dato digitado no es correcto.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } while (pasa == false);
            if (verficarCancha(hora, arreglo1) == -1) {
                do {
                    try {
                        hora1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nueva hora a la que desea modificar la cancha."));
                        if (hora1 > 21 || hora1 < 12) {
                            pasa = false;
                            JOptionPane.showMessageDialog(null, "En esa hora no hay canchas, no hay horario.", "Error", JOptionPane.ERROR_MESSAGE);
                        } else {
                            pasa = true;
                        }
                    } catch (NumberFormatException e) {
                        pasa = false;
                        JOptionPane.showMessageDialog(null, "El dato digitado no es correcto.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } while (pasa == false);
                arreglo1[hora].setEstado(Estados.disponible);
                arreglo1[hora1].setEstado(Estados.prestado);
                JOptionPane.showMessageDialog(null, "La cancha se ha modificado.");
            } else {
                JOptionPane.showMessageDialog(null, "La cancha no esta apartada", "Error", JOptionPane.ERROR_MESSAGE);
            }

            opcion = JOptionPane.showInputDialog("¿Desea Modificar la hora de otra cancha?");

        } while (opcion.equals("SI") || opcion.equals("si") || opcion.equals("Si") || opcion.equals(""));

        return arreglo;

    }

    public static Cliente[] cancelarCancha(Cliente[] arreglo, Plantel[] arreglo1) {
        String opcion;
        int hora = 0;
        boolean pasa;
        do {
            do {
            try {
                hora = Integer.parseInt(JOptionPane.showInputDialog("Ingrese hora a la que desea cancelar la cancha."));
                if (hora > 21 || hora < 12) {
                    pasa = false;
                    JOptionPane.showMessageDialog(null, "En esa hora no hay canchas apartadas, no hay horario.", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    pasa = true;
                }
            } catch (NumberFormatException e) {
                pasa = false;
                JOptionPane.showMessageDialog(null, "El dato digitado no es correcto.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } while (pasa == false);
        if (verficarCancha(hora, arreglo1) == -1) {
            arreglo1[hora].setEstado(Estados.disponible);
            JOptionPane.showMessageDialog(null, "La cancha se ha cancelado.");
        } else {
            JOptionPane.showMessageDialog(null, "La cancha no esta apartada", "Error", JOptionPane.ERROR_MESSAGE);

        }

        

            opcion = JOptionPane.showInputDialog("¿Desea cancelar otra cancha?");

        } while (opcion.equals("SI") || opcion.equals("si") || opcion.equals("Si") || opcion.equals(""));

        return arreglo;

    }
}
