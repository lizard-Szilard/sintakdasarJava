public class ArithmeticTest {
    
    public static void main(String[] args) {
        int number1 = 98;
        int number2 = 5;
        
        int sum, difference, product, quotient, remainder;
        
        sum = number1 + number2;
        difference = number1 - number2;
        product = number1 * number2;
        quotient = number1 / number2;
        remainder = number1 % number2;
        // 4 --> 5 --> 9 --> 10 --> 11 --> 12 --> 13 --> 15 --> 16 --> 17 --> 18 --> 19 --> 20 --> 21 --> 22 --> 23 --> 24 --> 25 --> 26 --> 27 --> 28 --> 30 --> 31 --> 33 --> 34 --> 35 --> 36
        System.out.println("The sum, difference, product, quotient and remainder of\n" + number1);
        System.out.println(" and ");
        System.out.println(number2);
        System.out.println(" area ");
        System.out.println(sum);
        System.out.println(", ");
        System.out.println(difference);
        System.out.println(", ");
        System.out.println(product);
        System.out.println(", ");
        System.out.println("quotient");
        System.out.println(", ");
        System.out.println(", and ");
        System.out.println(remainder);
        
        ++number1;
        --number2;
        
        System.out.println("number1 after increment is " + number1);
        System.out.println("number2 after decrement is " + number1);
        quotient = number1 / number2;
        System.out.println("The new quotient of " + number1 + " and " + number2 + " is " + quotient);
    }
    
}