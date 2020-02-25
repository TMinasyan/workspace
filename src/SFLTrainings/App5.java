package SFLTrainings;


import java.util.Random;

public class App5 {
    public static void main(String[] args) {

        Random random = new Random();
        int[][] array = new int[10][15];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <array[i].length; j++) {
                array[i][j] = random.nextInt(90);
                System.out.print(array[i][j] + "\t" );
            }

            System.out.print("\n");

        }
        int maxNum = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (maxNum < array[i][j]) {
                    maxNum = array[i][j];
                }
            }
        }
        System.out.println("Max number: " + maxNum);


    }

}





