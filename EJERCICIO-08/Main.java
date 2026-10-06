public class Main {
    public static void main(String[] args) {
        // Práctica Guiada: Sumar del 1 al 10 y contar pares del 1 al 10
        int suma = 0;
        int contadorPares = 0;
        for (int i = 1; i <= 10; i++) {
            suma += i;
            if (i % 2 == 0) {
                contadorPares++;
            }
        }
        System.out.println("Suma del 1 al 10: " + suma);
        System.out.println("Cantidad de pares del 1 al 10: " + contadorPares);
    }
}
