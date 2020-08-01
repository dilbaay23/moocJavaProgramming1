
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    public boolean largerThan(Apartment compared){
        if (this.squares>compared.getSquares()) {
            return true;
            
        }
        return false;
    }

    public int getSquares() {
        return squares;
    }
    public int priceDifference(Apartment compared){
       return  Math.abs(this.squares*this.princePerSquare -compared.getSquares()* compared.getPrincePerSquare());
    }

    public int getPrincePerSquare() {
        return princePerSquare;
    }
    public boolean moreExpensiveThan(Apartment compared){
        if (this.princePerSquare >compared.getPrincePerSquare() ) {
            return true;
            
        }
        return false;
    }
    

}
