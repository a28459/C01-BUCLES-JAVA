public class Main {
    public static void main(String[] args) {
        char[][] sopa = new char[5][5];
        
        // Rellenar toda la matriz con 'X'
        for (int fila = 0; fila < sopa.length; fila++) {
            for (int columna = 0; columna < sopa[fila].length; columna++) {
                sopa[fila][columna] = 'X';
            }
        }
        
        // Práctica guiada: Colocar 'SOL' en las tres primeras posiciones de la segunda fila (fila índice 1)
        sopa[1][0] = 'S';
        sopa[1][1] = 'O';
        sopa[1][2] = 'L';
        
        // Mostrar la matriz para comprobar el resultado
        for (int fila = 0; fila < sopa.length; fila++) {
            for (int columna = 0; columna < sopa[fila].length; columna++) {
                System.out.print(sopa[fila][columna] + " ");
            }
            System.out.println();
        }
    }
}
