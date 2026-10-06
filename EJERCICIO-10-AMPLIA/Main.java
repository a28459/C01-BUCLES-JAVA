public class Main {
    public static void main(String[] args) {
        int[] notas = {9, 3, 5, 8, 2}; // 5 notas propias
        int aprobados = 0;
        int suspensos = 0;
        int suma = 0;
        System.out.println("--- Recorrido de notas ---");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota en posicion " + i + ": " + notas[i]);
            suma += notas[i];
            if (notas[i] >= 5) {
                aprobados++;
            } else {
                suspensos++;
            }
        }
        System.out.println("Suma total: " + suma);
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Suspensos: " + suspensos);
    }
}
