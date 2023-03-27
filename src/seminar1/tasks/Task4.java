//3. Реализовать простой калькулятор
package seminar1.tasks;

public class Task4 {
    public static double calculate (int num1, char operator, int num2) {
        double res = 0;
        if (operator == '+') {
            res += num1 + num2;
        } else if (operator == '-') {
            res += num1 - num2;
        } else if (operator == '*') {
            res += num1 * num2;
        } else if (operator == '/') {
            res += (double) num1 / num2;
        }
        return res;
    }
}
