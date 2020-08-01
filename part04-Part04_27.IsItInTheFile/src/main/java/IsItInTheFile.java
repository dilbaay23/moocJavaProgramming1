
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        
        try (Scanner scan = new Scanner(Paths.get(file))) {
            while (scan.hasNextLine()) {
                // we read one line
                String row = scan.nextLine();
                // we print the line that we read
                System.out.println(row);
                list.add(row);
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
        if (list.contains(searchedFor)){
            System.out.println("Found!");
        }else{
            System.out.println("Not found.");
        }
        
    }
}
