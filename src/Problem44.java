import java.util.ArrayList;

public class Problem44 {

    public static void main(String[] args) {
        final int size = 10000;
        ArrayList<Integer> pentagonals = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            pentagonals.add(i*(3*i-1)/2);
        }
        for (int i = 1; i < pentagonals.size(); i++) {
            for (int j = i; j < pentagonals.size(); j++) {
                if (i == j) continue;
                int pj = pentagonals.get(i);
                int pk = pentagonals.get(j);
                if (pentagonals.contains(pj + pk)) {

                    if (pentagonals.contains(pk - pj)) {
                        System.out.println(pk-pj);
                        break;
                    }
                }
            }
        }
    }
}
