public class Main {
    public static void main(String[] args) {
        char[][] tablero = new char[10][10];
        
        // Rellenar tablero con 'X'
        for (int fila = 0; fila < tablero.length; fila++) {
            for (int columna = 0; columna < tablero[fila].length; columna++) {
                tablero[fila][columna] = 'X';
            }
        }
        
        // Ampliación: Colocar una única 'M' en una posición elegida (ej. fila 7, columna 5)
        int miFila = 7;
        int miColumna = 5;
        tablero[miFila][miColumna] = 'M';
        
        // Mostrar el tablero completo por pantalla
        System.out.println("Tablero 10x10 con la Mosca en [" + miFila + "," + miColumna + "]:");
        for (int fila = 0; fila < tablero.length; fila++) {
            for (int columna = 0; columna < tablero[fila].length; columna++) {
                System.out.print(tablero[fila][columna] + " ");
            }
            System.out.println();
        }
    }
}
