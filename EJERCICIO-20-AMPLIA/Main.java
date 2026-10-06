public class Main {
    public static void main(String[] args) {
        char[][] matriz = new char[5][5];
        
        // Rellenar la matriz 5x5 con 'X'
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                matriz[fila][columna] = 'X';
            }
        }
        
        // Mostrar la matriz en formato rejilla
        System.out.println("Matriz 5x5:");
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                System.out.print(matriz[fila][columna] + " ");
            }
            System.out.println();
        }
    }
}
