public class Main {
    public static void main(String[] args) {
        // Creamos un array con 8 valores (por ejemplo, del 10 al 80)
        int[] valores = {10, 20, 30, 40, 50, 60, 70, 80};
        
        System.out.println("Valores desde la última posición hasta la primera:");
        for (int i = valores.length - 1; i >= 0; i--) {
            System.out.println(valores[i]);
        }
    }
}
