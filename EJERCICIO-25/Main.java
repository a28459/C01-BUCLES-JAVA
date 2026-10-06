public class Main {
    public static void main(String[] args) {
        char[][] tablero = new char[10][10];
        
        // Rellenar tablero con 'X'
        for (int fila = 0; fila < tablero.length; fila++) {
            for (int columna = 0; columna < tablero[fila].length; columna++) {
                tablero[fila][columna] = 'X';
            }
        }
        
        // Práctica guiada: Mover la mosca a [2,3] (Fila 2, Columna 3)
        tablero[2][3] = 'M';
        
        // Mostrar el tablero resultante
        for (int fila = 0; fila < tablero.length; fila++) {
            for (int columna = 0; columna < tablero[fila].length; columna++) {
                System.out.print(tablero[fila][columna] + " ");
            }
            System.out.println();
        }
    }
}
