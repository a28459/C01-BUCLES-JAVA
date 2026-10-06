public class Main {
    public static void main(String[] args) {
        // Reto: Bucle reparado que muestra 10 -> 1 sin ser infinito
        int numero = 10;
        while (numero >= 1) {
            System.out.println(numero);
            numero--; // Reparado: Se resta en lugar de sumar
        }
    }
}
