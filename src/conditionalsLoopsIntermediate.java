import java.util.Scanner;

public class conditionalsLoopsIntermediate {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
//        factorial(4);
//        electricBill();
//        averageOfN();
//        discountOfProduct();
//        distanceBetweenTwoPoints();
//        commissionPercentage();
//        powerInJava();
//        depreciatedValue();
//        battingAverage();
//        cgpaProgram();
//        compoundInterest();
//        averageMarks();
//        sumOfNNumbers();
//        armstrongNumber();
//        nPrAndnCr();
        reverseAString();


    }
    public static void reverseAString() {
        System.out.println("Enter ");
    }
//    static long factorial(int num) {
//        long fact = 1;
//        for (int i = 1; i <= num; i++) {
//            fact *= i;
//        }
//        return fact;
//    }
//
//    public static void nPrAndnCr() {
//        System.out.println("Enter your n and r respectively: ");
//        int n = input.nextInt();
//        int r = input.nextInt();
//
//        if (r > n || n < 0 || r < 0) {
//            System.out.println("Invalid input! Make sure that 0 <= r <= n.");
//        } else {
//            long npr = factorial(n) / factorial(n-r);
//            long ncr = factorial(n) / (factorial(r) * factorial(n-r));
//
//            System.out.println("nPr = " + npr);
//            System.out.println("nCr = " + ncr);
//        }
//        input.close();
//    }

    // Error in the method, refer Chat
//    public static void nPrAndnCr() {
//        Refer Chatgpt for this: Your error “illegal start of expression / type / identifier expected"
//        ERROR: You cannot define a method inside another method
//        ----------------------------------------------------

//        static long factorial(int num) {
//            long fact = 1;
//            for (int i = 1; i <= num; i++) {
//                fact *= i;
//            }
////            return fact; // Not required because the actual function is the to find the nPr and nCr.
//            // Especially here return is not required since it's a void function.
//        }
//        ----------------------------------------------------
//
//        System.out.println("Enter your n and r respectively: ");
//        int n = input.nextInt();
//        int r = input.nextInt();
//
//        if (r > n || n < 0 || r < 0) {
//            System.out.println("Invalid input! Make sure that 0 <= r <= n.");
//        } else {
//            long npr = factorial(n) / factorial(n-r);
//            long ncr = factorial(n) / (factorial(r) * factorial(n-r));
//
//            System.out.println("\nPr = " + npr);
//            System.out.println("\nCr = " + ncr);
//        }
//        input.close();
//    }


//    public static void armstrongNumber() {
//        System.out.println("Enter a number: ");
//        int num = input.nextInt();
//
//        int originalNum = num;
//        int sum = 0;
//
//        int n = String.valueOf(num).length();
//
//        while (num > 0) {
//            int digit = num % 10;
//            sum += Math.pow(digit, n);
//            num /= 10;
//        }
//
//        if (sum == originalNum) {
//            System.out.println(originalNum + " is an Armstrong number.");
//        } else {
//            System.out.println(originalNum + " is not an Armstrong number.");
//        }
//        input.close();
//    }

//    Trial Amstrong
//    public static void armstrongNumber() {
//        System.out.println("Enter a number: ");
//        int number = input.nextInt();
//        int n = 0;
//        int length = String.valueOf(number).length();
//        int theNumber = 0;
//
////        while (n != 0) {
//        for (int i = 0; i < length; i++) {
//            n = number % 10;
//            theNumber += Math.pow(n, length);
//
//            System.out.println(n + " " + theNumber);
//            n /= 10;
//            System.out.println(n);
////            if6669
//        }
//        System.out.println("Your Armstrong number is: " + theNumber);
//    }

//    public static void sumOfNNumbers() {
//        System.out.println("Enter how many number you want to add: ");
//        int n = input.nextInt();
//
//        int sum = 0;
//
//        for (int i = 1; i <= n; i++) {
//            System.out.print("Enter number " + i + ": ");
//            int num = input.nextInt();
//            sum += num;
//        }
//
//        System.out.println("\nSum of " + n + " numbers = " + sum);
//
//        input.close();
//    }

//        public static void averageMarks() {
//        System.out.println("Enter the total number of subjects: ");
//        int subjects = input.nextInt();
//        double totalMarks = 0.0;
//        System.out.println("Now enter each subject grades: ");
//        for (int i = 0; i < subjects; i++) {
//            double marks = input.nextDouble();
//            totalMarks += marks;
//        }
//        double averageMarks = totalMarks / subjects;
//        System.out.println("Your average marks is: %.2f%n " + totalMarks);
//        System.out.println("Your average marks is: %.2f%n " + averageMarks);
//    }

//    public static void compoundInterest() {
//        double amount = 0.0;
//        System.out.print("Enter principal amount (intital investment): ");
//        double principalAmount = input.nextDouble();
//        System.out.print("Enter amount annual interest rate (%): ");
//        double rate = input.nextDouble();
//        System.out.print("Enter time in year: ");
//        double time = input.nextDouble();
//
//        amount = principalAmount * (Math.pow((1 + rate/100),time));
//        double compoundInterest = amount - principalAmount;
//        System.out.println("Your compound interest is: " + compoundInterest);
//    }

//    public static void cgpaProgram() {
//        System.out.println("Enter the total number of subjects: ");
//        int subjects = input.nextInt();
//        double grades = 0.0;
//        System.out.println("Now enter each subject grades: ");
//        for (int i = 0; i < subjects; i++) {
//            grades += input.nextDouble();
//        }
//        double cgpa = grades / subjects;
//        System.out.println("Your cgpa is: " + cgpa);
//    }

//    public static void battingAverage() {
//        System.out.println("Enter the number of runs scored: ");
//        double totalRunsScored = input.nextDouble();
//        System.out.println("Enter number of times player goes out: ");
//        double numberOfTimesOut = input.nextDouble();
//
//        double battingAvgValue = totalRunsScored / numberOfTimesOut;
//        if (numberOfTimesOut == 0) {
//            System.out.println("Batting average cannot be calculated (player never got out).");
//        } else {
//            System.out.println("Your Batting Average Value is: " + battingAvgValue);
//        }
//        input.close();
//    }



//    public static void depreciatedValue() {
//        System.out.println("Enter the Original value of the asset: ");
//        double assestValue = input.nextDouble();
//        System.out.println("Enter depreciation rate (in %): ");
//        double depRate = input.nextDouble();
//        System.out.println("Enter the time period (in Years): ");
//        int time = input.nextInt();
//
//        double depValue = assestValue * (Math.pow((1 - (depRate/100)), time));
//        System.out.printf("Your Depreciated Value after %d years = %.2f", time, depValue);
//    }

//    public static void powerInJava() {
//        System.out.println("Enter the base: ");
//        int base = input.nextInt();
//        System.out.println("Enter the power that's an integer: ");
//        int exponent = input.nextInt();
//
//        long result = 1;
//        for (int i = 1; i <= exponent; i++) {
//            result *= base;
//        }
//        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
//    }

//    public static void commissionPercentage() {
//        System.out.println("Enter your total sales amount: ");
//        double totalSalesAmount = input.nextDouble();
//        System.out.println("Enter commission amount: ");
//        double commissionAmount = input.nextDouble();
//
//        if (totalSalesAmount < 0 || commissionAmount < 0) {
//            System.out.println("Invalid input! Sales Sales must be positive and commission cannot be negative.");
//            return;
//        }
//        double comPercentage = (commissionAmount / totalSalesAmount) * 100;
//        System.out.println("Your commission percentage =  %.2f%%" + comPercentage);
//        System.out.println("Your commission percentage is: " + comPercentage);
//    }
//    public static void distanceBetweenTwoPoints() {
//
//        System.out.println("Enter x1: ");
//        double x1 = input.nextFloat();
//        System.out.println("Enter y1: ");
//        double y1 = input.nextFloat();
//        System.out.println("Enter x2: ");
//        double x2 = input.nextFloat();
//        System.out.println("Enter y2: ");
//        double y2 = input.nextFloat();
//
//        double distance = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
//        System.out.println("The distance between (" + x1 +", " + y1 + ") and (" + x2 + ", " + y2 + ") is " + distance);
//
//    }

//    public static void discountOfProduct() {
//        double discountAmount = 0, finalPrice = 0;
//
//        System.out.println("Enter the Original price: ");
//        double originalPrice = input.nextDouble();
//        System.out.println("Enter the Discount percentage: ");
//        float discountPercent = input.nextFloat();
//        if (originalPrice < 0 || discountPercent < 0) {
//            System.out.println("Invalid input! Price and discount cannot be negative.");
//            return;
//        }
//
//        discountAmount = (discountPercent / 100) * originalPrice;
//        finalPrice = originalPrice - discountAmount;
//        System.out.println("Your Discounted amount: " + discountAmount + " and this is your Final Price: " + finalPrice);
//    }

//    public static void averageOfN() {
//        double eachNumber = 0;
//        System.out.println("Enter total number: ");
//        double totalNumber = input.nextDouble();
//        System.out.println("Enter the " + totalNumber + " number one by one: ");
//        for (int i = 0; i < totalNumber; i++) {
//            eachNumber += input.nextInt();
//        }
//        double average = eachNumber /totalNumber;
//        System.out.println("Your average is: " + average);
////        return average;
//    }

//    public static void electricBill() {
//        double bill = 0;
//        System.out.println("Enter the number of units consumed: ");
//        float units = input.nextInt();
//        if (units < 0) {
//            System.out.println("Invalid input! Units cannot be negative.");
//            return;
//        }
//
//        if (units <= 100) {
//            bill = units * 1.5;
//        } else if (units <= 200) {
//            bill = (100 * 1.5) + (units - 100) * 2.5;
//        } else if (units <= 300) {
//            bill = (100 * 1.5) + (100 * 2.5) + (units - 200) * 4.0;
//        } else {
//            bill = (100 * 1.5) + (100 + 2.5) + (100 * 4.0) + (units - 300) * 5.0;
//        }
//
//        System.out.println("Your bill is: " + bill);
//    }

//    Trial method
//    public static void electricBill() {
//        double bill = 0;
//        System.out.println("Enter the number of units consumed: ");
//        float numberOfUnitsConsumed = input.nextInt();
//        if (numberOfUnitsConsumed < 0) {
//            System.out.println("Invalid input");
//            return;
//        }
//
//        if (numberOfUnitsConsumed > 0 && numberOfUnitsConsumed < 101) {
//            numberOfUnitsConsumed *= 1.5;
//        } else if (numberOfUnitsConsumed > 100 && numberOfUnitsConsumed < 201) {
//            numberOfUnitsConsumed *= 2.5;
//        } else if (numberOfUnitsConsumed > 200 && numberOfUnitsConsumed < 301) {
//            numberOfUnitsConsumed *= 4.0;
//        } else {
//            numberOfUnitsConsumed *= 5.0;
//        }
//        bill = numberOfUnitsConsumed;
//        System.out.println("Your bill is: " + bill);
//    }


//    public static int factorial(int n) {
//        int factorial = 1;
//
//        for (int i = n; i > 0; i--) {
//            factorial *= i;
////            System.out.println(factorial);
//        }
//        System.out.println(factorial);
//        return factorial;
//    }
}
