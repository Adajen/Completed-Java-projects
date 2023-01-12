
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age, name = 0;
        String oldest = "";

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] piece = input.split(",");
            age = Integer.valueOf(piece[1]);

            if (age > name) {
                name = age;
                oldest = piece[0];
            }

        }

        System.out.println("Name of the oldest: " + oldest);

    }
}
