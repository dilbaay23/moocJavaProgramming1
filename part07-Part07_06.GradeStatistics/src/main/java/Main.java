
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //ArrayList<Integer> list = new ArrayList();
        Grade grade = new Grade();

        System.out.println("Enter point totals, -1 stops:");

        while (true) {
            String input = scanner.nextLine();
            int number = Integer.valueOf(input);
            
            if (number == -1) {
                break;
            }
            
            grade.addList(number);

        }
        grade.avgScore();
        grade.avgPassScore();
        System.out.println("Pass percentage: " + grade.passPercantage());
        grade.distribution();

        // Write your program here -- consider breaking the program into 
        // multiple classes.
    }

}
