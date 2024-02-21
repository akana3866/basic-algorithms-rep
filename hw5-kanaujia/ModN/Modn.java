public class Modn {
    public static void main(String[] args) {
        // Arguments are expected to be integers
        int ss = Integer.parseInt(args[0]);
        int nn = Integer.parseInt(args[1]);
        int mm = Integer.parseInt(args[2]);

        // Check if we need to display the multiplicative inverses
        boolean showInverses = mm == 1;

        // Print the multiplication table for Zn
        for (int i = 2; i <= nn; i++) {
            for (int j = 2; j <= i; j++) {
                System.out.print((i * j) % nn);
                System.out.print(' ');
            }
            if (showInverses) {
                // Check and print if the multiplicative inverse exists
                if (hasMultiplicativeInverse(i, nn)) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    // Helper method to check if the multiplicative inverse exists
    private static boolean hasMultiplicativeInverse(int a, int n) {
        // Inverse exists if gcd(a, n) == 1
        return gcd(a, n) == 1;
    }

    // Helper method to compute the greatest common divisor (Euclidean algorithm)
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
