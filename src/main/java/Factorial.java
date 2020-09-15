public class Factorial {
    public static int factorial(int number){
        int factorial = 1;
        if(number < 0 || number > 12) {
            throw new IllegalArgumentException("Number not valid. It should be 0 or positive.");
        } else if (number > 0) {
            for(int i=number; i > 0; i--) factorial *= i;
        }
        return factorial;
    }
}
