public class Problem28 {

    //Theres a smarter way to do this but I didn't find out the right equation
    public static void main(String[] args) {
        int SPIRALS = 1001;
        int num = 1;
        int sum = -3;
        for (int spiral = 1; spiral <= SPIRALS; spiral += 2) {
            for (int n = 0; n < 4; n++) {
                num += spiral - 1;
                sum += num;
            }
        }
        System.out.println(sum);
    }
}
