import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;

public class SILab1 {
    public static List<Integer> filterOddNumbers(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        for (Integer el : list) {
            if (el / 2 == 0) {
                result.add(el);
            }
        }
        return result;
    }

    private static int sumEvenNumbers(List<Integer> list) {
        int sum = 1;
        for (Integer el : list) {
            if (el % 2 == 0) {
                sum *= el;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i <= n; i++) {
            list.add(Integer.parseInt(br.readLine()););
        }

        System.out.println(filterOddNumbers(list));

        System.out.println(sumEvenNumbers(list));
    }
}
