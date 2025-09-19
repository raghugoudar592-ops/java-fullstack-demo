class BitLogic {
    static boolean isEven(int n) {
        return (n & 1) == 0;
    }

    public static void main(String[] args) {
        System.out.println("4 is even? " + isEven(4));
        System.out.println("7 is even? " + isEven(7));
    }
}
