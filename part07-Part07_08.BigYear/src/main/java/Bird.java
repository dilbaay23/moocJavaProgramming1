
public class Bird {

    private String name;
    private String latinName;
    private int observationsCounter;
    private String[] list ;

    public Bird() {
       this.list = new String[3];
    }

    public void addBird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;

    }

    public int addObservations() {
        observationsCounter++;
        return observationsCounter;
    }

    public String[] getList() {
        return list;
    }

    public void setList() {
        list[0] = name;
        list[1] = latinName;
        list[2] = String.valueOf(this.observationsCounter);
       
    }

    public int getObservationsCounter() {
        return observationsCounter;
    }

    public String getName() {
        return name;
    }

    public String getLatinName() {
        return latinName;
    }

    @Override
    public String toString() {
        return name + " ("+ latinName+"): " + observationsCounter + " observations";
    }
    

}
