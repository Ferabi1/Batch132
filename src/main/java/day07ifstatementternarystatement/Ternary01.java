package day07ifstatementternarystatement;

public class Ternary01 {

    public static void main(String[] args) {

        //Example 1: Type code to check if a number is even or not by using ternary
        int num = 7;

        //1.Way: Use if-else

        if (num%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

        //2.Way: Ternary
        //             Condition   ?   The code will be executed    :   The code will be executed
        //                                  for true condition              for true condition
        String result = num%2==0   ?   "Even"                       :                "Odd";

        System.out.println(result);

        //Example 2: Type code to check if a number has 3 digits or not, use ternary
        int n = -837;

        n = Math.abs(n);

        String r = n>99 && n<1000 ? "It has 3 digits" : "It has no 3 digits";
        System.out.println(r);


    }
}
