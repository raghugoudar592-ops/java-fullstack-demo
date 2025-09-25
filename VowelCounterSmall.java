import java.util.Scanner;

public class VowelCounterSmall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        scanner.close();

        long vowelCount = str.toLowerCase().chars()
                          .filter(ch -> "aeiou".indexOf(ch) >= 0)
                          .count();

        System.out.println("The number of vowels is: " + vowelCount);
    }
}
