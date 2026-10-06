public class Main {
    public static void main(String[] args) {
        char[] asteriscos = new char[10];
        
        // Rellenar el array completo
        for (int i = 0; i < asteriscos.length; i++) {
            asteriscos[i] = '*';
        }
        
        // Mostrar el contenido completo
        System.out.println("Contenido del array:");
        for (int i = 0; i < asteriscos.length; i++) {
            System.out.print(asteriscos[i] + " ");
        }
        System.out.println();
    }
}
