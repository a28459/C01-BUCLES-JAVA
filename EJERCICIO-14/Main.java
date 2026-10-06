public class Main {
    public static void main(String[] args) {
        int[] notas = {4, 7, 5, 3, 9}; // Ejemplo de 5 notas
        int suma = 0;
        int aprobados = 0;
        int suspensos = 0;
        
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
            if (notas[i] >= 5) {
                aprobados++;
            } else {
                suspensos++;
            }
        }
        
        System.out.println("Suma total de notas: " + suma);
        System.out.println("Cantidad de aprobados: " + aprobados);
        System.out.println("Cantidad de suspensos: " + suspensos);
    }
}
