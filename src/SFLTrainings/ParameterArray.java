package SFLTrainings;

import java.util.Random;

public class ParameterArray {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();


        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(90);
            System.out.print(" " +array[i]);
            }

        System.out.println("\n");
    for (int i = 0; i < array.length; i++) {
        array[i] = i;
        System.out.print(array[i] + " ");
    }
        System.out.println();
}
}

