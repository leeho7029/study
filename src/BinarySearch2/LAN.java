package BinarySearch2;

import java.util.Arrays;
import java.util.Scanner;

public class LAN {
    //https://www.acmicpc.net/problem/1654

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //가지고 있는 랜선갯수
        long[] numbers = new long[n]; // 가지고있는 랜선길이들

        int m = sc.nextInt(); //필요한 랜선의 갯수

        for(int i=0; i< n; i++){
            numbers[i] = sc.nextInt();
        }
        Arrays.sort(numbers); // 랜선 크기순 정렬

        long result = binary(numbers,m,n);

        System.out.println(result);





    }

    static long binary(long arr[], int k, int n){
        long big = arr[n-1]; // 가장 긴 랜선의 길이
        long start = arr[0];
        long small = 1; // 가장 작은 길이
        long mid = 0;
        long result = mid;
        while (small <= big) {
            int count = 0;
            mid = (big+small)/2; //가장 중간 길이
            for (int i = 0; i < n; i++) {
                count += (arr[i] / mid);
            }
            if(count >= k){
                small = mid +1;;
                result = mid;
            } else {
                big = mid - 1;
            }
        }
        return result;
    }
}
