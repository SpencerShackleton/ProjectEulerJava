public class Problem12 {

    public static void main(String[] args) {
        int triangle = 0;
        int i = 1;
        while (i > 0) {
            triangle += i;
            if (numOfFactors(triangle) > 500) break;
            i++;
        }
        System.out.println(triangle);
    }

    public static int numOfFactors(int n) {
        int factors = 0;
        for (int i = 1; i <= Math.floor(Math.sqrt(n)); i++) {
            if (n % i == 0){
                factors++;
            }

        }
        return factors * 2;
    }
}
