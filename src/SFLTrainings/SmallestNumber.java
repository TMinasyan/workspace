package SFLTrainings;

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the first number:");
        double firstnumer=scanner.nextDouble();
        System.out.print("Enter the second number:");
        double secondnumber=scanner.nextDouble();
        System.out.print("Enter the third number:");
        double thirdnumer=scanner.nextDouble();
        if (firstnumer <= secondnumber & firstnumer <= thirdnumer){
            System.out.println("Smallest number is:" + firstnumer);
        } else{
            if (secondnumber <= firstnumer & secondnumber<=thirdnumer){
                System.out.println("Smallest number is:" + secondnumber);

        } else{
                System.out.println("Smallest number is:" + thirdnumer);
            }
    }
    }
}
