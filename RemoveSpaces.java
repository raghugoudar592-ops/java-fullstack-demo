public class RemoveSpaces {
    public static String removeSpaces(String str) {
        // Convert string to character array
        char[] chars = str.toCharArray();
        int n = chars.length;

        // Two pointers: read and write
        int write = 0;

        for (int read = 0; read < n; read++) {
            // Copy only non-space characters
            if (chars[read] != ' ') {
                chars[write] = chars[read];
                write++;
            }
        }

        // Build string from characters written
        return new String(chars, 0, write);
    }

    public static void main(String[] args) {
        String input = "a b  c   d";
        System.out.println("Original String: \"" + input + "\"");

        String result = removeSpaces(input);
        System.out.println("String after removing spaces: \"" + result + "\"");
    }
}
