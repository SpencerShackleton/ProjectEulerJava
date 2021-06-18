public class Problem27 {

    public static void main(String[] args) {
        int mostConsPrimes = 0;
        int maxA = 0;
        int maxB = 0;

        for (int a = -999; a <= 1000; a++) {
            for (int b = -1000; b <= 1000; b++) {
                if (!EulerUtils.isPrime(b)) continue;
                int consecutivePrimes = numberOfPrimes(a, b);

                if (consecutivePrimes > mostConsPrimes) {
                    mostConsPrimes = consecutivePrimes;
                    maxA = a;
                    maxB = b;
                }
            }
        }
        System.out.println(maxA + " " + maxB + " " + mostConsPrimes);
    }

    private static int numberOfPrimes(int a, int b) {
        for (int i = 0; ; i++)
            if (!EulerUtils.isPrime(magicFunc(i, a, b)))
                return i;
    }

    private static int magicFunc(int n, int a, int b) {
        return n*n + a*n + b;
    }
}
