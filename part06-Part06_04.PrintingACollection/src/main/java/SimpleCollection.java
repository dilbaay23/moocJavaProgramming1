
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString() {
        String message="";
        if (elements.size()==0){
            message= "The collection " + name + " is empty.";
         
        }else if (elements.size()==1){
            message= "The collection " + name + " has 1 element:\n";
        }else{
        message= "The collection "+name+" has " + elements.size() + " elements:\n";
        }
        String elementOut="";
        for (String element : elements) {
           String last=elements.get(elements.size()-1);
        
            if (element==(last)){
            elementOut +=element;
        }else{
            elementOut +=element +"\n";
        }
        }
        return message + elementOut ; 
    }
    
    
    
}
