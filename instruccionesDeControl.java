import java.util.Scanner;

public class instruccionesDeControl {
    int numero=8;
    public static void main(String[] args){
        instruccionesDeControl instruccionesDeControl = new instruccionesDeControl();
        System.out.println(instruccionesDeControl.numero);

        if(instruccionesDeControl.numero<=5){
            System.out.println("Estas reprobado");
        }
        else{
            System.out.println("Aprobaste");
        }
    }
}