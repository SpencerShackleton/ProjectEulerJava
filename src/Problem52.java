import java.util.Arrays;

public class Problem52 {

    public static void main(String[] args) {
        int i = 1;
        while (true) {
            int a1 = sorted(i);
            int a2 = sorted(i*2);
            int a3 = sorted(i*3);
            int a4 = sorted(i*4);
            int a5 = sorted(i*5);
            int a6 = sorted(i*6);
            if (a1 == a2 && a2 == a3 && a3 == a4 && a4 == a5 && a5 == a6) {
                System.out.println(i);
                break;
            }
            i++;
        }
    }

    public static int sorted(int n) {
        char[] chars = Integer.toString(n).toCharArray();
        Arrays.sort(chars);
        return Integer.parseInt(new String(chars));
    }
}
