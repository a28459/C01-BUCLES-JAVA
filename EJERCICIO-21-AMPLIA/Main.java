public class Main {
    public static void main(String[] args) {
        char[][] sopa = new char[5][5];
        
        // Rellenar toda la matriz con 'X'
        for (int fila = 0; fila < sopa.length; fila++) {
            for (int columna = 0; columna < sopa[fila].length; columna++) {
                sopa[fila][columna] = 'X';
            }
        }
        
        // Ampliación: Colocar una palabra de 5 letras (ej. 'PERRO') en la tercera fila (fila índice 2)
        sopa[2][0] = 'P';
        sopa[2][1] = 'E';
        sopa[2][2] = 'R';
        sopa[2][3] = 'R';
        sopa[2][4] = 'O';
        
        // Mostrar la matriz resultante
        System.out.println("Sopa de letras (Ampliación):");
        for (int fila = 0; fila < sopa.length; fila++) {
            for (int columna = 0; columna < sopa[fila].length; columna++) {
                System.out.print(sopa[fila][columna] + " ");
            }
            System.out.println();
        }
    }
}
