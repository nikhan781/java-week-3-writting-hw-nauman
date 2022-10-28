import java.util.Scanner;

public class Programme_13_FindTheDayName {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number between 1 to 7 : ");
        int day = scanner.nextInt();
        findTheDaysName(day);
        scanner.close();

    }

    public static void findTheDaysName(int day) {
        switch (day) {
            case 1:
                System.out.println("Its Monday");
                break;
            case 2:
                System.out.println("It is Tuesday");
                break;
            case 3:
                System.out.println("It is Wednesday");
                break;
            case 4:
                System.out.println("It is Thursday");
                break;
            case 5:
                System.out.println("It is Friday");
                break;
            case 6:
                System.out.println("It is Saturday");
                break;
            case 7:
                System.out.println("It is Sunday");
                break;
            default:
                System.out.println("Week contains 1 to 7 days");
        }
    }
}