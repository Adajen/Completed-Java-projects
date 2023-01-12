
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        divisibleByThreeInRange(3, 6);
    }

    public static void divisibleByThreeInRange(int begining, int end) {
        while (begining <= end) {
            if (begining % 3 == 0) {
                System.out.println(begining);

            }
            begining++;
        }
    }

}
