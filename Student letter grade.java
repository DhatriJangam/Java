import java.util.Scanner;

public class StudentLetterGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] parts = input.split(",");
        if (parts.length != 3) {
            System.out.println("Invalid input");
            return;
        }

        try {
            int studentId = Integer.parseInt(parts[0].trim());
            float weeklyPoints = Float.parseFloat(parts[1].trim());
            float finalPoints = Float.parseFloat(parts[2].trim());

            if (weeklyPoints < 0 || weeklyPoints >= 50 || finalPoints < 0 || finalPoints >= 50) {
                System.out.println("Invalid input");
                return;
            }

            float finalGrade = weeklyPoints + finalPoints;

            if (finalGrade > 100 || finalGrade < 0) {
                System.out.println("Invalid input");
                return;
            }

            String letterGrade;
            if (finalGrade >= 93) {
                letterGrade = "A";
            } else if (finalGrade >= 90) {
                letterGrade = "A-";
            } else if (finalGrade >= 87) {
                letterGrade = "B+";
            } else if (finalGrade >= 83) {
                letterGrade = "B";
            } else if (finalGrade >= 80) {
                letterGrade = "B-";
            } else if (finalGrade >= 77) {
                letterGrade = "C+";
            } else if (finalGrade >= 73) {
                letterGrade = "C";
            } else if (finalGrade >= 70) {
                letterGrade = "C-";
            } else if (finalGrade >= 67) {
                letterGrade = "D+";
            } else if (finalGrade >= 63) {
                letterGrade = "D";
            } else if (finalGrade >= 60) {
                letterGrade = "D-";
            } else {
                letterGrade = "F";
            }

            System.out.printf("Student %d earned a grade of %.1f / %s.\n", studentId, finalGrade, letterGrade);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input");
        }

        scanner.close();
    }
                              }
