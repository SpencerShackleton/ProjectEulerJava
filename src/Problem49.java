import java.util.ArrayList;
import java.util.Arrays;

public class Problem49 {

    public static void main(String[] args) {
        ArrayList<Integer> startingList = new ArrayList<>();
        for (int i = 1001; i <= 9999; i+=2)
            if (EulerUtils.isPrime(i)) startingList.add(i);

        for (int start : startingList) {
            fail : for (int i = 2; i <= 5000; i++) {
                int[] sequence = new int[] {start, start + i, start + i*2};
                if (!identical(sequence[0], sequence[1], sequence[2])) continue;
                for (int num : sequence)
                    if (!startingList.contains(num)) continue fail;
                System.out.println(sequence[0] + " " + sequence[1] + " " + sequence[2]);
            }
        }
    }

    public static boolean identical(int a, int b, int c) {
        char[] a1 = Integer.toString(a).toCharArray();
        char[] b1 = Integer.toString(b).toCharArray();
        char[] c1 = Integer.toString(c).toCharArray();

        Arrays.sort(a1);
        Arrays.sort(b1);
        Arrays.sort(c1);

        return Arrays.equals(a1, b1) && Arrays.equals(b1, c1);
    }
}
