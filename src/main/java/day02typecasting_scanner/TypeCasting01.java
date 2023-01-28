package day02typecasting_scanner;

public class TypeCasting01 {

    public static void main(String[] args) {

        //Example1: Create 2 integer variables and 1 String variable
        /*
        Primitive data types are created by Java ==> byte< short< int long< float< double-- char and boolean

        Non - primitive data types have both values and methods
         */

        int a=13;
        int b=15;
        String name= "Tommy";
        String fullName= "Tom Hanks";

        System.out.println(fullName + a+b+name);

        System.out.println(name + (a + b));

        //Type casting
        /*
        1)AutoWidening= Java can put small data types into larger data types automatically
        When you put small data type into a larger data type, you are widening the small data type
         */
        int m= 45;
        System.out.println(m);

        double d= m;
        System.out.println(d);

        /*
        Java does not put large data types into small data types
         */

        int n=15;

        byte b1= (byte) n;






    }






}
