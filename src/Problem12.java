public class Problem12 {

    public static void main(String[] args) {
        int triangle = 0;
        int i = 1;
        while (i > 0) {
            triangle += i;
            if (EulerUtils.numOfFactors(triangle) > 500) break;
            i++;
        }
        System.out.println(triangle);
    }

}
