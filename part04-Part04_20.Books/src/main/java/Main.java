import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Book> book=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        while(true){
            System.out.println("Title: ");  
            String title=scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.println("Pages: ");  
            int pages=Integer.valueOf(scanner.nextLine());
            
            System.out.println("Publication year: ");  
            int py=Integer.valueOf(scanner.nextLine());
            
             book.add(new Book(title,pages,py));
        }
        System.out.println("What information will be printed? ");
        String answer=scanner.nextLine();
        for (Book object : book) {
           if (answer.equals("everything")) {
               System.out.println(object.getTitle() + ", " + object.getPages() + " pages, " + object.getPy());
            
        } else if(answer.equals("name")){
               System.out.println(object.getTitle());
        }
        }
       
    }
}
