public class MinMaxArray {
    public static void main(String[] args) {
        int[] arr = {25, 10, 45, 90, 5};

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }
}
