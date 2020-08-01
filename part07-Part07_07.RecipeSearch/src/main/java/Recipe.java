import java.util.ArrayList;
public class Recipe {
    private String name;
    private int time; 
    private String ingredients;
    private ArrayList<String> list;

    public Recipe() {
      list=new ArrayList<> ();  
    }
    public void addList(String input){
        list.add(input);
    }
    public void listDo(){
        this.name=list.get(0);
        this.time=Integer.valueOf(list.get(1));
        for (int i =2; i < list.size(); i++) {
            
            this.ingredients =this.ingredients + " "+ list.get(i);
        }
        
    }

    public String getName() {
        return name;
    }

    public int getTime() {
        return time;
    }

    public String[] getIngredients() {
        String[] ingArray=ingredients.split(" ");
        return ingArray;
    }

    public ArrayList<String> getList() {
        return list;
    }
    
    
}
