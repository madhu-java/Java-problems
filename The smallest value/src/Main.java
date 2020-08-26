import java.math.BigInteger;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        BigInteger m = scanner.nextBigInteger();
        long n = 1L;
        BigInteger result = BigInteger.ONE;
        while (result.compareTo(m) < 0) {
            n = n + 1L;
            result = result.multiply(BigInteger.valueOf(n));
        }
        System.out.println(n);
    }
}