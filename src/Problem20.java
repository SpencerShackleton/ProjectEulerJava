import java.math.BigInteger;

public class Problem20 {

    public static void main(String[] args) {
        System.out.println(sumString(fact(100).toString()));
    }

    public static BigInteger fact(int n) {
        BigInteger res = BigInteger.ONE;
        for(int i = 2; i <= n; i++) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }

    public static long sumString(String n) {
        long res = 0;
        for(int i = 0; i < n.length(); i++) {
            res += Integer.parseInt(n.substring(i, i+1));
        }
        return res;
    }
}
