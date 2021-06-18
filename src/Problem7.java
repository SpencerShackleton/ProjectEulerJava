public class Problem7 {

    public static void main(String[] args) {
        int numPrimes = 1;
        int lastPrime = 0;
        for (int i = 2; numPrimes < 10001; i++) {
            if (EulerUtils.isPrime(i)) {
                numPrimes++;
                lastPrime = i;
            }
        }
        System.out.println(lastPrime);
    }
}
