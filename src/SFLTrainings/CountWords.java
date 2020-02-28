package SFLTrainings;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter sentence:");
        String sentence = scanner.nextLine();
        int count = 0;
        for(int i = 0; i < sentence.length()-1; i++) {

            if(sentence.charAt(i) == ' ' && Character.isLetter(sentence.charAt(i+1)) && (i > 0)) {
                count++;
            }
        }
                count++;


        System.out.println("Number of words: " + count);
    }

}
