public class L_14_Type_Casting {
    public static void main(String[] args) {
//        float num = 85.982f;
//        int num2 = (int)num; //remove all values after decimal
//        System.out.println(num2);
//        METHOD 1
//        char ch = 'c';
//        char ch2 = 'b';
//        int num = ch;
//        int num2 = ch2;
//        //every character has its own numeric value
//        System.out.println(num);
//        System.out.println(num2);

//        METHOD 2
        char ch = 'c';
        char ch2 = 'b';
        System.out.println((int)ch);
        System.out.println((int)ch2);
    }
}
// TYPE CASTING or Narrowing/Explicit Conversion
// Java does not allow Type Casting, it is done purposely and, there will be loss of data.
//values which we are trying to reduce but will result in loss of data,but still we want to assign those values to new variables
/*
float a = 25.0;
int b = a; ->X loss of data
to convert -> int b = (int)a;
 */
