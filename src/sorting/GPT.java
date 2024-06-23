package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class GPT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Scanner 객체 생성
        int n = sc.nextInt();  // 첫 번째 줄에서 수의 개수 N 입력받기
        int[] numbers = new int[n];  // 크기가 N인 배열 생성

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();  // N개의 줄에서 수 입력받아 배열에 저장
        }

        Arrays.sort(numbers);  // 배열을 오름차순으로 정렬

        for (int num : numbers) {
            System.out.println(num);  // 정렬된 배열을 출력
        }

        sc.close();  // Scanner 객체 닫기
    }
}
