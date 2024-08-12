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


}
