package seminar3;

import seminar3.tasks.Task1;
import seminar3.tasks.Task2;
import seminar3.tasks.Task3;
import seminar3.tasks.Task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] input_array = { 5, 1, 6, 2, 3, 4 };
        System.out.println(Arrays.toString(Task1.mergesort(input_array)));

        ArrayList<Integer> list_numb = new ArrayList<>();
        list_numb.add(15);
        list_numb.add(22);
        list_numb.add(41);
        list_numb.add(56);
        list_numb.add(2);
        list_numb.add(33);
        list_numb.add(142);
        System.out.println(list_numb);
        Task2.delEvenNumbFromList(list_numb);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(19);
        list1.add(45);
        list1.add(71);
        list1.add(23);
        list1.add(52);
        list1.add(11);
        list1.add(4);
        System.out.println(list1);
        Task3.findMaxValue(list1);
        Task3.findMinValue(list1);
        Task3.findAverage(list1);

        int[] arr1 = {0, 5, 9, 8};
        int[] arr2 = {0, 5, 10, 11};
        List<Integer> diff = Task4.findSymmetricalDifference(arr1, arr2);
        System.out.println("Разность массивов: " + diff);


    }
}
