
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    public boolean equals(Object compared){
        if (this==compared) {
            return true;
        }
        if (!(compared instanceof Book)){
            return false;
        }
        Book comparedBook= (Book) compared;
        if (this.name.equals(comparedBook.getName())&& this.publicationYear==comparedBook.getPublicationYear()){
            System.out.println("The book is already on the list. Let's not add the same book again.");
            return true;
        }else{
            
            return false;
        }
    }

}
