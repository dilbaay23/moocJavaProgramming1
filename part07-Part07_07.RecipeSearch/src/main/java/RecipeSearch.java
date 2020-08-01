
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("File to read: ");
        String fileName = scanner.nextLine();
        System.out.println("");
        System.out.println("Commands:\nlist - lists the recipes\nstop - stops the program\nfind name - searches recipes by name\n"
                + "find cooking time - searches recipes by cooking time\nfind ingredient - searches recipes by ingredient");
        System.out.println("");

        while (true) {
            ArrayList<Recipe> list1 = new ArrayList<>();
            System.out.print("Enter the command: ");
            String command = scanner.nextLine();
            
            if (command.equals("list")) {
                list(fileName, list1);
                System.out.println("");
                System.out.println("Recipes:");

                for (Recipe recipe1 : list1) {
                    System.out.println(recipe1.getName() + ", cooking time: " + recipe1.getTime());
                }

            } else if (command.equals("stop")) {
                break;
            } else if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String searchWord = scanner.nextLine();
                list(fileName, list1);
                System.out.println("");
                searchName(list1, searchWord);
            }else if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int maxTime = Integer.valueOf(scanner.nextLine());
                list(fileName, list1);
                System.out.println("");
                searchTime(list1, maxTime);
            }else if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();
                list(fileName, list1);
                System.out.println("");
                searchIngredient(list1, ingredient);
            }
            
            
            System.out.println("");
        }

    }

    private static void list(String fileName, ArrayList<Recipe> list1) {

        try (Scanner reader = new Scanner(new File(fileName))) {
            while (reader.hasNextLine()) {
                Recipe recipe = new Recipe();
                while (reader.hasNextLine()) {
                    String line = reader.nextLine();
                    recipe.addList(line);
                    if (line.equals("")) {
                        break;
                    }
                }
                recipe.listDo();
                list1.add(recipe);
            }
        } catch (Exception e) {
            System.out.println("File is not found");
        }

    }

    private static void searchName(ArrayList<Recipe> list1, String searchWord) {
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i).getName().contains(searchWord)) {
                System.out.println("Recipes:");
                System.out.println(list1.get(i).getName() + ", cooking time: " + list1.get(i).getTime());
            }

        }

    }

    private static void searchTime(ArrayList<Recipe> list1, int maxTime) {
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i).getTime()<=maxTime) {
                System.out.println("Recipes:");
                System.out.println(list1.get(i).getName() + ", cooking time: " + list1.get(i).getTime());
            }

        }
    }

    private static void searchIngredient(ArrayList<Recipe> list1, String ingredient) {
        System.out.println("Recipes:");
        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list1.get(i).getIngredients().length; j++) {
                
                if (list1.get(i).getIngredients()[j].equals(ingredient)) {
                
                System.out.println(list1.get(i).getName() + ", cooking time: " + list1.get(i).getTime());
            }
                
            }
            

        }
    }

}
