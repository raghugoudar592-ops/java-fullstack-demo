public class FunctionCall {
    // Function 1
    static int square(int x) {
        return x * x;
    }

    // Function 2 (calls Function 1)
    static void printSquare(int num) {
        int result = square(num);   // calling square() inside printSquare()
        System.out.println("Square of " + num + " = " + result);
    }

    public static void main(String[] args) {
        printSquare(5);
    }
}
