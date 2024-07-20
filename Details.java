import java.util.Scanner;

public class Details {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        String[] parts = input.split(",");
        if (parts.length != 3) {
            System.out.println("Invalid Input");
            return;
        }
        
        String name = parts[0].trim();
        String ageStr = parts[1].trim();
        String salaryStr = parts[2].trim();
        
        if (name.isEmpty() || !name.matches("[a-zA-Z ]+")) {
            System.out.println("Invalid Input");
            return;
        }
        
        try {
            int age = Integer.parseInt(ageStr);
            double salary = Double.parseDouble(salaryStr);
            
            if (age > 0 && age < 120 && salary > 0) {
                System.out.println("Input was successful.");
            } else {
                System.out.println("Invalid Input");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid Input");
        }
    }
}
