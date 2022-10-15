package homework1.task3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        int[] numbers = new int[100];
        numbers[0] = 0;
        numbers[1] = 1;
        for (int i = 2; i < numbers.length; i++){
            numbers[i] = numbers[i-1] + numbers[i-2];
        }
        System.out.println("Введите количество чисел");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int[] x = new int[num];
        for (int i = 0; i < num; i++){
            System.out.println("Введите "+(i+1)+" число");
            x[i] = s.nextInt();
        }
        int[] y = new int[10];
        int[] b = new int[10];
        for (int i = 0; i < x.length; i++){
            for (int a = 0; a < numbers.length; a++){
                if (x[i] == numbers[a]){
                    y[i] = x[i];
                }
                else
                    b[i] = x[i];
            }
        }
        System.out.print("Числа Фибоначчи: ");
        for(int i = 0; i < y.length; i++){
            System.out.print(y[i]+" ");
        }
        System.out.println(" ");
        System.out.println("Не являются числами Фибоначчи: ");
        for(int i = 0; i < y.length; i++){
            System.out.print(b[i]+" ");
        }
    }
}
