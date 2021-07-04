public class Problem37 {

    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        int i = 8;
        while (count < 11) {
            if (allPrime(Integer.toString(i), true) && allPrime(Integer.toString(i), false)) {
                sum += i;
                count++;
            }
            i++;
        }
        System.out.println(sum);
    }

    private static boolean allPrime(String n, boolean leftToRight) {
        if (!EulerUtils.isPrime(Integer.parseInt(n))) return false;
        if (n.length() == 1) return true;
        String next = leftToRight ? n.substring(1) : n.substring(0, n.length() - 1);
        return allPrime(next, leftToRight);
    }
}
