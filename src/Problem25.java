import java.math.BigInteger;

public class Problem25 {

    public static void main(String[] args) {
        int count = 2;
        BigInteger lastLastFib = BigInteger.ONE;
        BigInteger lastFib = BigInteger.ONE;
        while (String.valueOf(lastFib).length() < 1000) {
            BigInteger tempLast = lastLastFib;
            lastLastFib = lastFib;
            lastFib = lastFib.add(tempLast);
            count++;
        }
        System.out.println(count);
    }
}
