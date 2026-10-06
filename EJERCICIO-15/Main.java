public class Main {
    public static void main(String[] args) {
        int[] datos = {7, 12, 4, 19, 8};
        int menor = datos[0];
        
        for (int i = 1; i < datos.length; i++) {
            if (datos[i] < menor) {
                menor = datos[i];
            }
        }
        
        System.out.println("El número menor es: " + menor);
    }
}
