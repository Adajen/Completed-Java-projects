
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        double count = 0;

        while (true) {
            System.out.println(" ");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;

            }
            if (number > 0) {
                sum = sum + number;
                count++;
            }

        }
        if (count == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(sum / count);
        }
    }
}
