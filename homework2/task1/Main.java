package homework2.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            exceptional();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void exceptional() throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        try {
            while (true) {
                System.out.println("Введите строку");
                String inpt = reader.readLine();
                if ("отстань от меня, пожалуйста".equalsIgnoreCase(inpt)) {
                    throw new RuntimeException();
                }
                System.out.println("Давай попробуем снова");
            }
        } catch (RuntimeException e) {
            System.out.println("Ха-ха! Попался! я поймал исключение");
        }

        System.out.println("До свидания");
    }
}
