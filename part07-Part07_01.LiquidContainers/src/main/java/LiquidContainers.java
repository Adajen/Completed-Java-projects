
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstContainer = 0;
        int secondContainer = 0;
        int volume = 100;

        while (true) {

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            System.out.println("First: " + firstContainer + "/" + volume);
            System.out.println("Second: " + secondContainer + "/" + volume);

            if (command.equals("add") && amount >= 0) {
                if (firstContainer <= volume) {
                    firstContainer += amount;
                    if (firstContainer > volume) {
                        firstContainer = volume;
                    }

                }
            } else if (command.equals("move") && amount >= 0) {
                if ((firstContainer - amount) >= 0) {
                    secondContainer += amount;
                    firstContainer -= amount;
                    if (secondContainer >= volume) {
                        secondContainer = volume;
                    }
                } else if ((firstContainer - amount) < 0) {
                    secondContainer += firstContainer;
                    firstContainer = 0;
                    if (secondContainer >= volume) {
                        secondContainer = volume;
                    }
                }
            } else if (command.equals("remove") && amount >= 0) {
                if ((secondContainer - amount) >= 0) {
                    secondContainer -= amount;
                } else if ((secondContainer - amount) < 0){
                    secondContainer = 0;
                }
            }

        }

        System.out.println("First: " + firstContainer + "/" + volume);
        System.out.println("Second: " + secondContainer + "/" + volume);
    }

}