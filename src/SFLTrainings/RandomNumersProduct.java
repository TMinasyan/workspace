package SFLTrainings;

import java.util.Scanner;
public class RandomNumersProduct<product> {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first numer:");
        double firstnumer = scanner.nextDouble();
        System.out.print("Enter the second numer:");
        double secondnumer = scanner.nextDouble();
        double product;
        product = firstnumer * secondnumer;
        System.out.println("Product is:" + product);
    }


}
