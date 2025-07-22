import java.util.Scanner;

public class flowOfProgram {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
//        leapYearOrNot();
//        System.out.println(leapYearOrNot());
//        sumOfTwo();
//        multiplicationTable();
//        hcfLcmOfTwo();
        takeNumbersUntilX();
    }

//    Program Five
    static void takeNumbersUntilX() {
        System.out.println("Enter a number: ");
        boolean number = true;
        while (number) {
            String num = input.next();
            if (num.equals("X") || num.equals("x")) {
                System.out.println("You are found at X");
                number = false;
//                break;  // Not required because of the boolean type already present
            }
        }
    }

//    Program Four
//    static void hcfLcmOfTwo() {
//        System.out.println("Enter a number one: ");
//        int num1 = input.nextInt();
//        System.out.println("Enter a number two: ");
//        int num2 = input.nextInt();
//        int hcf = findHcf(num1, num2);
//        // This will make the change of the original num1 and num2
//        // That's why make a function call to findHcf() with the two numbers
////        while (num2 != 0) {
////            int temp = num2;
////            num2 = num1 % num2;
////            num1 = temp;
////        }
////        hcf = num1;
//
//        int lcm = (num1 * num2) / hcf;
//        System.out.println("This is the " + hcf + " and " + lcm + " of " + num1 + " and " + num2);
//    }
//
//
//    static int findHcf(int a, int b) {
//        while (b != 0) {
//            int temp = b;
//            b = a % b;
//            a = temp;
//        }
//        return a;
//    }

//    Program Three
//    static void multiplicationTable() {
//        System.out.println("Enter a number you want multiplication table of: ");
//        int number = input.nextInt();
//        for (int i = 1; i < 11; i++) {
//            int product = number * i;
//            System.out.println(number + "*" + i + "=" + product);
//        }
//    }

//    Program Two
//    static int sumOfTwo() {
//        System.out.println("Enter two numbers: ");
//        int num1 = input.nextInt();
//        int num2 = input.nextInt();
//        int sum = num1 + num2;
//        System.out.println("Sum is: " +sum);
//        return sum;
//    }

//    Program One
//    static boolean leapYearOrNot() {
//        int year = input.nextInt();
//
//        if(year % 4 != 0) {
//            System.out.println("Not a leap year");
//            return false;
//        } else if (year % 100 != 0) {
//            System.out.println("It's leap year");
//            return true;
//        } else if (year % 400 == 0) {
//            System.out.println("Yo, it's a leap year");
//            return true;
//        } else {
//            System.out.println("Nope, not a leap year");
//            return false;
//        }
//    }
}