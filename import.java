import java.util.Arrays;

class ArrayFunctions {
    static int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) sum += num;
        return sum;
    }

    static int[] mergeArrays(int[] a, int[] b) {
        int[] merged = new int[a.length + b.length];
        System.arraycopy(a, 0, merged, 0, a.length);
        System.arraycopy(b, 0, merged, a.length, b.length);
        return merged;
    }

    static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) if (num > max) max = num;
        return max;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3}, arr2 = {4, 5, 6};

        System.out.println("Sum: " + sumArray(arr1));
        System.out.println("Merged: " + Arrays.toString(mergeArrays(arr1, arr2)));
        System.out.println("Max: " + findMax(arr2));
    }
}
