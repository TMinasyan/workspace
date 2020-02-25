package SFLTrainings;


import java.util.Random;
import java.util.Scanner;

public class IntArray {
    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[89];
        Scanner scanner=new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(90);
            System.out.println(" " +array[i]);
            if (num == array[i]) {
                num = array[i];
                i++;
                System.out.println("Num:" + num);
            }




            }

        }

    }
