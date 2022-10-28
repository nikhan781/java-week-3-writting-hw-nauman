import java.util.Scanner;

public class Programme_3_MarkSheet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter Student name   \t\t:\t");
        String name = scanner.next();
        System.out.println("Enter the Student Roll Number \t\t:\t");
        int rollNum = scanner.nextInt();
        System.out.println("Enter Marks of Subject Math \t:\t");
        int mathsMark = scanner.nextInt();
        if (mathsMark < 0 || mathsMark > 100) {
            System.out.println("\nInvalid input, Marks should be between 0 to 100");
            System.out.println("Please enter correct marks\t\t:\t");
            mathsMark = scanner.nextInt();
        }
        System.out.println("Enter Marks of Subject Science \t:\t");
        int scienceMark = scanner.nextInt();
        if (scienceMark < 0 || scienceMark > 100) {
            System.out.println("\nInvalid input, Marks should be between 0 to 100");
            System.out.println("Please enter correct marks\t\t:\t");
            scienceMark = scanner.nextInt();
        }
        System.out.println("Enter Marks of Subject English \t:\t");
        int englishMark = scanner.nextInt();
        if (englishMark < 0 || englishMark > 100) {
            System.out.println("\nInvalid input, Marks should be between 0 to 100");
            System.out.println("Please enter correct marks\t\t:\t");
            englishMark = scanner.nextInt();
        }
        int total = sum(mathsMark, scienceMark, englishMark);
        int percentage = (total * 100) / 300;
        String result = calculateResult(mathsMark, scienceMark, englishMark);
        String grade = calculateGrade(percentage, result);
        printTheMarkSheet(name, rollNum, mathsMark, scienceMark, englishMark, total, percentage, result, grade);
        scanner.close();
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static String calculateResult(int mathsMark, int scienceMark, int englishMark) {
        if (mathsMark < 35 || scienceMark < 35 || englishMark < 35) {
            return "Fail";
        } else {
            return "Pass";
        }
    }

    public static String calculateGrade(int percentage, String result) {
        String grade = null;
        if (result.equalsIgnoreCase("pass")) {
            if (percentage >= 80) {
                grade = "A+";
            } else if (percentage >= 60) {
                grade = "A";
            } else if (percentage >= 50) {
                grade = "B";
            }
        } else if (percentage >= 35) {
            grade = "c";
        } else {
            grade = "-";
        }
        return grade;
    }

    public static void printTheMarkSheet(String name, int rollNum, int mathsMarks, int scienceMarks,
                                         int englishMarks, double total, double percentage, String result,
                                         String grade) {

        System.out.println("-----------------------------");
        System.out.println("|                           |");
        System.out.println("| Mark Sheet                |");
        System.out.println("|___________________________|");
        System.out.println("| Name:" + name + "                  |");
        System.out.println("| Roll No:" + rollNum + "                |");
        System.out.println("|___________________________|");
        System.out.println("| Subjects: Marks           |");
        System.out.println("|___________________________|");
        System.out.println("| Math:" + mathsMarks + "                   |");
        System.out.println("| Science:" + scienceMarks + "                |");
        System.out.println("| English:" + englishMarks + "                |");
        System.out.println("|___________________________|");
        System.out.println("| Total:" + total + "                |");
        System.out.println("|___________________________|");
        System.out.println("| Percentage:" + percentage + "           |");
        System.out.println("| Result:" + result + "               |");
        System.out.println("| Grade:" + grade + "                   |");
        System.out.println("|___________________________|");
    }
}




