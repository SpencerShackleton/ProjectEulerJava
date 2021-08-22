import java.math.BigInteger;

public class Problem53 {

    public static void main(String[] args) {
        int amt = 0;
        for (int n = 1; n <= 100; n++)
            for (int r = 1; r <= 100; r++)
                if (nPickR(n, r).doubleValue() > 1000000D) amt++;
        System.out.println(amt);
    }

    public static BigInteger nPickR(int n, int r) {
        BigInteger t = EulerUtils.fact(n);
        BigInteger b = EulerUtils.fact(r).multiply(EulerUtils.fact(n - r));
        return t.divide(b);
    }
}
