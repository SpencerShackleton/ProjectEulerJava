import java.util.HashMap;

public class Problem14 {

    private static HashMap<Long, Long> sequenceMap = new HashMap<>();

    public static void main(String[] args) {
        long longestChain = 0;
        long longestChainNum = 0;
        for(long i = 1; i < 1000000; i++) {
            long chain = col(i);
            sequenceMap.put(i, chain);
            //System.out.println(i + " " + chain);
            if (chain > longestChain) {
                longestChain = chain;
                longestChainNum = i;
            }
        }
        System.out.println(longestChainNum);
    }

    public static long col(long n) {
        int chain = 1;
        while (n != 1) {
            if (sequenceMap.containsKey(n)) return chain + sequenceMap.get(n) - 1;
            if (n % 2 == 0) n /= 2;
            else n = n*3 + 1;
            chain++;
        }
        return chain;
    }

}
