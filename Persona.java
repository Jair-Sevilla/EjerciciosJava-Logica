public class Persona {
    //Todas las personas pueden hacer muchas cosas, las personas tienen nombre edad
    //Etc, asi que vamos a simular algunas actividades mediante metodos.

    //Una buena practica es declarar variables en la parte mas alta del codigo

    int edad = 65;
    int temperatura = 15;
    int fiebre = 39;
    int hora = 9;

    void mayorDeEdad(){
        if(edad>= 18){
            System.out.println("Eres mayor de edad =) " + edad);
        }
        else {
            System.out.println("Eres un menor de edad =( " + edad);
        }
    }
    void descansar(boolean estaCansado){
        if (estaCansado){
            System.out.println("Vete a dormir");
        }
        else {
            System.out.println("Sigue practicando codigo...");
        }
    }
    //1
    void adultoMayor(){
    if (edad>= 60){
        System.out.println("Es un adulto mayor con "+edad +" años");
    }
    else {
        System.out.println("Aun no es adulto mayor con "+edad +" años");
    }
    }
    //2
    void ropaCalorOFrio(){
        if (temperatura<20){
            System.out.println("Ponte un abrigo que hay "+temperatura+" grados");
        }
        else{
            System.out.println("Ponte ropa ligera que hay "+temperatura+" grados");
        }
    }
    //3
    void hambre(boolean tieneHambre){
        if (tieneHambre){
            System.out.println("Come algo, no te vayas a desmayar");
        }
        else {
            System.out.println("Toma agua mejor");
        }
    }
    //4
    void fiebre1(){
        if(fiebre>=38){
            System.out.println("Su temperatura es "+fiebre+" grados, toma paracetamol");
        }
        else if (fiebre<=35){
            System.out.println("Su temperatura es "+fiebre+" grados, tiene la temperatura baja");
        }
        else{
            System.out.println("Su temperatura es "+fiebre+" grados, tiene la temperatura normal");
    }
    }
    //5
    void levantarse(){
        if(hora>8){
            System.out.println("Vas tarde a la escuela");
        }
        else{
            System.out.println("Vas temprano a la escuela");
        }
    }
}
