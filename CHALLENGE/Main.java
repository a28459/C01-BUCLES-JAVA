import java.util.Random;

public class Main {
    public static void main(String[] args) {

        char[][] matriz = new char[10][10];
        Random random = new Random();

        final char libreChar = '•';
        final char vaderChar = 'V';
        final char yodaChar = 'Y';
        final char muroChar = '#';

        int numMatriz = 10;
        int numMuro = 5;
        int numVader = 1;
        int numYoda = 1;

        int contYoda = 0;
        int contVader = 0;
        int contMuro = 0;
        int contLibre = 0;


        // Challenge 1
        System.out.println(" ");
        System.out.println("------------ Challenge 1 ---------------");
        System.out.println(" ");

        for (int fila = 0; fila < 10; fila++) {
            for (int columna = 0; columna < 10; columna++) {
                matriz[fila][columna] = libreChar;

            }
        }

        while (numMuro > 0 || numVader > 0 || numYoda > 0) {

            int numRandomX = random.nextInt(10);
            int numRandomY = random.nextInt(10);

            if (matriz[numRandomX][numRandomY] == libreChar) {

                if (numMuro > 0) {
                    matriz[numRandomX][numRandomY] = muroChar;
                    numMuro--;
                }
                else if (numYoda > 0) {
                    matriz[numRandomX][numRandomY] = yodaChar;
                    numYoda--;
                }
                else if (numVader > 0) {
                    matriz[numRandomX][numRandomY] = vaderChar;
                    numVader--;
                }
            }
        }

        for (int fila = 0; fila < 10; fila++) {
            for (int columna = 0; columna < 10; columna++) {
                System.out.print(matriz[fila][columna] + "  ");

            }
            System.out.println(" ");
        }

        // Challenge 2
        System.out.println(" ");
        System.out.println("------------ Challenge 2 ---------------");
        System.out.println(" ");

        for (int fila = 0; fila < 10; fila++) {
            for (int columna = 0; columna < 10; columna++) {
                switch  (matriz[fila][columna]) {
                    case libreChar:
                        contLibre++;
                        break;
                    case vaderChar:
                        contVader++;
                        break;
                    case yodaChar:
                        contYoda++;
                        break;
                    case muroChar:
                        contMuro++;
                        break;
                }
            }
        }

        System.out.println("El numero de Muros es:" + contMuro);
        System.out.println("El numero de Vaders es:" + contVader);
        System.out.println("El numero de Yodas es:" + contYoda);
        System.out.println("El numero de Posiciones Libres es:" + contLibre);
        System.out.println("El numero de Posiciones Totales es:" + (contMuro + contLibre + contYoda + contVader));


        // Challenge 3
        System.out.println(" ");
        System.out.println("------------ Challenge 3 ---------------");
        System.out.println(" ");

        contMuro = 0;
        contVader = 0;
        contYoda = 0;
        contLibre = 0;

        for (int i = 0; i < numMuro + 5; i++) {

            int numRandomX = random.nextInt(9);
            int numRandomY = random.nextInt(9);

            if (matriz[numRandomX][numRandomY] == libreChar) {

                matriz[numRandomX][numRandomY] = muroChar;

            }
            else {
                i--;
            }
        }

        for (int fila = 0; fila < 10; fila++) {
            for (int columna = 0; columna < 10; columna++) {
                System.out.print(matriz[fila][columna] + "  ");
            }
            System.out.println(" ");
        }

        for (int fila = 0; fila < 10; fila++) {
            for (int columna = 0; columna < 10; columna++) {
                switch  (matriz[fila][columna]) {
                    case libreChar:
                        contLibre++;
                        break;
                    case vaderChar:
                        contVader++;
                        break;
                    case yodaChar:
                        contYoda++;
                        break;
                    case muroChar:
                        contMuro++;
                        break;
                }
            }
        }

        System.out.println(" ");
        System.out.println("El numero de Muros es:" + contMuro);
        System.out.println("El numero de Vaders es:" + contVader);
        System.out.println("El numero de Yodas es:" + contYoda);
        System.out.println("El numero de Posiciones Libres es:" + contLibre);
        System.out.println("El numero de Posiciones Totales es:" + (contMuro + contLibre + contYoda + contVader));
    }
}