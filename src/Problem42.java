import java.util.ArrayList;
import java.util.Arrays;

public class Problem42 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(EulerUtils.readFile("Problem42_Words.txt").replace("\"", "").split(",")));
        ArrayList<Integer> triangleNumberList = new ArrayList<>(500);
        int triangleWords = 0;

        for (int i = 1; i < 1000; i++)
            triangleNumberList.add(i*(i+1)/2);

        for (String word : list)
            if (triangleNumberList.contains(letterValueOfWord(word)))
                triangleWords++;

        System.out.println(triangleWords);
    }

    public static int letterValueOfWord(String word) {
        int res = 0;
        for (int i = 0; i < word.length(); i++) {
            res += word.charAt(i) - 64;
        }
        return res;
    }
}
