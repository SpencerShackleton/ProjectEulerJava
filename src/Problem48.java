import java.math.BigInteger;

public class Problem48 {

    public static void main(String[] args) {
        BigInteger modulus = BigInteger.TEN.pow(10);
        BigInteger sum = BigInteger.ZERO;
        for (int i = 1; i <= 1000; i++) sum = sum.add(BigInteger.valueOf(i).modPow(BigInteger.valueOf(i), modulus));
        System.out.println(sum.mod(modulus));
    }
}
