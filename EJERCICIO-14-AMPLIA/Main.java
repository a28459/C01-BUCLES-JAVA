public class Main {
    public static void main(String[] args) {
        int[] numeros = {12, 7, 23, 8, 14, 3, 90, 55}; // Ejemplo de 8 números
        int suma = 0;
        int pares = 0;
        int impares = 0;
        
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        
        System.out.println("Suma total: " + suma);
        System.out.println("Cantidad de números pares: " + pares);
        System.out.println("Cantidad de números impares: " + impares);
    }
}
