import javax.swing.JOptionPane; //importa la clase JOptionPane

public class NombreUI {
    public static void main(String[] args) {
        //Pide al usuario su nombre
        String nombre = JOptionPane.showInputDialog("¿Como te llamas?");

        //Crea el mensaje
        String mensaje = String.format("Mucho gusto %s", nombre);

        //Paso final - Ver el resultado en un cuadro de dialogo

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
