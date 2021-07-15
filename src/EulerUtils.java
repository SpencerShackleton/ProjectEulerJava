import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;

public class EulerUtils {

    public static String readFile(String name) {
        try {
            return new BufferedReader(new FileReader(name)).readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2 | n == 3) return true;
        if (n % 6 == 0 || n % 6 == 2 || n % 6 == 4 || n % 6 == 3) return false;
        for (int i = 2; i < Math.ceil(Math.sqrt(n)) + 1; i++)
            if (n % i == 0)
                return false;
        return true;
    }

    public static ArrayList<Integer> getFirstMillionPrimes() {
        ArrayList<Integer> primes = new ArrayList<>();
        primes.add(2);
        for (int i = 1; i < 1000000; i+=2) if (isPrime(i)) primes.add(i);
        return primes;
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

    public static boolean isPalindrome(String n) {
        int split = (int) Math.ceil(n.length()/2d);
        String front = n.length() % 2 == 0 ? n.substring(0,split) : n.substring(0,split-1);
        String back = reverse(n.substring(split));
        return front.equals(back);
    }

    public static String reverse(String start) {
        int len = start.length();
        char[] reversed = new char[len];
        for (int i = 0; i < len; i++) {
            reversed[i] = start.charAt(len-i-1);
        }
        return new String(reversed);
    }

    public static String convertNumToBaseN(double num, double base, double maxDigits) {
        return convertToBase(num, base, maxDigits, "");
    }

    private static String convertToBase(double n, double base, double currentPower, String currentReturn) {

        if (currentPower == -1) return currentReturn;

        double mod = Math.pow(base, currentPower);
        int goesInto = (int) Math.floor(n/mod);
        double remainder = goesInto > 0 ? n % mod : n;

        return convertToBase(remainder, base, currentPower - 1, currentReturn += Integer.toString(goesInto));
    }

    public static String removeLeadingZeroes(String n) {
        String noZeroes = "";
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) != '0') {
                noZeroes = n.substring(i);
                break;
            }
        }
        return noZeroes;
    }

    public static boolean pandigitalZeroToNine(String num) {
        for (int i = 0; i <= 9; i++)
            if (!num.contains(i+""))
                return false;
        return true;
    }

    public static boolean isPandigital(String num, int n) {
        if (num.length() != n) return false;
        for (int i = 1; i <= n; i++)
            if (!num.contains(i+""))
                return false;
        return true;
    }

    public static boolean isPandigital(String num) {
        return isPandigital(num, 9);
    }
}
