import java.util.Scanner;

public class CajaRegistradora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nombres = new String[10];
        double[] precios = new double[10];
        int productos = 0;
        double total = 0;

        while (productos < 10) {
            System.out.print("Nombre del producto: ");
            String nombre = scanner.nextLine();
            if (nombre.equalsIgnoreCase("salir")) {
                break;
            }
            System.out.print("Precio del producto: ");
            String precioTexto = scanner.nextLine().replace(",", ".");
            double precio = Double.parseDouble(precioTexto);

            nombres[productos] = nombre;
            precios[productos] = precio;
            total += precio;
            productos++;
        }
        System.out.println("_____________ Lista de artículos _____________");
        for (int i = 0; i < productos; i++) {
            System.out.printf("%d. %s - $%.2f\n", (i + 1), nombres[i], precios[i]);
        }
        System.out.println("_______________________________________");
        if (total > 500) {
            double descuento = total * 0.10;
            double totalConDescuento = total - descuento;
            System.out.printf("Subtotal: $%.2f\n", total);
            System.out.printf("Descuento (10%%): -$%.2f\n", descuento);
            System.out.printf("Total a pagar: $%.2f\n", totalConDescuento);
        } else {
            System.out.printf("Total a pagar: $%.2f\n", total);
        }
    }
}

