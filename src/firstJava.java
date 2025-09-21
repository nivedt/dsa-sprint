import java.util.Scanner;

public class firstJava {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
//        evenOrOdd();
//        nameAndGreet();
//        findSimpleInterest();
//        calculator();
//        largestAmongTwo();
//        inrToUsd();
//        fibonacciSeries(5);
//        palindromeOrNot("HelleH");
        armstrongOfTwoNumbers();
    }
//    Ninth program
    static void armstrongOfTwoNumbers() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter lower bound: ");
        int low = input.nextInt();

        System.out.println("Enter upper bound: ");
        int high = input.nextInt();

        System.out.println("Armstrong numbers between" + low + " and " + high + ":");
        for (int num = low; num <= high; num++) {
            if (isArmstrong(num)) {
                System.out.println(num + " ");
            }
        }
    }

    static boolean isArmstrong(int num) {
        int temp = num;
        int digits = String.valueOf(num).length();
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        return sum == num;
    }

//    Eighth program
//    static boolean palindromeOrNot(String s) {
//
//        if (s == null) return false;
//        int i = 0, j = s.length() - 1;
//        while (i < j) {
//            if(s.charAt(i) != s.charAt(j)) return false;
////            System.out.println("False");
//            i++; j--;
//        }
//        System.out.println("True");
//        return true;
//    }

//    Seventh program
//    static void fibonacciSeries(int num) {
//        int n = 10, firstNum = 0, secondNum = 1;
//        int nextNum;
//
//        for (int i=1; i<=n; i++) {
//            System.out.print(firstNum + ", ");
//            nextNum = firstNum + secondNum;
//            firstNum = secondNum;
//            secondNum = nextNum;
//        }

//        int num1 = 0;
//        int num2 = 1;
//        int nextNum = 0;
//        for (int i = 2; i < num; i++) {
//            nextNum = num1 + num2;
//            num1 = num2;
//            num2 = nextNum;
////            System.out.println(nextNum);
//        }
//        System.out.println("Fibo series sum is: " + nextNum);
//    }

//    Sixth program
//    static void inrToUsd() {
//        int rupees = input.nextInt();
//        double usd = rupees * 0.011;
//        System.out.println("Your have " + usd + "dollars");
//    }

//    Fifth program
//    static void largestAmongTwo() {
//        int num1 = input.nextInt();
//        int num2 = input.nextInt();
//        int max = num1;
//        if(max > num2) {
//            max = num1;
//        } else {
//            max = num2;
//        }
//        System.out.println("Largest numbers among two: " + max);
//    }

//    Fourth program
//    static void calculator() {
//        int number1 = input.nextInt();
//        int number2 = input.nextInt();
//        int result;
//        System.out.print("Type the operator: ");
//        String operator = input.next();
//        if (operator == "+") {
//            result = number1 + number2;
//            System.out.println("Sum of two numbers: " + result);
//        } else if (operator == "-") {
//            result = number1 - number2;
//            System.out.println("Subtraction of two numbers: " + result);
//        } else if (operator == "*") {
//            result = number1 * number2;
//            System.out.println("Multipying two numbers: " + result);
//        } else if (operator == "/") {
//            result = number1 / number2;
//            System.out.println("Dividing two numbers: " + result);
//        }
//    }

//    Third program
//    static void findSimpleInterest() {
//        System.out.println("Enter your principal, rate and time to find the SI, consider P is in $, rate in % and time in years");
//        int principal = input.nextInt();
//        int rate = input.nextInt();
//        int time = input.nextInt();
//        int si = (principal*rate*time)/100;
//        System.out.println("The simple interest is " + si);
//    }

//    Second program
//    static void nameAndGreet() {
//        String name = input.next();
//        System.out.println("Hello darling, how are you " + name + "?");
//    }

//    First program
//    static void evenOrOdd() {
//        int number = input.nextInt();
//        if (number % 2 == 0) {
//            System.out.println("It's an even number");
//        } else {
//            System.out.println("It's an odd number");
//        }
//    }
}
