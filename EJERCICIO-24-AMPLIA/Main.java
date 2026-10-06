public class Main {
    public static void main(String[] args) {
        char[][] tableroGrande = new char[10][10];
        
        // Rellenar la matriz 10x10 con 'X'
        for (int fila = 0; fila < tableroGrande.length; fila++) {
            for (int columna = 0; columna < tableroGrande[fila].length; columna++) {
                tableroGrande[fila][columna] = 'X';
            }
        }
        
        // Ampliación: Mostrar la matriz 10x10 completa por pantalla
        System.out.println("Matriz 10x10:");
        for (int fila = 0; fila < tableroGrande.length; fila++) {
            for (int columna = 0; columna < tableroGrande[fila].length; columna++) {
                System.out.print(tableroGrande[fila][columna] + " ");
            }
            System.out.println();
        }
    }
}
