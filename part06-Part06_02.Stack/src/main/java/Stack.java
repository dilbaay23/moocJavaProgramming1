
import java.util.ArrayList;


public class Stack {
    private ArrayList<String> list;
    public Stack() {
        this.list = new ArrayList<>();
    }
    
    public boolean isEmpty(){
        if(list.size()==0){ //if (list.isempty() );
            return true;
        }else{
            return false;
        }
    }
    public void add(String value){
        list.add(value);
    }
    public ArrayList<String> values(){
        return list;
    }
    public String take(){
        int size=list.size();
        String last= list.get(size-1);
        list.remove(size-1);
        return last;
        
    }
    
}
