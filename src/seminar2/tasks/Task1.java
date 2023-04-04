/*1.Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации
запишите в лог-файл.
 */
package seminar2.tasks;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;



public class Task1 {
    public static final Logger LOG = Log.log(Task1.class.getName());

    public static int[] sortingArray(int[] array) throws IOException {
        FileHandler fh = new FileHandler("logTask1.xml");
        LOG.addHandler(fh);

        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);

        try {

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        int temp = array[j + 1];
                        array[j + 1] = array[j];
                        array[j] = temp;
                        LOG.log(Level.INFO, "Sorted done");
                    }
                }
            }
            return array;
        } catch (Exception e) {
            LOG.log(Level.INFO, e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
