public class Main {
    public static void main(String[] args) {
        char[][] tablero = new char[2][4];
        
        // Rellenar la matriz
        for (int fila = 0; fila < tablero.length; fila++) {
            for (int columna = 0; columna < tablero[fila].length; columna++) {
                tablero[fila][columna] = '#';
            }
        }
        
        // Mostrar la matriz para comprobar el resultado
        for (int fila = 0; fila < tablero.length; fila++) {
            for (int columna = 0; columna < tablero[fila].length; columna++) {
                System.out.print(tablero[fila][columna] + " ");
            }
            System.out.println();
        }
    }
}
