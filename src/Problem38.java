public class Problem38 {

    public static void main(String[] args) {
        for (int n = 10000; n >= 9; n--) {
            int pandigital = Integer.parseInt(maxPandigitalConcat(n));
            if (pandigital != -1) {
                System.out.println(pandigital + " " + n);
                break;
            }
        }
    }

    private static String maxPandigitalConcat(int n) {
        return maxPandigitalConcatRec(n, 1, new StringBuilder());
    }

    private static String maxPandigitalConcatRec(int n, int i, StringBuilder previous) {
        previous.append(n * i);
        if (previous.length() > 9) return "-1";
        String val = new String(previous);
        if (EulerUtils.isPandigital(val)) return val;
        return maxPandigitalConcatRec(n, i+1, previous);
    }
}
