import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine().trim();
        
        switch (option) {
            case "A":
                System.out.println(21 / 3 + (3 * 9) * 9 + 5);
                break;
            case "B":
                System.out.println((17 - 7) * 6 + 2 + 56 - 8);
                break;
            case "C":
                System.out.println(10 + 8 * 90 / 9 - 4);
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }
}
