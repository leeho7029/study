package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class NumberCard {

    static int binary(int arr[], int k){
        int big = arr.length -1;
        int small = 0;
        int result = 10;
        while(small <= big){
            int mid = (small +big)/2;
            if(arr[mid] < k ){
                  small = mid+1;
            }else if (arr[mid] > k) {
                 big = mid -1;
            }else if (arr[mid] == k){
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Scanner 객체 생성
        int n = sc.nextInt();  // 첫 번째 줄에서 수의 개수 N 입력받기
        int[] numbers = new int[n];  // 크기가 N인 배열 생성

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();  // N개의 줄에서 수 입력받아 배열에 저장
        }

        int m = sc.nextInt();
        int[] answer = new int[m];
        for (int i = 0; i < m; i++) {
            answer[i] = binary(numbers,sc.nextInt());  // N개의 줄에서 수 입력받아 배열에 저장
        }

        for (int i = 0; i < m; i++) {
            System.out.print(answer[i] + " ");
        }
    }
}
