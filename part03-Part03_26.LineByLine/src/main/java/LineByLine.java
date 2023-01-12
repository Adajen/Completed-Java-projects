
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
        String[] arrayLine;

        while (true){
            String userInput = scanner.nextLine();
            if (userInput.equals("")) {
                break;
            }

             arrayLine = userInput.split(" ");

            for (String word : arrayLine) {
            System.out.println(word);
            }
        }
    }
}
