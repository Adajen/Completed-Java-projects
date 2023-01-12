
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> home = new ArrayList<>();
        ArrayList<String> visitor = new ArrayList<>();
        ArrayList<Integer> point1 = new ArrayList<>();
        ArrayList<Integer> point2 = new ArrayList<>();
        int gamesCount = 0;
        int winCount = 0;
        int lossCount = 0;

        System.out.println("File:");
        String file = scan.nextLine();

        System.out.println("Team:");
        String whichTeam = scan.nextLine();

        try (Scanner scanner = new Scanner(Paths.get(file))) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                String[] parts = line.split(",");
                home.add(parts[0]);
                visitor.add(parts[1]);
                point1.add(Integer.valueOf(parts[2]));
                point2.add(Integer.valueOf(parts[3]));

            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        for (int i = 0; i < home.size(); i++) {
            if (whichTeam.equals(home.get(i))) {
                gamesCount++;
                if (point1.get(i) > point2.get(i)) {
                    winCount++;
                } else {
                    lossCount++;
                }
            }
        }

        for (int i = 0; i < visitor.size(); i++) {
            if (whichTeam.equals(visitor.get(i))) {
                gamesCount++;
                if (point2.get(i) > point1.get(i)) {
                    winCount++;
                } else {
                    lossCount++;
                }
            }
        }

        System.out.println("Games: " + gamesCount);
        System.out.println("Wins: " + winCount);
        System.out.println("Losses: " + lossCount);
    }

}
