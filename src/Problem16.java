import java.math.BigInteger;

public class Problem16 {

    public static void main(String[] args) {
        long val = sumString(BigInteger.valueOf(2L).pow(1000).toString());
        System.out.println(val);
    }

    public static long sumString(String n) {
        long res = 0;
        for(int i = 0; i < n.length(); i++) {
            res += Integer.parseInt(n.substring(i, i+1));
        }
        return res;
    }

}
