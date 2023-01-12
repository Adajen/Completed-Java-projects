
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first, sum = 0;
        int second;

        System.out.print("First number?");
        first = scanner.nextInt();

        System.out.print("Last number?");
        second = scanner.nextInt();

        for (int i = first; first <= second; first++) {
            sum += first;
        }

        System.out.print("The sum is: " + sum);

    }

}
