
import java.util.ArrayList;

public class Hold {

    private ArrayList<Suitcase> suitcases = new ArrayList<>();
    private int maximumWeight;

    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (maximumWeight - suitcase.totalWeight() >= 0) {
            maximumWeight = maximumWeight - suitcase.totalWeight();
            suitcases.add(suitcase);

        }
        

    }
    public String toString(){
        if (suitcases.size() == 0) {
            return "no suitcase (0 kg)";
        }
        int totalWeight = 0;
        for (Suitcase suitcase : suitcases) {
            totalWeight += suitcase.totalWeight();
        }
        if (suitcases.size() == 1) {
            return suitcases.size() + " suitcase (" + totalWeight + " kg)";
        }
        return suitcases.size() + " suitcases (" + totalWeight + " kg)";
    
    }
    public void printItems(){
        for (Suitcase suitcase : suitcases) {
            suitcase.printItems();
        }
    }
}
