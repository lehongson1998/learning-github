package B3;

import java.util.Scanner;

public class TryCatchFinally {
    public static void main(String[] args) {
	//constant of ansi corlor
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_BLACK = "\u001B[30m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_YELLOW = "\u001B[33m";
        final String ANSI_BLUE = "\u001B[34m";
        final String ANSI_PURPLE = "\u001B[35m";
        final String ANSI_CYAN = "\u001B[36m";
        final String ANSI_WHITE = "\u001B[37m";

        Scanner sc = new Scanner(System.in);
        int num;
        try {
            System.out.println("Enter an integer: ");
            num = sc.nextInt();
        } catch (Exception E) {
            num = 0;
            System.out.println(ANSI_RED + "Warning!!! invalid input" + ANSI_RESET);
        } finally {
            sc.close();
            System.out.println(ANSI_YELLOW + "finally!" + ANSI_RESET);
        }

        System.out.println(ANSI_GREEN + "num = " + num + ANSI_RESET);
    }
}
