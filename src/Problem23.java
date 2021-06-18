import java.util.ArrayList;

public class Problem23 {

    /*
        Perfect Number - sumOfFactors is equal to the n
        Deficient Number - sumOfFactors is less than n
        Abundant Number - sumOfFactors is greater than n
     */

    private static boolean[] abundantList = new boolean[28124];

    public static void main(String[] args) {
        for (int i = 1; i <= 28123; i++)
            abundantList[i] = isAbundant(i);

        int totalSum = 0;
        for (int i = 1; i <= 28123; i++) {
            if (!canBeSumOfAbundant(i)) totalSum += i;
        }
        System.out.println(totalSum);
    }

    private static boolean canBeSumOfAbundant(int n) {
        for (int i = 0; i <= n; i++)
            if (abundantList[i] && abundantList[n-i])
                return true;
        return false;
    }

    private static boolean isAbundant(int n) {
        return EulerUtils.sumOfFactors(n) > n;
    }

}
