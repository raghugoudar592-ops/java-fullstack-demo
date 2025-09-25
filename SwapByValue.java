public class SwapByValue {
    public static void swap(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;
    }

    public static void invoke_swap() {
        System.out.println("Invoking Swap(10,20)");
        int a = 10;
        int b = 20;

        System.out.println("Before Swap: a = " + a + " b = " + b);
        swap(a, b);
        System.out.println("After Swap: a = " + a + " b = " + b);
    }

    public static void main(String[] args) {
        invoke_swap();
    }
}
