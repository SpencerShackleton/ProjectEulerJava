public class Problem43 {

    public static void main(String[] args) {
        long sum = 0;
        for (long i = 1406357289; i <= 9876543210L; i += 6) {

            if (EulerUtils.pandigitalZeroToNine(Long.toString(i))) {
                if (check(i)) sum += i;
                //System.out.println(i);
            }
        }
        System.out.println(sum);
    }

    public static final int[] divisors = new int[] {2, 3, 5, 7, 11, 13, 17};

    public static boolean check(long i) {
        for (int j = 1; j <= 7; j++) {
            if (Integer.parseInt(Long.toString(i).substring(j, j + 3)) % divisors[j-1] != 0) return false;
        }
        return true;
    }
}
