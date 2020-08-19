import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        // put your code here
        double result = 0;
        for (int i = 0; i <= 3; i++) {
            result = result + findPower(x, i);

        }
        System.out.println(result);
    }


    private static double findPower(double x, int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return x;
        }
        return x * findPower(x, i - 1);
    }
}