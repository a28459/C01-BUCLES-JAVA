import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int edad = -1;
        // Reto: Pide edades hasta introducir 0
        while (edad != 0) {
            System.out.print("Introduce una edad (0 para salir): ");
            edad = teclado.nextInt();
        }
        teclado.close();
    }
}
