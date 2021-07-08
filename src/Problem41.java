public class Problem41 {

    public static void main(String[] args) {
        int largest = 0;
        for (int i = 1; i <= 10000000; i++) {
            String val = Integer.toString(i);
            if (EulerUtils.isPandigital(val, val.length()) && EulerUtils.isPrime(i)) largest = i;
        }
        System.out.println(largest);
    }
}
