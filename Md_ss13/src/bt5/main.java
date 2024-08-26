package bt5;

import java.util.*;

public class main {
    public static void main(String[] args) {

        int n = 10;

        int[] array = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = rand.nextInt(100);  // Giới hạn số ngẫu nhiên trong khoảng từ 0 đến 99
        }

        System.out.println("Các phần tử của mảng:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        TreeMap<Integer, Integer> map1 = new TreeMap<>();

        for (int num : array) {
            map1.put(num, 0);
        }

        int minElement = map1.firstKey();
        System.out.println("Phần tử nhỏ nhất trong mảng: " + minElement);

        TreeMap<Integer, Integer> map2 = new TreeMap<>(Comparator.reverseOrder());

        map2.putAll(map1);

        map2.remove(map2.firstKey());
        int secondLargestElement = map2.firstKey();
        System.out.println("Phần tử lớn thứ 2 trong mảng: " + secondLargestElement);
    }
}

