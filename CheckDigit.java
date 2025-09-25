public class CheckDigit {
    public static void main(String[] args) {
        char ch = '7'; // change this to test other characters

        if (ch >= '0' && ch <= '9') {   // ASCII check
            System.out.println(ch + " is a Digit");
        } else {
            System.out.println(ch + " is NOT a Digit");
        }
    }
}
