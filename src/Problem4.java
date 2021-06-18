public class Problem4 {

    public static void main(String[] args) {
        int res = 0;
        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                int product = i * j;
                if (product < res) continue;
                if (isPalindrome(product))
                    res = product;
            }
        }
        System.out.println(res);
    }

    public static boolean isPalindrome(int n) {
        double hunThousand = Math.floor((n % 1000000D) / 100000D);
        double tenThousand = Math.floor((n % 100000D) / 10000D);
        double thousand = Math.floor((n % 10000D) / 1000D);
        double hundred = Math.floor((n % 1000D) / 100D);
        double ten = Math.floor((n % 100D) / 10D);
        double one = Math.floor((n % 10D));

        return hunThousand == one &&
                tenThousand == ten &&
                thousand == hundred;
    }
}
