import java.util.ArrayList;

public class Problem45 {

    public static void main(String[] args) {
        long i = 150;
        while (true) {
            i++;
            long hexagonal = 2L*i*i-i;
            long pentagonal = 1;
            long j = i;
            while (pentagonal < hexagonal) {
                pentagonal = (3L*j*j-j)/2L;
                j++;
            }
            if (pentagonal != hexagonal) continue;
            long triangle = 1;
            long k = j;
            while (triangle < pentagonal) {
                triangle = (k*k+k)/2L;
                k++;
            }
            if (triangle != pentagonal) continue;
            System.out.println(triangle);
            break;
        }

    }
}
