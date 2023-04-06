/*Задан целочисленный список ArrayList. Найти минимальное, максимальное и
среднее арифметическое этого списка.
 */

package seminar3.tasks;

import java.util.ArrayList;

public class Task3 {

    public static void findMaxValue(ArrayList<Integer> integer_list) {
        int max = 0;
        for (int i = 0; i < integer_list.size(); i++) {
            if (integer_list.get(i) > max) {
                max = integer_list.get(i);
            }
        }
        System.out.println("Max number: " + max);
    }

    public static void findMinValue(ArrayList<Integer> integer_list) {
        int min = integer_list.get(0);
        for (int i = 0; i < integer_list.size(); i++) {
            if (integer_list.get(i) < min) {
                min = integer_list.get(i);
            }
        }
        System.out.println("Min number: " + min);
    }

    public static void findAverage (ArrayList<Integer> integer_list) {
        float sum = 0;
        for (int i = 0; i < integer_list.size(); i++) {
            sum += integer_list.get(i);
        }
        float average = sum / integer_list.size();
        System.out.println("Average: " + average);
    }
}

