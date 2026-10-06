import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = 0;
        // Práctica Guiada: Salida con -1
        while (numero != -1) {
            System.out.print("Introduce un numero (-1 para salir): ");
            numero = teclado.nextInt();
        }
        teclado.close();
    }
}
