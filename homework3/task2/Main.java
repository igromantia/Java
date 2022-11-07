package homework3.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите длины сторон треугольника");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        if (a < b + c ){
            if (b < a + c){
                if (c < b + a){
                    System.out.println("Треугольник существует");
                }
                else System.out.println("Треугольник не существует");
            }
            else System.out.println("Треугольник не существует");
        }
        else System.out.println("Треугольник не существует");

    }
}
