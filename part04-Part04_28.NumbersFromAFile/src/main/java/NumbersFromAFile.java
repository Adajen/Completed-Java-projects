
import java.util.ArrayList;
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        int rangeCount = 0;

        ArrayList<Integer> list = new ArrayList<>();
        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            while (fileScanner.hasNextLine()) {
                int lineIntVal = Integer.valueOf(fileScanner.nextLine());
                list.add(lineIntVal);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) >= lowerBound) {
                if (list.get(i) <= upperBound) {
                    rangeCount++;
                }
            }
        }

        System.out.println("Numbers: " + rangeCount);

    }

}
