package BinarySearch2;

import java.util.Arrays;
import java.util.Scanner;

public class Money {
    //https://www.acmicpc.net/problem/2512
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 지방의 수
        int[] money = new int[n];
        for(int i = 0; i<n; i++){
            money[i]=sc.nextInt();
        }
        int m =sc.nextInt(); //  총예산
        Arrays.sort(money); // 크기순 정렬

        System.out.println(binary(money,m));
    }
    static int binary(int[] arr,int m){
        int big = arr[arr.length-1]; //가장 큰값
        int small = 0;
        int result = 0;
        while(small<=big){
            int money = (big+small)/2; //중간값
            int total = 0;
            for(int i= 0 ; i<arr.length; i++){
                if((arr[i]-money)>=0){ //필요한 돈이 더 많으면 예산값으로
                    total += money;
                }else {
                    total += arr[i]; //필요한 돈이 더 적으면 필요한 돈으로
                }
            }
            if(total <= m){ //m보다는 작아야됨
                result = money;
                small = money+1; //중간값보다 큰 값이 필요해서 중간값으로 바꿔줌

            }else {
                big = money -1;//중간값보다 작은 값이 필요해서 큰값을 중간값으로 바꿔줌
            }
        }
        return result;
    }
}
