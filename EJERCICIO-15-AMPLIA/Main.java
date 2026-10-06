public class Main {
    public static void main(String[] args) {
        int[] numeros = {45, 12, 89, 3, 27, 56, 71, 9, 102, 34}; // Ejemplo de 10 números
        int mayor = numeros[0];
        int menor = numeros[0];
        
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
    }
}
