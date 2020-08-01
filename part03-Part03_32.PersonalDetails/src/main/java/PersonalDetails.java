

import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int longest = 0;
        String name = "";
        double avg = 0;
        int sum = 0;
        int count =0;
        while (true) {
            String text = scanner.nextLine();
            if (text.equals("")) {
                break;
            }
            String[] array = text.split(",");
            count++;
            for (int i = 0; i < 2; i++) {
                if (longest < array[0].length()) {
                    longest = array[0].length();
                    name = array[0];
                }
                

            }
           sum += Integer.valueOf(array[1]);
            avg = (double) sum / (count);

        }
        System.out.println("Name of the oldest: " + name);
        System.out.println("Average of the birth years: " + avg);

    }
}
