package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class TestStackColections {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        Stack<String> stack = new Stack<>();

        System.out.println("enter string: ");
        str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i) + "");
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }

        //binary of number
        System.out.println();
        Stack<Integer> stack2 = new Stack<>();
        System.out.println("enter number: ");
        int number = sc.nextInt(), n = number;
        while(number > 0){
            int sd = number % 2;
            stack2.push(sd);
            number = number / 2;
        }
        System.out.print("binary of " + n + ": ");
        while(!stack2.isEmpty()){
            System.out.print(stack2.pop());
        }
    }
}
