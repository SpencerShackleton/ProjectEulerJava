import java.math.BigInteger;

public class EulerUtils {

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 2; i < Math.ceil(Math.sqrt(n)) + 1; i++)
            if (n % i == 0)
                return false;
        return true;
    }

    public static int numOfFactors(int n) {
        int factors = 0;
        for (int i = 1; i <= Math.floor(Math.sqrt(n)); i++)
            if (n % i == 0)
                factors++;
        return factors * 2;
    }

    public static int sumOfFactors(int n) {
        int sum = 1;
        int end = (int) Math.sqrt(n);
        for (int i = 2; i <= end; i++) {
            if (n % i == 0)
                sum += i + n / i;
        }
        if (end * end == n)
            sum -= end;
        return sum;
    }

    public static boolean isPerfectSquare(int n) {
        return (Math.sqrt(n) == Math.round(Math.sqrt(n)));
    }

    public static BigInteger binomial(int n, int k) {
        BigInteger top = fact(n);
        BigInteger bottom = fact(k).multiply(fact(n-k));
        return top.divide(bottom);
    }

    public static BigInteger fact(int n) {
        BigInteger res = BigInteger.ONE;
        for(int i = 2; i <= n; i++) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }

    public static long sumIntStringValues(String n) {
        long res = 0;
        for(int i = 0; i < n.length(); i++) {
            res += Integer.parseInt(n.substring(i, i+1));
        }
        return res;
    }

    public static boolean isBaseN(double val, int n) {
        double log = logBaseN(val, n);
        return log == (int) log;
    }

    public static double logBaseN(double val, int n) {
        return Math.log(val) / Math.log(n);
    }
}
