package bt2;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

public class main {
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 4, 4, 5, 6, 7, 5};

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int element : arr) {

            if (frequencyMap.containsKey(element)) {

                frequencyMap.put(element, frequencyMap.get(element) + 1);
            } else {

                frequencyMap.put(element, 1);
            }
        }

        ArrayList<Integer> uniqueElements = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == 1) {
                uniqueElements.add(entry.getKey());
            }
        }

        System.out.println("Các phần tử duy nhất trong mảng là:");
        for (int element : uniqueElements) {
            System.out.print(element + " ");
        }
    }
}

