package Assignment;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num 1:");
        float a = sc.nextFloat();
        System.out.print("Enter Num 2:");
        float b = sc.nextFloat();
        System.out.print("Enter Num 3:");
        float c = sc.nextFloat();
        float average = (a+b+c) / 3;
        System.out.println("the Average is " + average);
    }
}
