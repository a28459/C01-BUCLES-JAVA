public class Main {
    public static void main(String[] args) {
        char[][] sopa = new char[5][5];
        
        // Rellenar toda la matriz con 'A'
        for (int fila = 0; fila < sopa.length; fila++) {
            for (int columna = 0; columna < sopa[fila].length; columna++) {
                sopa[fila][columna] = 'A';
            }
        }
        
        // Práctica guiada: Mover SOL a la fila índice 0
        sopa[0][0] = 'S';
        sopa[0][1] = 'O';
        sopa[0][2] = 'L';
        
        // Mostrar la matriz para comprobar el resultado
        for (int fila = 0; fila < sopa.length; fila++) {
            for (int columna = 0; columna < sopa[fila].length; columna++) {
                System.out.print(sopa[fila][columna] + " ");
            }
            System.out.println();
        }
    }
}
