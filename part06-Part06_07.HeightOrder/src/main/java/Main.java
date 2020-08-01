
public class Main {

    public static void main(String[] args) {
        Room room = new Room();
        room.add(new Person("Lea", 183));
        room.add(new Person("Kenya", 182));
        room.add(new Person("Auli", 186));
        room.add(new Person("Nina", 172));
        room.add(new Person("Terhi", 185));

        System.out.println("");
        for (Person person : room.getPersons()) {
            System.out.println(person);
        }

        System.out.println();
        System.out.println("Shortest: " + room.take());
        System.out.println("");
        for (Person person : room.getPersons()) {
            System.out.println(person);
        }
        System.out.println();
        Room room1 = new Room();
        room1.add(new Person("Lea", 183));
        room1.add(new Person("Kenya", 182));
        room1.add(new Person("Auli", 186));
        room1.add(new Person("Nina", 172));
        room1.add(new Person("Terhi", 185));

        while (!room1.isEmpty()) {
            System.out.println(room1.take());
        }

    }
}
