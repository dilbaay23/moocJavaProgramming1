
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a word: ");
// reading a line from the user and assigning it to the name variable
String name = scanner.nextLine();

System.out.println(name+name+name);

    }
}
