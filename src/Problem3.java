public class Problem3 {

    public static void main(String[] args) {
        int res = 0;
        long SEARCH = 600851475143L;
        for (int i = 3; i < Math.sqrt(SEARCH); i += 2) {
            if (SEARCH % i == 0 && isPrime(i)) {
                res = i;
            }
        }
        System.out.println(res);
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
