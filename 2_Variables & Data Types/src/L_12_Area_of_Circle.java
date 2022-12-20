import java.util.Scanner;

public class L_12_Area_of_Circle {
    public static void main(String[] args) {
        System.out.println("Calculate Area of Circle");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius r:");
        float r = sc.nextFloat();
        float area = 3.14f * r*r;//java takes double data type by default when entered any decimal value,
        // to convert double to float write f after decimal value
        System.out.println("Area of Circle is: " + area);


    }
}
