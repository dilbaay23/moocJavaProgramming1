
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int end=Integer.valueOf(scanner.nextLine());
        int start=Integer.valueOf(scanner.nextLine());
        
        for (int i =start; i <= end; i++) {
            System.out.println(i);
        }  

       
    }
}
