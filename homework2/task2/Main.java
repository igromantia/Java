package homework2.task2;

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

        System.out.println("��� �� ��������?");
        String inpt;
        while (true) {
            inpt = reader.readLine();
            if ("������ �� �����".equals(inpt)) {
                break;
            }
            System.out.println("��� �� ��� ��������?");
        }

        System.out.println("����� �������������");
    }
}
