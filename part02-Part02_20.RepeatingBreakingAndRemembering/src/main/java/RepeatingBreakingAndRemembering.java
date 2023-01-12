
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int repeat = 0, sum = 0, count = 0, even = 0, odd = 0;
        double average = 0.0;

        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        System.out.println("Give numbers:");

        while (repeat != -1) {
            repeat = scanner.nextInt();
            if (repeat >= 0) {
                sum += repeat;
                count++;
                average = 1.0 * sum / count;
                if (repeat % 2 == 0) {
                    even++;

                } else {
                    odd++;
                }
            }

        }
       
        System.out.println("Thx!Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + average);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);

    }

}
