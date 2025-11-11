import java.util.Scanner;

public class functions {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
//        MaxMinNumbers();
//        oddOrEven();
        votingEligibility();
    }

    static void votingEligibility() {
        System.out.println("Enter your age: ");

        int age = input.nextInt();
        if (age >= 18) {
            System.out.println("You are ligible to vote");
        } else {
            System.out.println("You are NOT eligible to vote.");
        }
    }

//    static void oddOrEven() {
//        System.out.println("Enter a number: ");
//
//        int number = input.nextInt();
//        if(number % 2 == 0) {
//            System.out.println("It's a even number.");
//        } else {
//            System.out.println("It's a odd number.");
//        }
//    }

//    static void MaxMinNumbers() {
//        System.out.println("Enter first number: ");
//        int num1 = input.nextInt();
//
//        System.out.println("Enter second number: ");
//        int num2 = input.nextInt();
//
//        System.out.println("Enter third number: ");
//        int num3 = input.nextInt();
//
//        findMax(num1, num2, num3);
//        findMin(num1, num2, num3);
//    }
//    static void findMax(int a, int b, int c) {
//        int max;
//
//        if (a >= b && a >= c) {
//            max = a;
//        } else if (b >= a && b >= c) {
//            max = b;
//        } else {
//            max = c;
//        }
//        System.out.println("Maximum = " + max);
//    }
//
//    static void findMin(int a, int b, int c) {
//        int min;
//
//        if(a <= b && a <= c) {
//            min = a;
//        } else if (b <= a && b <= c) {
//            min = b;
//        } else {
//            min = c;
//        }
//        System.out.println("Minimum number is " + min);
//    }
}
