public class PrintBinaryDemo {

    public static void printBinary(int number) {
        int mask = 1; // 1 is already present at 1st bit or house
        mask = mask << ((Integer.BYTES * 8) - 2); // leave 1 bit for sign and 1 bit for already standing

        System.out.println("Binary Representation of " + number);

        while (mask != 0) {
            if ((number & mask) == 0) {
                System.out.print("0");
            } else {
                System.out.print("1");
            }
            mask = mask >>> 1; // shift right
        }
        System.out.println();
    }

    public static void invoke_printBinary() {
        int a = 10;
        int b = -10;
        int c = 0;
        int d = 255;

        printBinary(a);
        printBinary(b);
        printBinary(c);
        printBinary(d);
    }

    public static void main(String[] args) {
        invoke_printBinary();
    }
}
