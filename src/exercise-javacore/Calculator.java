
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    // 1
    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("b is not equa 0");
            return 0;
        }
        return a / b;
    }

    // 2
    public char firstChar(String a) {
        if (a.isEmpty()) {
            System.out.println("String is empty");
            return 0;
        }
        char first = a.charAt(0);
        return first;
    }

    // 3
    public String evennum(float a) {
        if (a % 2 == 0) {
            return a + " is even number";
        } else {
            return a + " is not even number";
        }
    }

    // 4
    public short sumshort(short a, short b) {
        return (short) (a + b);
    }

    // 5
    public double factorial(double a) {
        double result = 1;
        for (int i = 1; i <= a; i++) {
            result = result * i;
            if (Double.isInfinite(result)) {
                System.out.println("please input a is not larger than" + i);
                break;
            }
        }

        return result;
    }

    // 6
    public double averageSum(int... a) {
        double j = 0;
        for (int i = 0; i < a.length; i++) {
            j = j + a[i];
        }
        return j / a.length;
    }

    // 7
    public int max2num(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    // 8
    public double hypotenuse(double a, double b) {

        if (a < 0 || b < 0) {
            System.out.println("please input a & b larger than 0");
        }
        double result = Math.sqrt(a * a + b * b);
        return result;
    }

    // 9
    public char lastChar(String a) {

        if (a.isEmpty()) {
            System.out.println("String is empty");
            return 0;
        }
        int n = a.length();

        char last = a.charAt(n - 1);

        return last;
    }

    // 10
    public static void pyramid(int a) {
        System.out.println("pyramid " + a + " floor");
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i + i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
