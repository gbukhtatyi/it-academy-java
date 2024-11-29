package homework15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    public HashMap<String, List<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        if (!phoneBook.containsKey(name)) {
            phoneBook.put(name, new ArrayList<>());
        }
        phoneBook.get(name).add(phoneNumber);
    }

    public void printAllContacts() {
        phoneBook.entrySet()
                .stream()
                .sorted(Map.Entry.<String, List<String>>comparingByKey())
                .forEach((item) -> {
                    System.out.println(item.getKey() + ": " + String.join(", ", item.getValue()));
                });
    }
}
