public class Problem10 {

    public static void main(String[] args) {
        long sum = 2;
        for(int i = 2; i < 2000000; i++) {
            if (EulerUtils.isPrime(i)) sum += i;
        }
        System.out.println(sum);
    }

}
