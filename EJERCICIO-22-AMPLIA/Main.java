public class Main {
    public static void main(String[] args) {
        char[][] sopa = new char[5][5];
        char relleno = '-'; // Carácter de relleno alternativo
        
        // Rellenar toda la matriz con el carácter elegido
        for (int fila = 0; fila < sopa.length; fila++) {
            for (int columna = 0; columna < sopa[fila].length; columna++) {
                sopa[fila][columna] = relleno;
            }
        }
        
        // Ampliación: Colocar SOL en una fila elegida por nosotros (por ejemplo, la última fila [índice 4])
        int filaElegida = 4;
        sopa[filaElegida][0] = 'S';
        sopa[filaElegida][1] = 'O';
        sopa[filaElegida][2] = 'L';
        
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
