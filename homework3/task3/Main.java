package homework3.task3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число последовательности");
        Scanner s = new Scanner(System.in);
        int first = s.nextInt();
        System.out.println("Введите последнее число последовательности");
        int last = s.nextInt();
        System.out.println("Введите число кратности");
        int x = s.nextInt();
        int[] c = new int[last - first];
        for (int i = 0; i < c.length; i++) {
            c[i] = first;
            first++;
        }
        for (int i = 0; i < c.length; i++) {
            if (c[i] % x == 0) {
                System.out.print(c[i] + " ");
            }
        }
    }
}
