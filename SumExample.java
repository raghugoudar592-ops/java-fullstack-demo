public class SumExample {

    // Function to get sum of two numbers
    public static int getSum(int num1, int num2) {
        return num1 + num2;
    }

    // Main method
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Calling the function
        int result = getSum(a, b);

        // Printing the result
        System.out.println("The sum of " + a + " and " + b + " is: " + result);
    }
}
