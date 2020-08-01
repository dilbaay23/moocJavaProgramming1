
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        
        ArrayList<Bird> arrayList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        while (true) {
            Bird bird = new Bird();
            System.out.print("? ");
            String command = scan.nextLine();
            if (command.equals("Quit")) {
                break;
            } else if (command.equals("Add")) {
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.print("Name in Latin: ");
                String latinName = scan.nextLine();
                bird.addBird(name, latinName);
                bird.setList();
                arrayList.add(bird);

            } else if (command.equals("Observation")) {
                System.out.print("Bird? ");
                String search = scan.nextLine();
                int count = 0;
                for (int i = 0; i < arrayList.size(); i++) {
                    if (arrayList.get(i).getName().equals(search)) {
                        arrayList.get(i).addObservations();
                        count++;
                    }
                }
                if (count == 0) {
                    System.out.println("Not a bird!");
                }

            } else if (command.equals("All")) {

                for (int i = 0; i < arrayList.size(); i++) {
                    System.out.println(arrayList.get(i));

                }

            } else if (command.equals("One")) {
                System.out.print("Bird? ");
                String search = scan.nextLine();          
                for (int i = 0; i < arrayList.size(); i++) {
                    if (arrayList.get(i).getName().equals(search)) {
                        System.out.println(arrayList.get(i));
                       
                    }

                }
               

            } else {
                break;
            }

        }

    }

}
