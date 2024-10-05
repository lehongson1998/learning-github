package LearnStringClass;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter String:");
            String str = scanner.nextLine();
            System.out.println("str size = " + str.length());
            System.out.println("str[3] = " + str.charAt(3));
            char[] chars = new char[100];
            str.getChars(0, str.length(), chars, 0);
            for (char aChar : chars) {
                if (aChar == 0) break;
                System.out.print(aChar + " ");
            }
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        String s1 = "Le Hong Son";
        String s2 = "le hong son";
        String s3 = "Le Hong Son";

        System.out.println("\ns1 equal s2 : " + s1.equals(s2));
        System.out.println("s1 equal s3 : " + s1.equals(s3));
        System.out.println("s1 equalIgnoreCase s2 " + s1.equalsIgnoreCase(s2));
        System.out.println("s1 equalIgnoreCase s3 " + s1.equalsIgnoreCase(s3));

        System.out.println(s1.replace("Le Hong Son", "Shizuka"));
    }
}
