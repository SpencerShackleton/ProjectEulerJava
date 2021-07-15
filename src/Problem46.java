import java.util.ArrayList;

public class Problem46 {

    public static void main(String[] args) {
        ArrayList<Integer> primes = new ArrayList<>();
        for (int i = 1; i < 1000000; i+=2)
            if (EulerUtils.isPrime(i)) primes.add(i);

        int target = 9;
        end : while (true) {
            nextTarget : for (int prime : primes) {
                if (EulerUtils.isPrime(target)) break;
                if (prime >= target) break end;
                for (int i = 1; i < target-prime; i++) {
                    int add = 2*i*i;
                    if (prime + add == target) break nextTarget;
                }
            }
            target += 2;
        }

        System.out.println(target);
    }
}
