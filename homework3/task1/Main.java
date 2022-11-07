package homework3.task1;

import java.util.ArrayList;
import java.util.Scanner;


//Пока не доделано


public class Main {
    public static void main(String[] args) {
        System.out.println("ВВведите количество чисел, которые будете считывать");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int[] x = new int[num];
        ArrayList<Integer> uniq = new ArrayList<Integer>();
        ArrayList<Integer> notUniq = new ArrayList<Integer>();
        for (int i = 0; i < num; i++){
            System.out.println("Введите "+(i+1)+" число");
            x[i] = s.nextInt();
        }
        for (int i = 0; i < x.length-1; i++) {
            for (int j = 1; j < x.length; j++) {
                if (x[i] == x[j]) {
                        notUniq.add(x[i]);
                        notUniq.add(x[j]);
                }
                else {
                        uniq.add(x[i]);
                }
            }
        }
        for (int i = 0; i < notUniq.size(); i++){
            System.out.print(notUniq.get(i)+" ");
        }
        System.out.println();
        System.out.print("Уникальные числа: ");
        for (int i = 0; i < uniq.size(); i++){
            System.out.print(uniq.get(i)+" ");
        }
    }
}
