import java.util.Scanner;

public class exercise2 {
    public static void main (String[] args){
        int[] numbers = new int[100];
        numbers[0] = 0;
        numbers[1] = 1;
        for (int i = 2; i < numbers.length; i++){
            numbers[i] = numbers[i-1] + numbers[i-2];
        }
        System.out.println("Введите порядковый номер интересующего вас числа Фибоначчи");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.println("Интересующее вас число: "+numbers[num-1]);
    }
}
