public class Main {
    public static void main(String[] args) {
        // Reto: Del 1 al 30, cuenta multiplos de 3 y acumula su suma
        int contadorMultiplos = 0;
        int sumaMultiplos = 0;
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0) {
                contadorMultiplos++;
                sumaMultiplos += i;
            }
        }
        System.out.println("Multiplos de 3 encontrados: " + contadorMultiplos);
        System.out.println("Suma total de esos multiplos: " + sumaMultiplos);
    }
}
