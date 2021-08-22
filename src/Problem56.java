import java.math.BigInteger;

public class Problem56 {

    public static void main(String[] args) {
        int max = 0;
        for (int a = 0; a < 100; a++) {
            for (int b = 0; b < 100; b++) {
                BigInteger ab = BigInteger.valueOf(a).pow(b);
                int digits = EulerUtils.sumBigIntDigits(ab);
                if (digits > max) max = digits;
            }
        }
        System.out.println(max);
    }

}

/*
A googol (10^100) is a massive number: one followed by one-hundred zeros; 100^100 is almost unimaginably large: one followed by two-hundred zeros. Despite their size, the sum of the digits in each number is only 1.

Considering natural numbers of the form, a^b, where a, b < 100, what is the maximum digital sum?
 */