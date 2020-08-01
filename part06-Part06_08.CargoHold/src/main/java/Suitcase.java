
import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> items = new ArrayList<>();
    private int maximumTotalWeight;

    public Suitcase(int maximumTotalWeight) {
        this.maximumTotalWeight = maximumTotalWeight;
    }

    public void addItem(Item item) {
        if (maximumTotalWeight - item.getWeight() >= 0) {
            maximumTotalWeight = maximumTotalWeight - item.getWeight();
            items.add(item);

        }

    }

    public String toString() {
        if (items.size() == 0) {
            return "no items (0 kg)";
        }
        int totalWeight = 0;
        for (Item item : items) {
            totalWeight += item.getWeight();
        }
        if (items.size() == 1) {
            return items.size() + " item (" + totalWeight + " kg)";
        }
        return items.size() + " items (" + totalWeight + " kg)";
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println((item.toString()));    
        }
    }
    public int totalWeight (){
        int totalWeight = 0;
        for (Item item : items) {
            totalWeight += item.getWeight();
        }
        return totalWeight;

    }
    public Item heaviestItem(){
         if (items.size() == 0) {
            return null;
        }
       Item heaviestItem = items.get(0);
        for (Item item : items) {
            if (item.getWeight()>heaviestItem.getWeight()){
                heaviestItem=item;
            }
        }
        return heaviestItem; 
    } 
    

}
