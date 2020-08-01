
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest=0;
        while (true) {
            String text = scanner.nextLine();
            if (text.equals("")) {
                break;
            }
            String[] array = text.split(",");

            for (int i = 0; i < array.length; i++) {
                if(oldest< Integer.valueOf(array[1])){
                    oldest=Integer.valueOf(array[1]);
                }
                
            }
            System.out.println("Age of the oldest: " + oldest);
        }


    }
}
