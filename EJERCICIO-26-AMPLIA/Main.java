import java.util.Random;

public class Main {
    public static void main(String[] args) {
        char[][] tablero = new char[10][10];
        Random rand = new Random();
        
        // Rellenar la matriz completa con 'X'
        for (int fila = 0; fila < tablero.length; fila++) {
            for (int columna = 0; columna < tablero[fila].length; columna++) {
                tablero[fila][columna] = 'X';
            }
        }
        
        // Ampliación: Generar coordenadas aleatorias únicas (0 a 9) y colocar la 'M'
        int filaAleatoria = rand.nextInt(10);
        int columnaAleatoria = rand.nextInt(10);
        tablero[filaAleatoria][columnaAleatoria] = 'M';
        
        // Mostrar la matriz con formato correcto
        System.out.println("Tablero 10x10 con Mosca Aleatoria en [" + filaAleatoria + "," + columnaAleatoria + "]:");
        for (int fila = 0; fila < tablero.length; fila++) {
            for (int columna = 0; columna < tablero[fila].length; columna++) {
                System.out.print(tablero[fila][columna] + " ");
            }
            System.out.println();
        }
    }
}
