import java.math.BigInteger;

public class Problem34 {

    public static void main(String[] args) {
        int res = 0;
        for (int i = 10; i < 100000; i++) {
            String val = Integer.toString(i);
            BigInteger sum = BigInteger.ZERO;
            for (int j = 0; j < val.length(); j++) {
                sum = sum.add(EulerUtils.fact(Integer.parseInt(val.substring(j, j+1))));
            }
            if (sum.intValue() == i) res += sum.intValue();
        }
        System.out.println(res);
    }
}
