public class Problem21 {

    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 10000; i++) {
            int b = EulerUtils.sumOfFactors(i);
            int a = EulerUtils.sumOfFactors(b);
            if (a == i && a != b)
                count += a + b;
        }
        System.out.println(count/2);
    }
}
