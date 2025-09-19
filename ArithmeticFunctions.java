class ArithmeticFunctions {
    static int sum(int a, int b) {
        return a + b;
    }

    static int square(int n) {
        return n * n;
    }

    static int rectangleArea(int length, int width) {
        return length * width;
    }

    static double average(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    public static void main(String[] args) {
        System.out.println("Sum: " + sum(5, 3));
        System.out.println("Square: " + square(4));
        System.out.println("Rectangle Area: " + rectangleArea(5, 2));
        System.out.println("Average: " + average(3, 6, 9));
    }
}
