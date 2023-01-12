
import java.util.Scanner;

public class Adulthood {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here 
        System.out.println("How old are you?");
        int first = Integer.valueOf(scan.nextLine());

        int answer = first;
        if (answer < 18) {
            System.out.println("you are not an adult");
        } else {
            System.out.println("You are an adult");
        }

    }
}
