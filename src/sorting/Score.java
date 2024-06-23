package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("응시자의 수 : ");
        int n = sc.nextInt();
//        System.out.print("상을 받는 사람의 수 : ");
        int k = sc.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
//            System.out.print((i+1)+"번쨰 학생의 점수: ");
            numbers[i] = sc.nextInt();
        }

        Arrays.sort(numbers);


            System.out.println(numbers[n-k]);


        sc.close();
    }
}
