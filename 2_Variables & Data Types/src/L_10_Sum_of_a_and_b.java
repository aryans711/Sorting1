import java.util.Scanner;

public class L_10_Sum_of_a_and_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        int sum = a +b;
        System.out.println("Sum is " + sum);
    }
}