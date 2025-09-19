import java.util.HashMap;

class RecursionDP {
    static HashMap<Integer, Integer> memo = new HashMap<>();

    // Factorial with memoization
    static int factorial(int n) {
        if (n <= 1) return 1;
        if (memo.containsKey(n)) return memo.get(n);
        int result = n * factorial(n - 1);
        memo.put(n, result);
        return result;
    }

    // Fibonacci with bottom-up DP
    static int fibonacci(int n) {
        if (n <= 1) return n;
        int[] dp = new int[n + 1];
        dp[0] = 0; dp[1] = 1;
        for (int i = 2; i <= n; i++) dp[i] = dp[i - 1] + dp[i - 2];
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println("Factorial(5): " + factorial(5));
        System.out.println("Fibonacci(7): " + fibonacci(7));
    }
}
