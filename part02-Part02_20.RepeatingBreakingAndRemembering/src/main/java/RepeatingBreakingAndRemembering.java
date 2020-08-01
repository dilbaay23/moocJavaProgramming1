
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int odd = 0;
        int even = 0;
        double avg = 0;

        while (true) {
            System.out.println("Give numbers:");

            int number = Integer.valueOf(scanner.nextLine());

            if (number == -1) {
                break;
            }
            sum += number;
            count++;
            avg = (double) sum / count;
            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }

        }

        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + avg);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);

    }
}
