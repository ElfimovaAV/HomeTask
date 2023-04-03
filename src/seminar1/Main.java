package seminar1;

import java.util.Scanner;
import seminar1.tasks.*;

public class Main {
    public static void main(String[] args) {
          Scanner iScanner = new Scanner(System.in);
//        System.out.printf("Введите натуральное число n: ");
//        String n = iScanner.next();
//
//
//        int numb = Integer.parseInt(n);
//
//        int res = Task1.calculateTriangularNumber(numb);
//        System.out.println("n-ое треуг.число: " + res);
//
//        int res1 = Task2.calculateFactorial(numb);
//        System.out.println("n-факториал: " + res1);
//
//        Task3.showSimpleNumbers(1000);
//        System.out.println();

        System.out.printf("Введите первое число: ");
        String num1 = iScanner.next();
        int numb1 = Integer.parseInt(num1);
        System.out.printf("Введите оператор действия: ");
        String sign = iScanner.next();

        System.out.printf("Введите второе число: ");
        String num2 = iScanner.next();
        int numb2 = Integer.parseInt(num2);
        iScanner.close();

        Task4.calculate(numb1, sign, numb2);
    }
}