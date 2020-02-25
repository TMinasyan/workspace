package SFLTrainings;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SortByDesc {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] array = new int[size];
        for(int i = 0; i<size; i++) {
            array[i] = random.nextInt(90);
            System.out.print(" " +array[i]);
        }

        for(int i =0; i<size; i++) {
            for (int j = i+1; j<array.length; j++) {
                if(array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];

                    array[j] = temp;

                }

            }
        }
        System.out.println("\n");
        System.out.println(Arrays.toString(array));
    }
}
