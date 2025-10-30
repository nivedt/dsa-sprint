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
//        reverseAString();
//        palindromeOrNot();
//        palindromeString();
//        futureInvestmentValue();
//        futureInvestmentValueMonthly();
//        hcfOfTwoNumbers();
//        lcmOfTwoNumbers();
//        vowelOrConsonant();
//        perfectNumber();
//        leapYearOrNot();
//        sumOfADigitsOfNumber();
//        numberOfDaysKunalCanGoOut();
        sumOfNegativeAndPositiveNumbers();

    }
    public static void sumOfNegativeAndPositiveNumbers() {
        System.out.println("Enter a series of number: ");
        int sumNegative = 0;
        int sumEven = 0;
        int sumOdd = 0;
        int number;

        while (true) {
            number = input.nextInt();
            if (number == 0) {
                break;
            }

            if (number < 0) {
                sumNegative += number;
            } else if (number % 2 == 0) {
                sumEven += number;
            } else {
                sumOdd += number;
            }
        }
        System.out.println("Sum of negative numbers: " + sumNegative);
        System.out.println("Sum of positive even numbers: " + sumEven);
        System.out.println("Sum of positive odd numbers: " + sumOdd);
    }

//    public static void numberOfDaysKunalCanGoOut() {
//        int daysInAugust = 31;
//        int sum = 0;
//        for (int day = 1; day <= daysInAugust; day++){
//            if (day % 2 == 0){
//                sum += 1;
//            }
//        }
//        System.out.println(sum + " are the number of days that Kunal can go out!");
//    }

//    public static void sumOfADigitsOfNumber() {
//        System.out.println("Enter an integer: ");
//        int n = input.nextInt();
//        int sum = 0;
//
//        while (n != 0) {
//            sum += n % 10;
//            n /= 10;
//        }
//        System.out.println(sum + " is the sum of digits of a number.");
//    }

//    public static void leapYearOrNot() {
//        System.out.println("Enter a year: ");
//        int year = input.nextInt();
//
//        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
//            System.out.println(year + " is a leap year.");
//        } else {
//            System.out.println(year + " is NOT a leap year.");
//        }
//        input.close();
//    }

//    public static void perfectNumber() {
//        System.out.println("Enter a number: ");
//        int num = input.nextInt();
//        int sum = 0;
//
//        for (int i = 1; i <= num / 2; i++) {
//            if (num % i == 0) {
//                sum += i;
//            }
//        }
//
//        if (sum == num && num != 0) {
//            System.out.println(num + " is a Perfect Number.");
//        } else {
//            System.out.println(num + " is NOT a Perfect Number");
//        }
//        input.close();
//    }

//    public static void vowelOrConsonant() {
//        System.out.println("Enter a letter: ");
//        char ch = input.next().charAt(0);
//
//        if ((ch >= 'a' && ch <= 'z' ) || (ch >= 'A' && ch <= 'Z')) {
//
//            ch = Character.toLowerCase(ch);
//
//            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//                System.out.println("It's a Vowel");
//            } else {
//                System.out.println("It's a Consonant.");
//            }
//        } else {
//            System.out.println("Invalid input! Please enter an alphabet.");
//        }
//        input.close();
//    }

//    public static void lcmOfTwoNumbers() {
//        System.out.print("Enter first number: ");
//        int num1 = input.nextInt();
//
//        System.out.print("Enter second number: ");
//        int num2 = input.nextInt();
//
//        int a = num1;
//        int b = num2;
//
//        // Step 1: Find HCF using Euclidean Algorithm
//        while (b != 0) {
//            int temp = b;
//            b = a % b;
//            a = temp;
//        }
//
//        int hcf = a;
//
//        int lcm = (num1 * num2) / hcf;
//
//        System.out.println("HCF of " + num1 + " and " + num2 + " = " + hcf);
//        System.out.println("LCM of " + num1 + " and " + num2 + " = " + lcm);
//        input.close();
//    }

//    public static void hcfOfTwoNumbers() {
//        System.out.println("Enter first number: ");
//        int num1 = input.nextInt();
//
//        System.out.println("Enter second number: ");
//        int num2 = input.nextInt();
//
//        int hcf = 1;
//
//        for (int i = 1; i <= num1 && i < num2; i++) {
//            if (num1 % i ==0 && num2 % i == 0) {
//                hcf = i;
//            }
//        }
//
//        System.out.println("HCF of " + num1 + " and " + num2 + " is: " + hcf);
//        input.close();
//    }

//    public static void futureInvestmentValueMonthly() {
//        System.out.println("Enter PTR respectively for monthly: ");
//        double principal = input.nextDouble();
//        double rate = input.nextDouble();
//        int time = input.nextInt();
//
//        double futureValue = principal * (Math.pow((1 + rate/100*12), 12*time));
//        System.out.printf("Future Investment Value after %d years: %.2f", time, futureValue);
//        input.close();
//    }

//    public static void futureInvestmentValue() {
//        System.out.println("Enter PTR respectively: ");
//        double principal = input.nextDouble();
//        double rate = input.nextDouble();
//        int time = input.nextInt();
//
//        double futureValue = principal * (Math.pow((1 + rate/100), time));
//        System.out.printf("Future Investment Value after %d years: %.2f", time, futureValue);
//        input.close();
//    }

//    public static void palindromeString() {
//        System.out.println("Enter a String: ");
//        String str = input.nextLine();
//
//        String reversed = new StringBuilder(str).reverse().toString();
//
//        if (str.equalsIgnoreCase(reversed)) {
//            System.out.println(str + " is a palindrome");
//        } else {
//            System.out.println(str + " is NOT a palindrome");
//        }
//    }

//    public static void palindromeOrNot() {
//        System.out.println("Enter a number: ");
//        int number = input.nextInt();
//
//        int originalNumber = number;
//        int reversed = 0;
//
//        while (number != 0) {
//            int digit = number % 10;
//            reversed = reversed * 10 + digit;
//            number = number / 10;
//        }
//
//        if (originalNumber == reversed) {
//            System.out.println(originalNumber + " is a palindrome number.");
//        } else {
//            System.out.println(originalNumber + " is NOT a palindrome number.");
//        }
//    }

    // This is a trial by me
//    public static void palindromeOrNot() {
//        System.out.println("Enter a number to check if it's a palindrome or not: ");
//        int number = input.nextInt();
//        int length = String.valueOf(number).length();
////        System.out.println(length);
//        int reversed = 0;
//
//        for (int i = 0; i < length; i++) {
//            int temp = number % 10;
//            System.out.println(temp);
////            reversed = (temp * 10) + temp;
////            System.out.println(temp);
//            number /= 10;
//            reversed = (reversed * 10) + temp;
//            System.out.println(reversed);
////            System.out.println(number);
//
//
//        }
//        if (number == reversed) {
//            System.out.println("This is a palindrome number");
//        } else {
//            System.out.println("It's not a palindrome!");
//        }
////        System.out.println(reversed);
//        input.close();
//    }

//    public static void reverseAString() {
//        System.out.println("Enter a string: ");
//        String word = input.next();
//        int length = word.length();
//        String reversedWord = "";
//        for (int i = length - 1; i >= 0; i--) {
//            reversedWord += word.charAt(i);
//        }
//        System.out.println("This is your reversed string: " + reversedWord);
//        input.close();
//    }

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
