public class Problem35 {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2; i < 1000000; i++) {
            if (!EulerUtils.isPrime(i)) continue;
            String start = Integer.toString(i);

            if (areAllPrime(start, start.length() - 1)) sum++;
        }

        System.out.println(sum);
    }

    public static boolean areAllPrime(String preShift, int length) {
        if (length == 0) return true;
        String shifted = shiftOne(preShift);
        if (!EulerUtils.isPrime(Integer.parseInt(shifted))) return false;

        return areAllPrime(shifted, length - 1);
    }

    public static String shiftOne(String start) {
        char[] values = new char[start.length()];

        for (int j = 0; j < start.length()-1; j++) {
            values[j] = start.charAt(j+1);
        }

        values[start.length() - 1] = start.charAt(0);
        return new String(values);
    }
}
