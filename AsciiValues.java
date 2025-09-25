import java.util.Scanner;

public class AsciiValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Printing ASCII value of each character
        System.out.println("ASCII values of each character:");
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            int ascii = (int) ch; // Convert character to ASCII
            System.out.println(ch + " : " + ascii);
        }

        sc.close();
    }
}
