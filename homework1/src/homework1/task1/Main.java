package homework1.task1;

import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        System.out.println("Введите вносимую сумму");
        Scanner sum = new Scanner(System.in);
        double s = sum.nextInt();
        System.out.println("На сколько лет вклад?");
        Scanner year = new Scanner(System.in);
        int y = year.nextInt();
        System.out.println("Укажите процентную ставку");
        Scanner proc = new Scanner(System.in);
        double p = 1/proc.nextInt();
        double n = 0.13;
        double d = 0;
        double s2 = 0;

        for (int i =0; i<y; i++) {
            d = (s * p) - s;
            s2 = d + s;
        };
        d = s2-((s2 - s) * n);
        System.out.println("Ваш доход составит "+d);
    }
}
