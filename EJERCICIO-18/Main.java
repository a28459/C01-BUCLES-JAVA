public class Main {
    public static void main(String[] args) {
        char[] letras = {'S', 'O', 'L', 'O', 'X'};
        int contador = 0;
        
        for (int i = 0; i < letras.length; i++) {
            if (letras[i] == 'O') {
                contador++;
            }
        }
        
        System.out.println("La letra 'O' aparece " + contador + " veces.");
    }
}
