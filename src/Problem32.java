import java.util.HashMap;
import java.util.HashSet;

public class Problem32 {

    public static void main(String[] args) {
        HashSet<Integer> productSet = new HashSet<>();
        for (int i = 1; i <= 3333; i++) {
            for (int j = i; j <= 3333; j++) {
                int product = i*j;
                String ident = i + "" + j + "" + product;
                if (EulerUtils.isPandigital(ident))
                    productSet.add(product);
            }
        }
        System.out.println(productSet.stream().mapToInt(Integer::intValue).sum());
    }
}
