package day28_10_24;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;

public class MapDifferenceExample {
    public static void main(String[] args) {
        HashMap<Long, String> hashMap = new HashMap<>();
        hashMap.put(1L, "Alice");
        hashMap.put(2L, "Bob");
        hashMap.put(3L, null);
        hashMap.put(null, "Charlie");
        System.out.println("HashMap: " + hashMap);

        Hashtable<Long, String> hashtable = new Hashtable<>();
        hashtable.put(1L, "Alice");
        hashtable.put(2L, "Bob");
        System.out.println("Hashtable: " + hashtable);

        LinkedHashMap<Long, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1L, "Alice");
        linkedHashMap.put(2L, "Bob");
        linkedHashMap.put(3L, "Charlie");
        System.out.println("LinkedHashMap: " + linkedHashMap);

        System.out.println("\nDifferences:");
        System.out.println("1. HashMap allows null keys and values, is not synchronized.");
        System.out.println("2. Hashtable does not allow null keys or values, is synchronized.");
        System.out.println("3. LinkedHashMap maintains insertion order and allows null keys and values.");
    }
}
