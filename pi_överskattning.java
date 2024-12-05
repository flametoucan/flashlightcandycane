import java.util.Scanner;


public class pi_överskattning {
    public static void main(String[] args) {
        n();
        double a0 = 2; // Sidlängd för fyrkanten

        double an = calculateSideLength(a0, n);
        System.out.println("Sidolängden för en polygon med 4 * 2^" + n + " sidor är: " + an);
    }
    
    private static int n;

    public static double calculateSideLength(double a0, int n) {
        double result = a0;
        for (int i = 0; i < n; i++) {
            result = Math.sqrt(2 - Math.sqrt(4 - result * result));
        }
        return result;
    }
    public static int n() {
        Scanner input = new Scanner(System.in);
        System.out.println("Vad ska n vara?");
        n = input.nextInt();
        return n;
    }
}