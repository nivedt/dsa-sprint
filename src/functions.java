import java.util.Scanner;

public class functions {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        MaxMinNumbers();
    }
    static void MaxMinNumbers() {
        System.out.println("Enter first number: ");
        int num1 = input.nextInt();

        System.out.println("Enter second number: ");
        int num2 = input.nextInt();

        System.out.println("Enter third number: ");
        int num3 = input.nextInt();

        findMax(num1, num2, num3);
        findMin(num1, num2, num3);
    }
    static void findMax(int a, int b, int c) {
        int max;

        if (a >= b && a >= c) {
            max = a;
        } else if (b >= a && b >= c) {
            max = b;
        } else {
            max = c;
        }
        System.out.println("Maximum = " + max);
    }

    static void findMin(int a, int b, int c) {
        int min;

        if(a <= b && a <= c) {
            min = a;
        } else if (b <= a && b <= c) {
            min = b;
        } else {
            min = c;
        }
        System.out.println("Minimum number is " + min);
    }
}
