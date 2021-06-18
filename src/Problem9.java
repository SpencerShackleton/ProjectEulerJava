public class Problem9 {

    public static void main(String[] args) {
        int tripletAns = 0;
        for (int a = 2; tripletAns == 0; a++) {
            for (int b = 2; b < a; b++) {
                int cSquared = a*a + b*b;
                if (isSquare(cSquared)) {
                    int c = (int) Math.sqrt(cSquared);
                    if (a + b + c == 1000)
                        tripletAns = a*b*c;
                }
            }
        }
        System.out.println(tripletAns);
    }

    public static boolean isSquare(int n) {
        return (Math.sqrt(n) == Math.round(Math.sqrt(n)));
    }
}
