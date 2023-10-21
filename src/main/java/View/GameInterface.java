package View;

import static camp.nextstep.edu.missionutils.Console.readLine;

import Constant.ExceptionHandling;
import Constant.Ment;

public class GameInterface {
    //수정
    public static void PrintResult(int strike, int ball, boolean judge) {
        if (judge) {
            System.out.println(Ment.getNothing());
            return;
        }
        System.out.println(ball + Ment.getBall() + strike + Ment.getStrike());
    }

    public static void PrintGameClear() {

    }

    public static boolean GameClear(int strike) {
        if (strike == 3) {
            System.out.println(Ment.getMentClear());
            return true;
        }
        return false;
    }

    public static boolean GameRestart() {
        System.out.println(Ment.getMentRestart());
        int choice = Integer.valueOf(readLine());
        if (choice == 1) {
            return true;
        } else if (choice == 2) {
            return false;
        }
        ExceptionHandling.ExceptionNotOneTwo();
        return false;
    }

    public static String InputNumbers() {
        System.out.printf(Ment.getMentInput());
        String Tempnumbers = readLine();
        return Tempnumbers;
    }
}