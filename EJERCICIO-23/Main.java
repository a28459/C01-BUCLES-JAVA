public class Main {
    public static void main(String[] args) {
        char[][] matriz = {
            {'1', '2', '3'},
            {'4', '5', '6'},
            {'7', '8', '9'}
        };
        
        // Práctica guiada: Recorrer e imprimir en forma de cuadrícula
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                System.out.print(matriz[fila][columna] + " ");
            }
            System.out.println(); // Salto de línea al terminar cada fila
        }
    }
}
