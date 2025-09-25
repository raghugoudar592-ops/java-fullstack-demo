import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String originalStr = scanner.nextLine();
        scanner.close();

        String reversedStr = new StringBuilder(originalStr).reverse().toString();

        System.out.println("The reversed string is: " + reversedStr);
    }
}
