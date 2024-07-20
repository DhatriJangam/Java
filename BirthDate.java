import java.util.Scanner;

public class BirthDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        String[] parts = input.split(",");
        if (parts.length != 3) {
            System.out.println("Invalid Input");
            return;
        }
        
        try {
            int month = Integer.parseInt(parts[0].trim());
            int day = Integer.parseInt(parts[1].trim());
            int year = Integer.parseInt(parts[2].trim());
            
            if (month > 0 && month < 13 && day > 0 && day < 31 && year > 1920 && year < 2020) {
                System.out.printf("My birthday is: %02d/%02d/%04d\n", month, day, year);
            } else {
                System.out.println("Invalid Input");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid Input");
        }
    }
}
