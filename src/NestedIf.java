public class NestedIf {
    public static void main(String[] args) {
        
        int number = 0;
        
        //check if number is greather than 0
        if (number > 0) {
            System.out.println("The number is positive.");  
        }
        else if (number < 0){
            System.out.println("The number is negative");
        }
        else{
            System.out.println("The number is 0.");
        }
        System.out.println("Statement after nested if");
    }
}
// 4 --> 7 --> 10 --> 14 --> 16 --> 17
