package b132practices.practice01;

public class Q05 {
    // Write a Java program to break an integer into a sequence of individual digits.
    // Hint: use / and %
    // x: input: 12345
    //    output: 1
    //            2
    //            3
    //            4
    //            5

    public static void main(String[] args) {
        int number =12345;

        int ones = number%10;
        System.out.println("ones = " + ones);

        int tens = (number/10)%10;
        System.out.println("tens = " + tens);

        int hundreds = (number/100)%10;
        System.out.println("hundreds = " + hundreds);

        int thousands = (number/1000)%10;
        System.out.println("thousands = " + thousands);

        int tenThousands = number/10000;
        System.out.println("tenThousands = " + tenThousands);

        System.out.println(tenThousands + "\n" + thousands + "\n" + hundreds + "\n" + tens + "\n" + ones);





    }

}
