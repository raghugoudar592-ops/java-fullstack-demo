class StringFunctions {
    static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    static String repeat(String s, int n) {
        return s.repeat(n);
    }

    static boolean isPalindrome(String s) {
        return s.equals(reverse(s));
    }

    public static void main(String[] args) {
        System.out.println("Reverse: " + reverse("Java"));
        System.out.println("Repeat: " + repeat("Hi ", 3));
        System.out.println("Palindrome? " + isPalindrome("madam"));
    }
}
