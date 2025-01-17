import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {
    private final Map<String, String> contacts = new TreeMap<>();
    private final Map<String, String> contactsByPhone = new TreeMap<>();

    public int add(String name, String phoneNumber) {
        if (name == null || phoneNumber == null) {
            throw new IllegalArgumentException();
        }
        contacts.put(name, phoneNumber);
        contactsByPhone.put(phoneNumber, name);

        return contacts.size();
    }

    public String findByNumber(String phoneNumber) {
        if (phoneNumber == null) {
            throw new IllegalArgumentException();
        }
        return contactsByPhone.get(phoneNumber);
    }

    public String findByName(String name) {
        if (name == null) {
            throw new IllegalArgumentException();
        }
        return contacts.get(name);
    }

    public void printAllNames() {
        System.out.println(contacts.keySet());
    }
}
