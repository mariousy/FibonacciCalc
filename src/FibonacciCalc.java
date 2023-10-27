public class FibonacciCalc {

    public static void main(String[] args) {
        // Check if there's an argument provided
        if(args.length != 1) {
            System.out.println("Usage: java FibonacciCalculator <n>, where <n> is the nth Fibonacci number you want to compute.");
            return;
        }

        // Parse the input argument
        int n;
        try {
            n = Integer.parseInt(args[0]);
        } catch(NumberFormatException e) {
            System.out.println("Please provide a valid integer for <n>.");
            return;
        }

        // Validate n
        if(n < 0) {
            System.out.println("Please provide a non-negative value for <n>.");
            return;
        }

        // Compute and display the Fibonacci number
        System.out.println("Fibonacci number at position " + n + " is: " + fibonacci(n));
    }

    // Recursive method to calculate Fibonacci numbers
    public static long fibonacci(int n) {
        if(n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
