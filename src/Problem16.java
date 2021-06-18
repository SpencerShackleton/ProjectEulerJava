import java.math.BigInteger;

public class Problem16 {

    public static void main(String[] args) {
        long val = EulerUtils.sumIntStringValues(BigInteger.valueOf(2L).pow(1000).toString());
        System.out.println(val);
    }

}
