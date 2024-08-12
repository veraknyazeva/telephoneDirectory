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

    @Test
    public void test_find_by_number() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Irina", "89992227676");
        phoneBook.add("Alena", "89992227677");
        String katya = "Katya";
        String ketrin_phone = "89992227678";
        phoneBook.add(katya, ketrin_phone);
        String name = phoneBook.findByNumber(ketrin_phone);
        assertEquals(katya, name);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_find_by_null_number() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Irina", "89992227676");
        phoneBook.add("Alena", "89992227677");
        String name = phoneBook.findByNumber(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_find_by_null_name() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Irina", "89992227676");
        phoneBook.add("Alena", "89992227677");
        String phoneNumber = phoneBook.findByName(null);
    }

    @Test
    public void test_find_by_name() {
        String katya = "Katya";
        String ketrin_phone = "89992227678";
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Irina", "89992227676");
        phoneBook.add("Alena", "89992227677");
        phoneBook.add(katya, ketrin_phone);
        String phoneNumber = phoneBook.findByName(katya);
        assertEquals(ketrin_phone, phoneNumber);
    }
}
