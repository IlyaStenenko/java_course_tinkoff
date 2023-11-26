package edu.hw7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task32Test {

    private static final String NAME = "Ilya";
    private static final String ADDRESS = "Voronezh";
    private static final String PHONE_NUMBER = "+7900520380";

    @Test
    public void testPersonAvailability() {
        Task32.PersonDatabase personDatabase = new Task32.LockedPersonDatabase();

        Task32.Person person = new Task32.Person(1, NAME, ADDRESS, PHONE_NUMBER);
        personDatabase.add(person);

        assertTrue(personDatabase.findByName(NAME).contains(person));
        assertTrue(personDatabase.findByAddress(ADDRESS).contains(person));
        assertTrue(personDatabase.findByPhone(PHONE_NUMBER).contains(person));
    }

    @Test
    public void testPersonNotAvailable() {
        Task32.PersonDatabase personDatabase = new Task32.LockedPersonDatabase();

        Task32.Person person = new Task32.Person(2, NAME, ADDRESS, PHONE_NUMBER);
        personDatabase.add(person);

        personDatabase.delete(2);

        assertEquals(0, personDatabase.findByName(NAME).size());
        assertEquals(0, personDatabase.findByAddress(ADDRESS).size());
        assertEquals(0, personDatabase.findByPhone(PHONE_NUMBER).size());
    }
}