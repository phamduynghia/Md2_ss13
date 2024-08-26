package bt4;

import java.util.HashMap;

public class main {
    public static void main(String[] args) {
        HashMap<String, Integer> originalMap = new HashMap<>();
        originalMap.put("Apple", 1);
        originalMap.put("Banana", 2);
        originalMap.put("Cherry", 3);
        originalMap.put("Date", 4);
        originalMap.put("Elderberry", 5);

        HashMap<String, Integer> copiedMap = new HashMap<>();

        copiedMap.putAll(originalMap);

        System.out.println("HashMap đã sao chép:");
        for (String key : copiedMap.keySet()) {
            System.out.println(key + ": " + copiedMap.get(key));
        }

        String keyToCheck = "Banana";
        if (copiedMap.containsKey(keyToCheck)) {
            System.out.println("Phần tử '" + keyToCheck + "' có tồn tại trong HashMap.");
        } else {
            System.out.println("Phần tử '" + keyToCheck + "' không tồn tại trong HashMap.");
        }
    }
}

