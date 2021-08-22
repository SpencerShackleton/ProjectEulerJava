import java.math.BigInteger;

public class Problem57 {

    public static void main(String[] args) {
        int count = 0;

        BigInteger numerator = BigInteger.valueOf(3);
        BigInteger denominator = BigInteger.valueOf(2);
        for (int i = 0; i < 1000; i++) {
            BigInteger newDenominator = numerator.add(denominator);
            numerator = newDenominator.add(denominator);
            denominator = newDenominator;
            if (numerator.toString().length() > denominator.toString().length()) count++;
        }
        System.out.println(count);
    }

    public static int numDigits(int n) {
        return Integer.toString(n).length();
    }
}
