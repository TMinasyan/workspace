package SFLTrainings;

import java.util.Random;
import java.util.Scanner;

public class MatrixRowNumber {
    public static void main(String[] args) {
        int sum = 0;
        Random random = new Random();
        int[][] matrix = new int[10][15];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter rowNumber:");
        int rowNumber = scanner.nextInt();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(90);
                System.out.print(matrix[i][j] + "\t");
            }

            System.out.print("\n");
        }
        for(int i = 0; i < matrix.length; i++){
            if (rowNumber == i)
            for(int j = 0; j < matrix[rowNumber].length; j++){
                sum = sum + matrix[rowNumber][j];
            }
        }
        System.out.println(sum);
            }
        }






