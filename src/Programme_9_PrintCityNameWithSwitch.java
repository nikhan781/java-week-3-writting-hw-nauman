import java.util.Scanner;

public class Programme_9_PrintCityNameWithSwitch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please neter alphabet between A to F : ");
        String city = scanner.next().toUpperCase();
        Programme_9_PrintCityNameWithSwitch cityName = new Programme_9_PrintCityNameWithSwitch();
        cityName.printCityName(city);
        scanner.close();

    }

    public void printCityName(String city) {
        switch (city) {
            case "A":
                System.out.println("Aberdeen");
                break;
            case "B":
                System.out.println("belfast");
                break;
            case "C":
                System.out.println("Cambridge");
                break;
            case "D":
                System.out.println("Derby");
                break;
            case "E":
                System.out.println("Edinburgh");
                break;
            case "F":
                System.out.println("Feltham");
                break;
            default:
                System.out.println("The alphabet you enter us not between A to F");
        }
    }
}
