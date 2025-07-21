import java.util.Scanner;

public class flowOfProgram {
    public static void main(String[] args) {
        leapYearOrNot();
//        System.out.println(leapYearOrNot());
    }
    static void leapYearOrNot() {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();

        if(year % 4 != 0) {
            System.out.println("Not a leap year");
        } else if (year % 100 != 0) {
            System.out.println("Not a leap year");
        } else if (year % 400 == 0) {
            System.out.println("Yo, it's a leap year");
        } else {
            System.out.println("Nope, not a leap year");
        }

    }
}