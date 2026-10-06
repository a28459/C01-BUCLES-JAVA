public class Main {
    public static void main(String[] args) {
        char[][] sopa = new char[5][5];
        
        // Rellenar toda la matriz con caracteres de relleno (ej. '.')
        for (int fila = 0; fila < sopa.length; fila++) {
            for (int columna = 0; columna < sopa[fila].length; columna++) {
                sopa[fila][columna] = '.';
            }
        }
        
        // Incluir una palabra (ej. 'BUCLE' en la fila índice 2)
        sopa[2][0] = 'B';
        sopa[2][1] = 'U';
        sopa[2][2] = 'C';
        sopa[2][3] = 'L';
        sopa[2][4] = 'E';
        
        // Ampliación: Mostrar la sopa completa formateada
        System.out.println("Sopa de letras 5x5:");
        for (int fila = 0; fila < sopa.length; fila++) {
            for (int columna = 0; columna < sopa[fila].length; columna++) {
                System.out.print(sopa[fila][columna] + " ");
            }
            System.out.println(); // Salto de línea clave para mantener el formato de cuadrícula
        }
    }
}
