package SFLTrainings;


import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year:");
        int year = scanner.nextInt();
        int a;
        int b;
        int c;
        a=year%100;
        b=year%10;
        c=2*a+b;
        if (year != 0 & a % 4==0 & c%4==0) {
            System.out.println("Year is leap");
        }
        else System.out.println("Year is not leap");

    }
}
