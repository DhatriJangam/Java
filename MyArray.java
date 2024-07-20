import java.util.Arrays;

public class MyArrays {
    public static void main(String[] args) {
        // Create a string array named Bollywood and add famous Bollywood actors
        String[] bollywood = {"Shah Rukh Khan", "Amitabh Bachchan", "Aamir Khan", "Salman Khan"};

        
        System.out.println(bollywood[0]);
        System.out.println(bollywood[1]);
        System.out.println(bollywood[2]);
        System.out.println(bollywood[3]);

        
        for (int i = 0; i < bollywood.length; i++) {
            System.out.println(bollywood[i]);
        }

        
        String[] bollywoodExtended = Arrays.copyOf(bollywood, bollywood.length + 1);
        bollywoodExtended[bollywood.length] = "Ranbir Kapoor";

        
        String searchElement = "Amitabh Bachchan";
        for (int i = 0; i < bollywoodExtended.length; i++) {
            if (bollywoodExtended[i].equals(searchElement)) {
                System.out.println(searchElement + " found at index " + i);
                break;
            }
        }
        Arrays.sort(bollywoodExtended);
        for (String actor : bollywoodExtended) {
            System.out.println(actor);
        }
        int[] ages = {25, 30, 35, 40, 45};
        for (int age : ages) {
            System.out.println(age);
        }
        Arrays.sort(ages);
        for (int age : ages) {
            System.out.println(age);
        }
    }
}
