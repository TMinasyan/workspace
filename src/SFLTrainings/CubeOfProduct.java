package SFLTrainings;

import java.util.Scanner;

public class CubeOfProduct {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the first numer:");
        int firstnumer=scanner.nextInt();
        System.out.print("Enter the second numer:");
        int secondnumer=scanner.nextInt();
        int product=firstnumer*secondnumer;
        System.out.println("Cube of product is:" +Math.pow(product,3));


    }
}
