import java.util.Scanner;

 

public class ComparingNumbers {

 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first value");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter second value");
        int second = Integer.valueOf(scanner.nextLine());
        if(first > second){
            System.out.println("(first) is greater than (second).");
        }else if(first < second){
            System.out.println("(first) is smaller than (second).");
        }else{
            System.out.println("(first) is equal to (second).");
        }

 

    }
}
 