import java.util.Scanner;

public class DNASwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder finalString = new StringBuilder();

        System.out.println("Enter 8 DNA nucleotides (one by one):");
        int count = 0;
        while (count < 8) {
            char nucleotide = scanner.next().charAt(0);
            switch (Character.toUpperCase(nucleotide)) {
                case 'A':
                    System.out.println("Adenine");
                    break;
                case 'C':
                    System.out.println("Cytosine");
                    break;
                case 'G':
                    System.out.println("Guanine");
                    break;
                case 'T':
                    System.out.println("Thymine");
                    break;
                default:
                    System.out.println("Unknown");
                    break;
            }
            finalString.append(nucleotide);
            count++;
        }

        System.out.println("Final string: " + finalString.toString());
    }
}
