package bt1;

import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 3, 2, 1};
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int element : arr) {

            if (frequencyMap.containsKey(element)) {

                frequencyMap.put(element, frequencyMap.get(element) + 1);
            } else {

                frequencyMap.put(element, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Phần tử " + entry.getKey() + " xuất hiện " + entry.getValue() + " lần.");
        }
    }
}
