public class Problem10 {

    public static void main(String[] args) {
        long sum = 2;
        for(int i = 2; i < 2000000; i++) {
            if (isPrime(i)) sum += i;
        }
        System.out.println(sum);
    }

    public static boolean isPrime(int n) {
        if (n % 2 == 0) return false;
        for (int i = 2; i < Math.ceil(Math.sqrt(n)) + 1; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
