public class Problem36 {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 1000000; i++) {
            if (EulerUtils.isPalindrome(Integer.toString(i)) &&
                    EulerUtils.isPalindrome(toBinary(i)))
                sum += i;
        }
        System.out.println(sum);
    }

    // maxDigits set to 20 as we are looking for n < 1,000,000
    private static String toBinary(int n) {
        String binary = EulerUtils.convertNumToBaseN(n, 2, 20);
        return EulerUtils.removeLeadingZeroes(binary);
    }

}
