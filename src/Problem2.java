public class Problem2 {

    public static void main(String[] args) {
        int res = 0;
        int lastLastNum = 1;
        int lastNum = 1;
        while (lastNum < 4000000) {
            System.out.println(lastNum);
            int tempLast = lastLastNum;
            lastLastNum = lastNum;
            lastNum += tempLast;
            if (lastNum % 2 == 0)
                res += lastNum;
        }
        System.out.println(res);
    }
}
