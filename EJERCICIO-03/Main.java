public class Main {
    public static void main(String[] args) {
        // Primera parte: 1 -> 3 -> 5 -> 7 -> 9
        System.out.println("--- Recorrido impares (1 a 9) ---");
        for (int i = 1; i <= 9; i += 2) {
            System.out.println(i);
        }

        // Segunda parte: 10 -> 9 -> ... -> 1
        System.out.println("--- Recorrido hacia atras (10 a 1) ---");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
