package SFLTrainings;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("The first side=");
        double a=scanner.nextDouble();
        System.out.print("The second side=");
        double b=scanner.nextDouble();
        System.out.print("The third side=");
        double c=scanner.nextDouble();
        if(a!=0 & b!=0  & c!=0 & a+b>=c || a+c>=b || b+c>=a) {
            double perimeter=a+b+c;
            System.out.println("Triangle perimeter=" + perimeter);
            double p=(a+b+c)/2;
            double k=p*(p-a)*(p-b)*(p-c);
            double area=Math.sqrt(k);
            System.out.println("Triangle area=" +area);

        } else {
            System.out.println("Triangle is not valid");
        }



    }
}
