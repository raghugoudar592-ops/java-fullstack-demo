class BasicFunctions {
    // No input, returns greeting
    static String getHello() {
        return "Hello, World!";
    }

    // With input, returns personalized message
    static String getGreeting(String name) {
        return "Hello, " + name + "!";
    }

    public static void main(String[] args) {
        System.out.println(getHello());
        System.out.println(getGreeting("Raghavendra"));
    }
}
