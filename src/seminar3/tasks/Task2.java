//Пусть дан произвольный список целых чисел, удалить из него чётные числа
package seminar3.tasks;

import java.util.ArrayList;

public class Task2 {

    public static void delEvenNumbFromList(ArrayList<Integer> integer_list) {

        for (int i = 0; i < integer_list.size(); i++) {
            if (integer_list.get(i)%2 == 0) {
                integer_list.remove(integer_list.get(i));
                i--;
            }

        }
        System.out.println(integer_list);
    }
}
