package homework2.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

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

        System.out.println("¬ведите первое число");
        int n = Integer.parseInt(reader.readLine());
        System.out.println("¬ведите второе число");
        int m = Integer.parseInt(reader.readLine());

        System.out.println("¬ведите массив");
        int[][] inptArr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                inptArr[i][j] = Integer.parseInt(reader.readLine());
            }

        }

        int[] singleSortedArr = Arrays.stream(inptArr)
                .flatMapToInt(Arrays::stream)
                .sorted().toArray();

        int tmp = n * m - 1;
        int[][] backSortedArr = new int[n][m];
        for (int i = n - 1; i > -1; i--) {
            for (int j = m - 1; j > -1; j--) {
                backSortedArr[i][j] = singleSortedArr[tmp--];
            }
        }
        System.out.println("ќтсортированный массив:");
        printArray(backSortedArr);
    }

    private static void printArray(int[][] arr) {
        for (int[] ints : arr) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}
