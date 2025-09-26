import java.util.Arrays;

public class SearchSortedArray {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25, 30}; // sorted array
        int key = 20;

        int pos = Arrays.binarySearch(arr, key);

        if (pos >= 0)
            System.out.println(key + " found at index " + pos);
        else
            System.out.println(key + " not found");
    }
}
