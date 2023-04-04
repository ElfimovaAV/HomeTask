package seminar2;

import seminar2.tasks.Task1;
import seminar2.tasks.Task2;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
        int[] array = new int[] {5, 1, 8, 2, 7, 3};
        int[] sorted_array = Task1.sortingArray(array);
        for(int i = 0; i < sorted_array.length; i++) {
            System.out.print(sorted_array[i] + " ");
        }
        System.out.println();

        String [] original_array =  Task2.ReadLineFromFile("jsonTask2.txt");
        for (int i = 0; i < original_array.length; i++) {
            System.out.println(Task2.printLine(original_array[i]));
        }
    }
}
