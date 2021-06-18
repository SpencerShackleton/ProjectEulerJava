public class Problem21 {

    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 10000; i++) {
            int b = sumOfFactors(i);
            int a = sumOfFactors(b);
            if (a == i && a != b)
                count += a + b;
        }
        System.out.println(count/2);
    }

    public static int sumOfFactors(int n) {
        int factors = 0;
        for (int i = 1; i <= n/2+1; i++)
            if (n % i == 0)
                factors += i;
        return factors;
    }
}
