public class Problem39 {

    public static void main(String[] args) {
        int maxSolutions = 0;
        int maxP = 0;
        for (int p = 1; p <= 1000; p++) {
            int solutions = 0;
            for (int c = 1; c < p; c++) {
                for (int a = 1; a < p-c; a++) {
                    int b = p - c - a;
                    if (isValidTriangle(a, b, c)) solutions++;
                }
            }
            if (solutions > maxSolutions) {
                maxSolutions = solutions;
                maxP = p;
            }
        }
        System.out.println(maxP + " " + maxSolutions);
    }

    private static boolean isValidTriangle(int a, int b, int c) {
        return a*a + b*b == c*c;
    }
}
