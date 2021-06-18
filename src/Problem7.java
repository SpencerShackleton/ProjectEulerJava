public class Problem7 {

    public static void main(String[] args) {
        int numPrimes = 1;
        int lastPrime = 0;
        for (int i = 2; numPrimes < 10001; i++) {
            if (isPrime(i)) {
//                System.out.println(i);
                numPrimes++;
                lastPrime = i;
            }
        }
        System.out.println(lastPrime);
    }

    public static boolean isPrime(double n) {
        //if (n >= 3 && n % 2 == 0) return false;
        for (double i = 2; i < Math.ceil(Math.sqrt(n)) + 1; i++) {
            if (n % i == 0.0)
                return false;
        }
        return true;
    }
}
