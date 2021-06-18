import java.io.*;
import java.util.*;

public class Problem22 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(readFile().replace("\"", "").split(",")));
        Collections.sort(list);
        int scores = 0;
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            int score = 0;
            for (char c : name.toCharArray()){
                score += (c - 64);
            }
            scores += score * (i+1);
        }
        System.out.println(scores);
    }

    public static String readFile() {
        try {
            return new BufferedReader(new FileReader("Problem22_Names.txt")).readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
