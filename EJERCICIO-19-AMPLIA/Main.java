public class Main {
    public static void main(String[] args) {
        char[] palabra = new char[5];
        palabra[0] = 'B';
        palabra[1] = 'U';
        palabra[2] = 'C';
        palabra[3] = 'L';
        palabra[4] = 'E';
        
        System.out.print("Palabra formada: ");
        for (int i = 0; i < palabra.length; i++) {
            System.out.print(palabra[i]);
        }
        System.out.println(); // Salto de línea final
    }
}
