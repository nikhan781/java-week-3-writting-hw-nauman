import java.util.Scanner;

public class Programme_16_FindPositiveNegative {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre a number:");
        int number = scanner.nextInt();
        findNumberIsPositiveNegativeOrZero(number);
        scanner.close();
    }

    public static void findNumberIsPositiveNegativeOrZero(int number) {
        if (number > 0) {
            System.out.println(number + " is a POSITIVE number");
        } else if (number < 0) {
            System.out.println(number + " is a NEGATIVE number");
        } else {
            System.out.println(number + " is ZERO");
        }
    }
}
