package in.co.decimal.service;

import java.util.Scanner;

public class StairCase {

    public static int wayToReach(int numberOfStairCase){
        // Base Case:
        if(numberOfStairCase < 0){
            return 0;
        }

        /**
         * किसी भी stage पर stair Case कि सांख्य 0 बच्चा हुआ हैं|
         * इसका मतलब हैं कि हम Top पर खरे हैं|
         * means यह एक तरीका हैं stair पर चढ़ने का तो इसे 1 तरीका count करेंगे |
         */
        if(numberOfStairCase == 0){
            return 1;
        }

        int opt1 = wayToReach(numberOfStairCase-1);
        int opt2 = wayToReach (numberOfStairCase-2);
        int opt3 = wayToReach (numberOfStairCase-3);
        int finalResult = opt1 + opt2 + opt3;
        return finalResult;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfStairCase = scan.nextInt ();
        int result = wayToReach(numberOfStairCase);
        System.out.println (result);
    }
}
