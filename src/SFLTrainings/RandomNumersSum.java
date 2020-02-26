package SFLTrainings;


import java.util.Scanner;

public class RandomNumersSum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the first number:");
        int firstnumer=scanner.nextInt();
        System.out.print("Enter the second number:");
        int secondnumer=scanner.nextInt();
        int sum=firstnumer+secondnumer;
        System.out.println("Sum is :" +sum);

    }
}
