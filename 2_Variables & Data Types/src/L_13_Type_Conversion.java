import java.util.Scanner;

public class L_13_Type_Conversion {
    public static void main(String[] args) {
        //Example 1
        int a = 25;
        long b = a; //where 'a' is an integer, and it is the source. 'b' is the destination
        //8bytes(long)>4bytes(int)
        //so type conversion is possible if destination type > source type
        //but the opposite is not true,it is called lossy conversion, where data can be lost
        System.out.println(b);
        Scanner sc =new Scanner(System.in);
        float number = sc.nextInt(); //converted int to float
        System.out.println(number);
        //Example 2
        char ch = 'z';
        int r = ch;
        System.out.println(r);
    }
}
//Type Conversion also Widening/Implicit(by default) Conversion
//storing value of small data type into large and compatible data type
/* Conversion happens when:
a.type compatible
b.destination type > source type
 */
// byte -> short -> int-> float-> long-> double