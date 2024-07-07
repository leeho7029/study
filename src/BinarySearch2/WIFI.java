package BinarySearch2;

import java.util.Arrays;
import java.util.Scanner;

public class WIFI {
    //https://www.acmicpc.net/problem/2110
    //0에서 가장 가까운 집과 먼 집의 거리의 절반부터 시작

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //집의 자리
        int[] numbers = new int[n]; // 공유기 좌표배열

        int m = sc.nextInt(); // 공유기의 갯수

        for(int i=0; i< n; i++){
            numbers[i] = sc.nextInt();
        }
        Arrays.sort(numbers);
        int result = binary(numbers,n,m);
        System.out.println(result);
    }

    static int binary(int arr[], int n, int m){
        int big = arr[m-1]-arr[0]; //최대거리는 가장먼 위치와 맨처음 위치의 차이
        int small = 1; // 최소거리는 1
        int result = 0;
        while (small <= big){
            int count = 1; // 맨처음 집은 무조건 설치를 함
            int distance = (big+small)/2; //탐색범위의 중간값
            int spot = arr[0];
            for(int i =1; i<n; i++){
                if(arr[i]-spot >= distance){
                    count++;
                    spot=arr[i];
                }
            }
            if(count >= m){
                result=distance;
                small = distance +1;
            }else{
                big = distance - 1;
            }
        }
        return result;
    }
}
