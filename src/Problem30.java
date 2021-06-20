public class Problem30 {

    public static void main(String[] args) {
        int totals = 0;
        for (int i = 2; i <= 236196; i++) {
            String val = i + "";
            int total = 0;
            for (char t : val.toCharArray()) {
                int digit = Integer.parseInt(t + "");
                total += Math.pow(digit, 5);
            }
            if (total == i){
                System.out.println(i);
                totals += i;
            }
        }
        System.out.println(totals);
    }
}
