import java.util.Scanner;

class BirthDay {
    private String name;
    private int month;
    private int day;
    private int year;

    public BirthDay(String name, int month, int day, int year) {
        this.name = name;
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public boolean isValid() {
        if (month < 1 || month > 12) return false;
        if (day < 1 || day > 31) return false;
        if (year < 1950 || year > 2024) return false;
        return true;
    }

    public String getUsaFormat() {
        return String.format("%02d/%02d/%04d", month, day, year);
    }

    public String getEnglandFormat() {
        return String.format("%02d/%02d/%04d", day, month, year);
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            String input1 = scanner.nextLine();
            String input2 = scanner.nextLine();

            String[] parts1 = input1.split(", ");
            String[] parts2 = input2.split(", ");

            if (parts1.length != 4 || parts2.length != 4) {
                System.out.println("Invalid Input");
                return;
            }

            BirthDay userBirthday = new BirthDay(parts1[0], Integer.parseInt(parts1[1]), Integer.parseInt(parts1[2]), Integer.parseInt(parts1[3]));
            BirthDay friendBirthday = new BirthDay(parts2[0], Integer.parseInt(parts2[1]), Integer.parseInt(parts2[2]), Integer.parseInt(parts2[3]));

            if (!userBirthday.isValid() || !friendBirthday.isValid()) {
                System.out.println("Invalid Input");
                return;
            }

            System.out.println("In the USA my birthday is: " + userBirthday.getUsaFormat());
            System.out.println("In England my birthday is: " + userBirthday.getEnglandFormat());
            System.out.println("In the USA my friend " + friendBirthday.getName() + "'s birthday is: " + friendBirthday.getUsaFormat());
            System.out.println("In England my friend " + friendBirthday.getName() + "'s birthday is: " + friendBirthday.getEnglandFormat());
        } catch (Exception e) {
            System.out.println("Invalid Input");
        } finally {
            scanner.close();
        }
    }
                  }
