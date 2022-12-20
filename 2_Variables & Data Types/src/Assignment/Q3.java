package Assignment;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cost of pencil: ");
        float a = sc.nextFloat();
        System.out.print("Enter cost of pen: ");
        float b = sc.nextFloat();
        System.out.print("Enter eraser: ");
        float c = sc.nextFloat();
        float sum = (a+b+c);
        System.out.println("the Total Price is $" + sum);
        //Applying GST
        //float sum = sum+ 0.18f;
        System.out.println("the Total Price after GST is $" + sum*0.18f);
    }
}
