import java.util.Scanner;

public class Programme_8_PrintCityName {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the alphabet between A to F : ");
        char city = scanner.next().charAt(0);
        Programme_8_PrintCityName printCityName = new Programme_8_PrintCityName();
        printCityName.printCityName(city);
        scanner.close();
    }

    public void printCityName(char city) {
        if (city == 'A' || city == 'a') {
            System.out.println("Aberdeen");
        } else if (city == 'B' || city == 'b') {
            System.out.println("Belfast");
        } else if (city == 'C' || city == 'c') {
            System.out.println("Cambridge");
        } else if (city == 'D' || city == 'd') {
            System.out.println("Derby");
        } else if (city == 'E' || city == 'e') {
            System.out.println("Edinburgh");
        } else if (city == 'F' || city == 'f') {
            System.out.println("Feltham");
        } else {
            System.out.println("The alphabet you enter is not between A and F");
        }
    }

}
