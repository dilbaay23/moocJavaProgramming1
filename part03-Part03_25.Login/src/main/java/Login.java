
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username: ");
        String text1 = scanner.nextLine();
        System.out.println("Enter password: ");
        String text2 = scanner.nextLine();

        if ((text1.equals("alex")) && (text2.equals("sunshine")) || (text1.equals("emma")) && (text2.equals("haskell"))) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }

    }
}


