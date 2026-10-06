public class Main {
    public static void main(String[] args) {
        char[][] tablero = new char[6][6];
        
        // Rellenar la matriz 6x6 (se rellenan 36 posiciones en total)
        for (int fila = 0; fila < tablero.length; fila++) {
            for (int columna = 0; columna < tablero[fila].length; columna++) {
                tablero[fila][columna] = 'X';
            }
        }
        
        // Mostrar el tablero para comprobar el resultado
        for (int fila = 0; fila < tablero.length; fila++) {
            for (int columna = 0; columna < tablero[fila].length; columna++) {
                System.out.print(tablero[fila][columna] + " ");
            }
            System.out.println();
        }
    }
}
