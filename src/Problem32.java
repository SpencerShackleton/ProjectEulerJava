import java.util.HashMap;
import java.util.HashSet;

public class Problem32 {

    public static void main(String[] args) {
        HashSet<Integer> productSet = new HashSet<>();
        for (int i = 1; i <= 3333; i++) {
            for (int j = i; j <= 3333; j++) {
                int product = i*j;
                String ident = i + "" + j + "" + product;
                if (ident.length() == 9 && isPandigital(ident))
                    productSet.add(product);
            }
        }
        System.out.println(productSet.stream().mapToInt(Integer::intValue).sum());
    }

    private static boolean isPandigital(String n) {
        for (int i = 1; i <= 9; i++)
            if (!n.contains(i+""))
                return false;
        return true;
    }
}
