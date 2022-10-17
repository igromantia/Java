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
                System.out.println("������� ������");
                String inpt = reader.readLine();
                if ("������� �� ����, ����������".equalsIgnoreCase(inpt)) {
                    throw new RuntimeException();
                }
                System.out.println("����� ��������� �����");
            }
        } catch (RuntimeException e) {
            System.out.println("��-��! �������! � ������ ����������");
        }

        System.out.println("�� ��������");
    }
}
