import java.util.HashSet;

public class Problem29 {

    private static HashSet<Double> terms = new HashSet<>();

    public static void main(String[] args) {
        for (int a = 2; a <= 100; a++)
            for (int b = 2; b <= 100; b++)
                terms.add(Math.pow(a, b));

        System.out.println(terms.size());
    }
}
