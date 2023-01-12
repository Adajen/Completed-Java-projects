
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        int sum = 0, count = 0, dob = 0, nameLength, store = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] piece = input.split(",");
            sum += Integer.valueOf(piece[1]);
            count++;
            nameLength = piece[0].length();

            if (store < nameLength) {
                store = nameLength;
                name = piece[0];
            }

        }

        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + 1.0 * sum / count);

    }
}
