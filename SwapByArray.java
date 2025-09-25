public class SwapByArray {
    public static void swap(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }

    public static void invoke_swap() {
        System.out.println("Invoking Swap(10,20)");

        int[] swapArr = new int[2];
        swapArr[0] = 10;
        swapArr[1] = 20;

        System.out.println("Before Swap: a = " + swapArr[0] + " b = " + swapArr[1]);
        swap(swapArr);
        System.out.println("After Swap: a = " + swapArr[0] + " b = " + swapArr[1]);
    }

    public static void main(String[] args) {
        invoke_swap();
    }
}
