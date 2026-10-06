public class Main {
    public static void main(String[] args) {
        int[] notas = {7, 5, 9, 4, 8};
        int aprobados = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 5) {
                aprobados++;
            }
        }
        System.out.println("Cantidad de notas aprobadas: " + aprobados);
    }
}
