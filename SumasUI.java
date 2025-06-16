import javax.swing.JOptionPane; //importa la clase JOptionPane
public class SumasUI {
    public static void main(String[] args) {
        /* En esta actividad vas a tener que capturar dos tipos de numeros a traves de los cuadros de dialogo
        y finalmente mostraras el resultado
         */
        String numero1 = JOptionPane.showInputDialog("Suma: \n Escribe un numero:");
        double n1 = Integer.parseInt(numero1);
        String numero2 = JOptionPane.showInputDialog("Escribe otro numero:");
        double n2 = Integer.parseInt(numero2);
        double suma= n1+n2;
        JOptionPane.showMessageDialog(null, "La suma es: " + suma);
    }
}
