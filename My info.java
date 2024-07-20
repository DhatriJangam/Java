import java.util.Scanner;

public class MyInfo {
    private int age;
    private String firstName;
    private String lastName;
    private String city;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        String[] inputArray = input.split(",");
        if (inputArray.length != 4) {
            System.out.println("Invalid Input");
            return;
        }

        String firstName = inputArray[0].trim();
        String lastName = inputArray[1].trim();
        int age;
        String city = inputArray[3].trim();

        try {
            age = Integer.parseInt(inputArray[2].trim());
        } catch (NumberFormatException e) {
            System.out.println("Invalid Input");
            return;
        }

        if (isValidName(firstName) && isValidName(lastName) && isValidCity(city) && isValidAge(age)) {
            System.out.println("My Name is " + firstName + " " + lastName + ".");
            System.out.println("I am " + age + " years old and was born in " + city);
        } else {
            System.out.println("Invalid Input");
        }
    }

    private static boolean isValidName(String name) {
        return name.matches("[a-zA-Z]+");
    }

    private static boolean isValidCity(String city) {
        return city.matches("[a-zA-Z ]+");
    }

    private static boolean isValidAge(int age) {
        return age > 1 && age < 100;
    }
  }
