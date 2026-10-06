public class Main {
    public static void main(String[] args) {
        // Inicializamos un array con 10 caracteres arbitrarios
        char[] letras = {'A', 'B', 'A', 'C', 'A', 'D', 'A', 'E', 'F', 'A'};
        int contador = 0;
        
        for (int i = 0; i < letras.length; i++) {
            if (letras[i] == 'A') {
                contador++;
            }
        }
        
        System.out.println("La letra 'A' aparece " + contador + " veces.");
    }
}
