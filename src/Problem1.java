public class Problem1 {

    public static void main(String[] args) {
        int mults = 0;
        for (int i = 0; i < 1000; i++) {
            if (i % 5 == 0 || i % 3 == 0) {
                mults += i;
                System.out.println(i);
            }

        }
        System.out.println(mults);
    }

}
