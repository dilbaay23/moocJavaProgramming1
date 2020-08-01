
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class Room {

    private ArrayList<Person> roomPerson = new ArrayList<>();

    public Room() {
    }

    public void add(Person person) {
        if (!roomPerson.contains(person)) {
            roomPerson.add(person);

        }
    }

    public boolean isEmpty() {
        if (roomPerson.isEmpty()) {
            return true;
        }
        return false;
    }

    public ArrayList<Person> getPersons() {
        return roomPerson;
    }

    public Person shortest() {
        if (roomPerson.isEmpty()) {
            return null;
        }
        Person shortest = roomPerson.get(0);
        for (Person person : roomPerson) {
            if (person.getHeight() < shortest.getHeight()) {
                shortest = person;
            }

        }
        return shortest;
    }

    public Person take() {
        if (roomPerson.isEmpty()) {
            return null;
        }
        Person shortest = roomPerson.get(0);
        for (Person person : roomPerson) {
            if (person.getHeight() < shortest.getHeight()) {
                shortest = person;

            }

        }
        roomPerson.remove(shortest);
        return shortest;

    }
}
