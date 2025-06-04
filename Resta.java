import org.w3c.dom.ls.LSOutput;

public class Resta {
    //Definir un metodo -- Metodo es ka manera de ejecutar una funcion

    //Dentro de los parentesis nosotros podemos poner N cantidad de argumentos
    //Es decir puedes pasar los valores que tu desees
    //+ es para concatenar
    //double almacena numeros reales
    void resta(double a,double b, double c) {
        System.out.println("El valor que llega como paremetro A es: " + a);
        System.out.println("El valor que llega como paremetro B es: " + b);
        System.out.println("El valor que llega como paremetro C es: " + c);
        double valorDeLaOperacion = a-b-c;
        System.out.println("El valor de la operacion es : " + valorDeLaOperacion);
    }
}
