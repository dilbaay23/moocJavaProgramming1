
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }
            list.add(number);
        }
        System.out.println("");
        int sum = 0;
        int counter = 0;
        for (Integer item : list) {
            sum += item;
            counter++;
        }
        System.out.println("Average: " + sum / (double) counter);
    }
   
}
