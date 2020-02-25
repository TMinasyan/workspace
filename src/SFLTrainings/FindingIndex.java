package SFLTrainings;

import java.util.Random;
import java.util.Scanner;

public class FindingIndex {
    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[10];
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(90);

            System.out.print(" " + array[i]);
            if (num == array[i]) {
                num = array[i];
                i++;
               // System.out.println("Num:" + num);
               System.out.println("index :" + i);
            }

        }


    }
}



