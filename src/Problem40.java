import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;

public class Problem40 {

    public static void main(String[] args) {
        ArrayList<Long> numberArray = new ArrayList<>();
        long lastSum = 1;
        for (int i = 0; i <= 6; i++) {
            double n = Math.pow(10, i);
            double addToLast = 9 * i * n/10;
            lastSum += addToLast;
            numberArray.add(lastSum);
        }
        int total = 1;
        for (long val : numberArray) {
            System.out.println(val);
            total *= val;
        }
        //System.out.println(total);
    }

    private static int firstDigitOf(int n) {
        return Integer.parseInt(Integer.toString(n).charAt(0) + "");
    }
}
