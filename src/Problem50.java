import java.util.ArrayList;

public class Problem50 {

    public static void main(String[] args) {
        ArrayList<Integer> primes = EulerUtils.getPrimesUnderN(1000000);
        int consecutivePrime = 0;
        int consecutivePrimeCount = 0;
        for (int i = 0; i <= primes.size(); i++) {
            int num = 0;
            for (int j = i; j < primes.size(); j++) {
                num += primes.get(j);
                if (num > 1000000) break;
                int count = j-i+1;
                if (count > consecutivePrimeCount && primes.contains(num)) {
                    consecutivePrimeCount = count;
                    consecutivePrime = num;
                }
            }
        }
        System.out.println(consecutivePrime + " " + consecutivePrimeCount);
    }
}
