import java.util.HashMap;

public class Problem26 {

    public static void main(String[] args) {
        int longestLen = 0;
        int longestVal = 0;
        for (int i = 2; i <= 1000; i++) {
            String res = fractionToDecimal(1, i);
            if (res.equals("")) continue;
            if (res.length() > longestLen) {
                longestLen = res.length();
                longestVal = i;
            }
        }
        System.out.println(longestVal);
    }

    private static String fractionToDecimal(int numr, int denr)
    {
        // Initialize result
        String res = "";

        // Create a map to store already
        // seen remainders. Remainder is
        // used as key and its position in
        // result is stored as value.
        // Note that we need position for
        // cases like 1/6.  In this case,
        // the recurring sequence doesn't
        // start from first remainder.
        HashMap<Integer, Integer> mp = new HashMap<>();

        // Find first remainder
        int rem = numr % denr;

        // Keep finding remainder until
        //  either remainder becomes 0 or repeats
        while ((rem != 0) && (!mp.containsKey(rem)))
        {
            // Store this remainder
            mp.put(rem, res.length());

            // Multiply remainder with 10
            rem = rem * 10;

            // Append rem / denr to result
            int res_part = rem / denr;
            res = res + res_part;

            // Update remainder
            rem = rem % denr;
        }

        if (rem == 0)
            return "";
        else if (mp.containsKey(rem))
            return res.substring(mp.get(rem));

        return "";
    }
}
