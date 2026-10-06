public class Main {
    public static void main(String[] args) {
        char[] letras = new char[5];
        
        for (int i = 0; i < letras.length; i++) {
            letras[i] = '-';
        }
        
        // Mostrar resultado para comprobar
        for (int i = 0; i < letras.length; i++) {
            System.out.print(letras[i] + " ");
        }
        System.out.println();
    }
}
