
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String[]> array = new ArrayList<>();
        System.out.println("File:");
        String file = scan.nextLine();
        try (Scanner scanner = new Scanner(Paths.get(file))) {
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                //String firstClub =parts[0];
                // String secondClub =parts[1];
                // int firstClubScore=Integer.valueOf(parts[2]);
                //int secondClubScore=Integer.valueOf(parts[3]);
                array.add(parts);

            }

        } catch (Exception e) {
        }
        System.out.println("Team:");
        String team = scan.nextLine();
        int countGame = 0;
        int winCount = 0;
        int lossCount = 0;

        for (String[] strings : array) {
            if (strings[0].equals(team)) {
                countGame++;

                if (Integer.valueOf(strings[2]) > Integer.valueOf(strings[3])) {
                    winCount++;
                } else {
                    lossCount++;
                }

            } else if (strings[1].equals(team)) {
                countGame++;

                if (Integer.valueOf(strings[3]) > Integer.valueOf(strings[2])) {
                    winCount++;
                } else {
                    lossCount++;
                }
            }

        }
        System.out.println("Games: " + countGame);
        System.out.println("Wins: " + winCount);
        System.out.println("Losses: " + lossCount);
    }
}
