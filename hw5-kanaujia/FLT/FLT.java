public class FLT {
    public static void main(String[] args) {
        int nn = Integer.parseInt(args[0]);
        int count = 0;
        for (int i = nn; i <= 2 * nn; i++) {
            if (isPseudoPrime(i)) {
                count++;
            }
        }
        System.out.println(count);
    }

    private static boolean isPseudoPrime(int n) {
        for (int b = 2; b < n; b++) {
            if (gcd(b, n) == 1) { // Only test when b and n are coprime
                if (modExp(b, n - 1, n) != 1) {
                    return false;
                }
            }
        }
        return true;
    }

    private static int modExp(int base, int exponent, int modulus) {
        long result = 1;
        long b = base % modulus;
        while (exponent > 0) {
            if ((exponent & 1) != 0) {
                result = (result * b) % modulus;
            }
            exponent >>= 1;
            b = (b * b) % modulus;
        }
        return (int) result;
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
