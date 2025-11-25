import java.util.Scanner;

public class functions {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
//        MaxMinNumbers();
//        oddOrEven();
//        votingEligibility();
//        sumOfTwoNumberEnteredByUser();
//        productOfTwoNumberEnteredByUser();
//        circumferenceAndAreaOfCircle();
//        primeCheck();
//        gradeCalculator();
//        factorialProgram();
//        palindromeProgram();
//        tripletOrNot();
//        allNumbersBetweenTwoPrime();
        sumOfFirstNaturalNumbers();

    }

    public static void sumOfFirstNaturalNumbers() {
        System.out.println("Enter a number: ");

        int n = input.nextInt();
        int sum = sumOFNaturalNumbers(n);

        System.out.println(sum + " is the sum of First " + n + " natural numbers.");
    }

    static int sumOFNaturalNumbers(int n) {
        return n * (n + 1) / 2;
    }

//    public static void allNumbersBetweenTwoPrime() {
//        System.out.println("Enter number 1: ");
//        int num1 = input.nextInt();
//
//        System.out.println("Enter number 2: ");
//        int num2 = input.nextInt();
//
//        printPrimes(num1, num2);
//    }
//
//    static void printPrimes(int start, int end) {
//        System.out.println("Prime numbers start between " + start + " and " + end);
//
//        for (int i = start; i <= end; i++) {
//            if (isPrime(i)) {
//                System.out.println(i + " ");
//            }
//        }
//    }
//
//    static boolean isPrime(int n) {
//        if (n <= 1) return false;
//        if (n == 2) return true;
//        if (n % 2 == 0) return false;
//
//        for (int i = 3; i * i <= n; i+=2 ) {
//            if (n % i == 0) return false;
//        }
//
//        return true;
//    }

//    public static void tripletOrNot() {
//        System.out.println("Enter first numbers: ");
//        int a = input.nextInt();
//
//        System.out.println("Enter second numbers: ");
//        int b = input.nextInt();
//
//        System.out.println("Enter third numbers: ");
//        int c = input.nextInt();
//
//        if(isPythagoreanTriplet(a, b, c)) {
//            System.out.println("It is a Pythagorean Triplet.");
//        } else {
//            System.out.println("It is NOT a Pythagorean Triplet.");
//        }
//    }
//
//    static boolean isPythagoreanTriplet(int a, int b, int c) {
//        int x = Math.max(a, Math.max(b, c));
//        int y, z;
//
//        if (x == a) {
//            y = b;
//            z = c;
//        } else if (x == b) {
//            y = a;
//            z = c;
//        } else {
//            y = a;
//            z = b;
//        }
//        return (y * y + z * z) == (x * x);
//    }
    
//    public static void palindromeProgram() {
//        System.out.println("Enter a number: ");
//        int num = input.nextInt();
//        int n = num;
//        int reversed = 0;
//
//        while (n > 0) {
//            int digit = n % 10;
//            reversed = reversed * 10 + digit;
//            n /= 10;
//        }
//
//        if (num == reversed) {
//            System.out.println(num + " is a palindrome!");
//        } else {
//            System.out.println(num + " is not a palindrome");
//        }
//    }

//    public static void factorialProgram() {
//        System.out.println("Enter a number: ");
//        int num = input.nextInt();
//        int factorial = 1;
//        if (num < 0) {
//            System.out.println("Invalid!, to get a factorial, numbers must be positive. ");
//        }
//
//        if (num == 1 || num == 0) {
//            System.out.println("1! or 0! the result is 1 itself ");
//        }
//        for (int i = num; i > 0; i--) {
//            factorial *= i;
//            System.out.println("Your factorial is: " + factorial);
//        }
//    }

//    public static void gradeCalculator() {
//        System.out.println("Enter your marks out of 100: ");
//
//        double marks = input.nextDouble();
//        displayGrade(marks);
//    }

//    static void displayGrade(double marks) {
//        if (marks < 0 || marks > 100) {
//            System.out.println("Invalid marks! Enter between 0 and 100.");
//        }
//
//        if (marks >= 90) {
//            System.out.println("Grade is AB.");
//        } else if (marks >= 80) {
//            System.out.println("Grade is BB.");
//        } else if (marks >= 70) {
//            System.out.println("Grade is BC.");
//        } else if (marks >= 60) {
//            System.out.println("Grade is CD.");
//        } else if (marks >= 50) {
//            System.out.println("Grade is DD.");
//        } else {
//            System.out.println("Grade: Fail.");
//        }
//    }

//    My try
//    static void gradeCalculator() {
//        System.out.println("Enter your marks out of 100: ");
//
//        double marks = input.nextDouble();
//        if (marks <= 40) {
//            System.out.println("Your grade is fail.");
//        } else if (marks > 40 && marks < 51) {
//            System.out.println("Your grade is DD. ");
//        } else if (marks > 50 && marks < 61) {
//            System.out.println("Your grade is CD. ");
//        } else if (marks > 60 && marks < 71) {
//            System.out.println("Your grade is BC. ");
//        } else if (marks > 70 && marks < 81) {
//            System.out.println("Your grade is BB. ");
//        } else if (marks > 80 && marks < 91) {
//            System.out.println("Your grade is AB. ");
//        } else if (marks > 90 && marks < 101) {
//            System.out.println("Your grade is AA. ");
//        }
//    }

//    static void primeCheck() {
//        System.out.println("Enter a number to check if it's prime or not: ");
//
//        int num = input.nextInt();
//
//        if (isPrime(num)) {
//            System.out.println(num + " is a Prime number");
//        } else {
//            System.out.println(num + " is NOT a prime number");
//        }
//    }

//    To check prime number
//    static boolean isPrime(int n) {
//        if (n <= 1) return false;
//        if (n == 2) return false;
//        if (n % 2 == 0) return false;
//
//        for (int i = 3; i * i <= n; i += 2) {
//            if (n % i == 0) return false;
//        }
//        return true;
//    }

//    static void circumferenceAndAreaOfCircle() {
//        System.out.println("Enter the radius of a circle: ");
//
//        float radius = input.nextFloat();
//        double circumference = circumferenceOfCircle(radius);
//        double area = areaOfCircle(radius);
//
//        System.out.println("Circumference and radius of the circle are: " + circumference + " and " + area);
//    }

//    static double circumferenceOfCircle(double r) {
//        return 2 * Math.PI * r;
//    }
//
//    static double areaOfCircle(double r) {
//        return Math.PI * r * r;
//    }

//    static void productOfTwoNumberEnteredByUser() {
//        System.out.println("Enter two numbers: ");
//
//        int num1 = input.nextInt();
//        int num2 = input.nextInt();
//
//        int product = num1 * num2;
//        System.out.println("Product of two numbers entered by the user " + product);
//    }

//    static void sumOfTwoNumberEnteredByUser() {
//        System.out.println("Enter two numbers: ");
//
//        int num1 = input.nextInt();
//        int num2 = input.nextInt();
//
//        int sum = num1 + num2;
//        System.out.println("Sum of two numbers entered by the user " + sum);
//    }

//    static void votingEligibility() {
//        System.out.println("Enter your age: ");
//
//        int age = input.nextInt();
//        if (age >= 18) {
//            System.out.println("You are ligible to vote");
//        } else {
//            System.out.println("You are NOT eligible to vote.");
//        }
//    }

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
