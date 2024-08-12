import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PhoneBookTest {
    @Test
    public void test_add_contact_positive() {
        PhoneBook phoneBook = new PhoneBook();
        int result = phoneBook.add("Irina", "89992227676");
        assertEquals(1, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_add_double_null_contact_negative() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add(null, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_add_phone_null_contact_negative() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Irina", null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_add_name_null_contact_negative() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add(null, "88005553535");
    }


    @Test
    public void test_add_same_name_as_contact() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Irina", "89992227676");
        phoneBook.add("Irina", "89992227677");
        phoneBook.add("Irina", "89992227678");
        phoneBook.add("Irina", "89992227679");
        phoneBook.add("Irina", "89992227675");
        phoneBook.add("Irina", "89992227674");
        phoneBook.add("Irina", "89992227673");
        int size = phoneBook.add("Irina", "89992227672");
        assertEquals(1, size);
    }
}
