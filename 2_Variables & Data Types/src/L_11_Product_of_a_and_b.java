import java.util.Scanner;

public class L_11_Product_of_a_and_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your First Number");
        float a = sc.nextFloat();
        System.out.println("Enter your Second Number");
        int b = sc.nextInt();
        float product = a*b;
        System.out.println("Your answer is " + product);


    }
}
