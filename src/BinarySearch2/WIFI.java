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
            int spot = arr[0]; // 가장 처음 집은 무조건 설치

            for(int i =1; i<n; i++){
                if(arr[i]-spot >= distance){ //첫집과 그다음집간의 거리가 탐색범위보다 크면 설치
                    count++; //설치수 증가
                    spot=arr[i]; //설치후 다시 기준 집을 변경
                }
            }
            if(count >= m){ // 목표한 갯수와 비교
                result=distance;
                small = distance +1; // 카운트가 많으면 범위를 좁혀야 해서,
                                    // small의 범위를 중간값의 1보다 크게설정해서 while문 탈출할수 있게한다.
            }else{
                big = distance - 1; //카운트가 적으면 범위를 늘린다.
            }
        }
        return result;
    }
}
