//Реализовать разность массивов и симметрическую разность.


package seminar3.tasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task4 {

    public static List<Integer> findSymmetricalDifference(int[] arr1, int[] arr2) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int value : arr1) {
            int current = count.getOrDefault(value, 0);
            count.put(value, current + 1);
        }
        for (int value : arr2) {
            int current = count.getOrDefault(value, 0);
            count.put(value, current - 1);
        }
        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            int diff = entry.getValue();
            int times = Math.abs(diff);
            for (int i = 0; i < times; i++) {
                result.add(entry.getKey());
            }
        }
        return result;
    }
}

