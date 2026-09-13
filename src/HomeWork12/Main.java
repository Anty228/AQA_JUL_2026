package HomeWork12;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<String, Set<String>> phones = new HashMap<>();

        System.out.println(phones);

        Set<String> appleNumbers = new HashSet<>();
        appleNumbers.add("380950024094");
        appleNumbers.add("380950042095");
        appleNumbers.add("380950044092");

        Set<String> samsungNumbers = new HashSet<>();
        samsungNumbers.add("380670024095");
        samsungNumbers.add("380670042096");
        samsungNumbers.add("380670042092");

        phones.put("Apple", appleNumbers);
        phones.put("Samsung", samsungNumbers);

        System.out.println(phones);


        Map<String, String> owners = new HashMap<>();

        owners.put("Apple", "Andrii");
        owners.put("Samsung", "Maria");
        System.out.println(owners);
    }
}



