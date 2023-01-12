
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.print("Last number?");
        int sq = scanner.nextInt();

        for (int i = 0; i <= sq; i++) {
            sum += i;
        }
        System.out.print("The sum is" + " "+ sum);

    }

}
