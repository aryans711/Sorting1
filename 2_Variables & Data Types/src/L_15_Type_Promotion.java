public class L_15_Type_Promotion {
    public static void main(String[] args) {
//        PART 1
//        char a = 'a';
//        char b = 'b';
//        int num = b; //(other method to type cast)
//        // char c = a-b; cannot convert integer to character
//        System.out.println((int)b);
//        System.out.println((int)a);
//        System.out.println(a); //does not print value 98 and prints 'a' only,No Type Promotion
//        System.out.println(b-a); //Type Promotion happens only with expressions
//        System.out.println(num); //(other method to type cast)

//        PART 2
//        short a = 5;
//        byte b = 25;
//        char c = 'c';
//        byte bt = (byte) (a + b + c); // ultimately converted all types to int,therefore we did Type Cast into byte
//        System.out.println(bt);
//        System.out.println(a);//does not print value 98 and prints 'a' only,No Type Promotion
//        System.out.println(c-a);//Type Promotion happens only with expressions

//        PART 3
//          int a = 25;
//          float b = 24.89f;
//          long c = 1432;
//          double d =23.94234;
//          double ans = a*b+c*d;
//          System.out.println((int)ans);
//         All data types are converted into which ever is the largest
//         here all the data types are converted into double because double is the largest data type

//        PART 4
//        byte b = 5;
//        byte a =(byte) (b*2);
//        System.out.println(a);
//        b = b*2; Java type promotes because it's an expression and convert it into int and gives error, therefore we type cast it into byte
//        refer to L6_datatype
    }
}
/* TYPE PROMOTION IN EXPRESSIONS
1. Java automatically promotes each byte, short, or char operand to int
when evaluating an expression.
2. If one operand is long, float or double the whole expression is
promoted to long, float, or double respectively.
 */
/*example,
char a = 'a';
short b = '50';
print a+b ,then it will convert char and short into int and give the output
 */
//Basically all the expressions are converted into the largest possible data type
