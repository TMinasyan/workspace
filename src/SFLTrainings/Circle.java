package SFLTrainings;
import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter radius:");
        double radius=scanner.nextDouble();
        if (radius !=0 ) {
            double area=Math.PI*Math.pow(radius,2);
            double perimeter=2*Math.PI*radius;
            System.out.println("Circle area=" +area);
            System.out.println("Circle perimeter=" + perimeter);

        }

    }
}
