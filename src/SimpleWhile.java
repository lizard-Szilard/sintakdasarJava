
public class SimpleWhile {

    public static void main(String[] args) {

        int i = 0;
        int max = 5;

        System.out.println("Counting to " + max);

        while (i < max) {
            i++;
            System.out.println("i is : " + i);
        }
    }
}
/*
 * 6 --> 7 --> 9 -->
 * 11 --> 12 --> 13 -->
 * 11 --> 12--> 13 -->
 * 11 --> 12--> 13 -->
 * 11 --> 12--> 13 -->
 * 11 --> 12--> 13
*/
