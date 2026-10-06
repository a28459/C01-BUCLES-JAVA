import java.util.Random;

public class Main {
    public static void main(String[] args) {
        char[][] tablero = new char[10][10];
        Random rand = new Random();
        
        // Rellenar tablero con 'X'
        for (int fila = 0; fila < tablero.length; fila++) {
            for (int columna = 0; columna < tablero[fila].length; columna++) {
                tablero[fila][columna] = 'X';
            }
        }
        
        // Práctica guiada: Posición aleatoria entre 0 y 9
        int filaMosca = rand.nextInt(10);
        int columnaMosca = rand.nextInt(10);
        tablero[filaMosca][columnaMosca] = 'M';
        
        // Mostrar el tablero
        for (int fila = 0; fila < tablero.length; fila++) {
            for (int columna = 0; columna < tablero[fila].length; columna++) {
                System.out.print(tablero[fila][columna] + " ");
            }
            System.out.println();
        }
    }
}
