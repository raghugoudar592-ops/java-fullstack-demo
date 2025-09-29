public class WordCount {
    public static void main(String[] args) {
        String str = "Java is a powerful programming language";

        // Trim removes extra spaces at start and end
        str = str.trim();

        // Split by one or more spaces using regex
        String[] words = str.split("\\s+");

        System.out.println("The string is: " + str);
        System.out.println("Word count: " + words.length);
    }
}
