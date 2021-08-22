import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Problem54 {

    public static void main(String[] args) {
        String file = EulerUtils.readFile("Problem54_Poker.txt");
        String[] hands = file.split("\n");
        for (String hand : hands) {
            String[] player1 = hand.substring(0, 14).split(" ");
            String[] player2 = hand.substring(15).split(" ");
            System.out.println(Arrays.toString(player1));
            System.out.println(Arrays.toString(player2));

            valueFromHand(player1);
            break;
        }
    }

    public static int valueFromHand(String[] hand) {
        ArrayList<String> values = new ArrayList<>();
        ArrayList<String> suits = new ArrayList<>();
        for (String card : hand) {
            values.add(card.substring(0, 1));
            suits.add(card.substring(1, 2));
        }

        Set<String> differentSuits = new HashSet<>(suits);
        boolean sameSuit = differentSuits.size() == 1;
        if (sameSuit) {
            //Royal Flush
            if (values.contains("T") && values.contains("J") && values.contains("Q") && values.contains("K") && values.contains("A"))
                return 9;
            
        }

        return 1;
    }
}
