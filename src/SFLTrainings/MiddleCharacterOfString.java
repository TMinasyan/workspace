package SFLTrainings;

import java.util.Scanner;

public class MiddleCharacterOfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter characters:");
        String string = scanner.nextLine();
        int position = string.length();
        char ch[] = string.toCharArray();
        if (string.length() % 2 == 0) {
            position = string.length() / 2 - 1;
            System.out.println(ch[position]);
        } else {
            position = string.length() / 2;
            System.out.println("Middle character is:" + ch[position]);
        }

    }
}
