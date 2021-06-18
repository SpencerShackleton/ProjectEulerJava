public class Problem5 {

    public static void main(String[] args) {
        int res = 0;
        for (int i = 0; res == 0; i += 20) {

            if (div(i)) res = i;
        }
        System.out.println(res);
    }
    public static boolean div(int n) {
        for (int i = 1; i < 20; i++) {
            if (n % i != 0) return false;
        }
        return true;
    }
}
