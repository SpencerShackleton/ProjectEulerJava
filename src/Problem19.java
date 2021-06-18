public class Problem19 {

    public static void main(String[] args) {
        int count = 0;
        for (int y = 1901; y <= 2000; y++) {
            for (int m = 1; m <= 12; m++) {
                if (dayOfWeek(y, m, 1) == 0.0) count++;
            }
        }
        System.out.println(count);
    }

    public static int dayOfWeek(int y, int m, int d) {
        d+=m<3?y--:y-2;
        return (int) ((Math.floor(23D*m/9D)+d+4+Math.floor(y/4D)
                        - Math.floor(y/100D)+Math.floor(y/400D)) % 7);
    }
}
