import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class pi_överskattning {
    public static void main(String[] args) {
        n();
        BigDecimal a0 = new BigDecimal(2); // Sidlängd för fyrkanten som BigDecimal
        BigDecimal an = calculateSideLength(a0, n);
        
        // Beräkna omkretsen med BigDecimal
        BigDecimal omkrets = new BigDecimal(Math.pow(2, n)).multiply(an);
        
        System.out.println("Sidolängden för en polygon med 4*2^" + n + " sidor är: " + an + " och omkretsen " + omkrets);
    }

    private static int n;

    // Metod för att beräkna sidlängden
    public static BigDecimal calculateSideLength(BigDecimal a0, int n) {
        BigDecimal result = a0;
        BigDecimal two = new BigDecimal(2);
        BigDecimal four = new BigDecimal(4);
        
        for (int i = 0; i < n; i++) {
            // Beräkning av sidlängden med BigDecimal
            result = two.subtract(four.subtract(result.multiply(result)).sqrt(MathContext.DECIMAL128)).sqrt(MathContext.DECIMAL128);
        }
        return result;
    }

    // Metod för att få användarens input för n
    public static int n() {
        Scanner input = new Scanner(System.in);
        System.out.println("Vad ska n vara?");
        n = input.nextInt();
        return n;
    }
}
