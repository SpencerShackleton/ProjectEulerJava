import java.math.BigInteger;

public class Problem15 {

    public static void main(String[] args) {
        System.out.println(binomial(40, 20));
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
}
