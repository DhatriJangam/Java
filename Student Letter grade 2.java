import java.util.Scanner;

public class StudentLetterGrade2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your grade:");
        int grade = scanner.nextInt();
        char letterGrade;

        switch (grade / 10) {
            case 10:
                letterGrade = 'A';
                break;
            case 9:
                letterGrade = 'A';
                break;
            case 8:
                letterGrade = 'B';
                break;
            case 7:
                letterGrade = 'C';
                break;
            case 6:
                letterGrade = 'D';
                break;
            default:
                letterGrade = 'F';
                break;
        }

        // Special case for A+
        if (grade == 100) {
            System.out.println("Your grade is A+");
        } else {
            System.out.println("Your grade is " + letterGrade);
        }
    }
}
