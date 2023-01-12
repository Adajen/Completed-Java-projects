
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age, name = 0;
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] piece = input.split(",");
            age = Integer.valueOf(piece[1]);
            
            if(age > name){
                name = age;
            }
            
        }

        System.out.println("Age of the oldest: " + name);

    }
}
