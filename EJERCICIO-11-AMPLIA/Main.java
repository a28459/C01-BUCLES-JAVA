public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (i + 1) * 5; // Rellena con 5, 10, 15, ..., 50
        }
        System.out.println("--- Array Relleno ---");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}
