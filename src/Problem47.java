import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Problem47 {

    public static void main(String[] args) {
        final int amountToSearch = 4;
        ArrayList<Integer> primes = EulerUtils.getPrimesUnderN(1000000);
        ArrayList<Integer> lastConsecutive = new ArrayList<>();
        for (int i = 1; i < 100000000; i++) {
            Set<Integer> primeFactors = new HashSet<>();
            int remainder = i;
            foundFactor : while (true) {
                if (remainder == 1) break;
                for (int p1 : primes) {
                    if (p1 > i/2D +1) break;
                    if (remainder % p1 != 0) continue;
                    remainder = remainder / p1;
                    primeFactors.add(p1);
                    continue foundFactor;
                }
                break;
            }
            if (remainder == 1 && primeFactors.size() == amountToSearch) {
                lastConsecutive.add(i);
                if (lastConsecutive.size() == amountToSearch) {
                    System.out.println(i - amountToSearch + 1);
                    break;
                }
            } else lastConsecutive.clear();
        }
    }


}
