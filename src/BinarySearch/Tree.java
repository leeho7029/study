package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class Tree {

    static int cut(int arr[], int k){
        int small = 0;
        int big = arr.length-1;
        int h = 0;
        int result=0;
        for(int i=1; i<big;i++){
          h +=  arr[i] ;
        }

        int avg = h/(big-1);
        int[] cutTrees = new int[arr.length];

        while (avg <= arr[big]){
            int sum=0;
          for (int i=0; i<arr.length; i++){
              if((arr[i] - avg) >0) {
                  cutTrees[i] = (arr[i] - avg);
              } else {
                  cutTrees[i] = 0;
              }
          }
          for (int num : cutTrees){
              sum += num;
          }
          if(sum >= k){
              result = avg;
              avg= avg +1;
          } else if (sum <k) {
              avg = avg - 1;
              if(result == avg){
                  return result;
              }
          }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Scanner 객체 생성
        int n = sc.nextInt();  // 첫 번째 줄에서 수의 개수 N 입력받기
        int m = sc.nextInt();
        int[] trees = new int[n];  // 크기가 N인 배열 생성

        for (int i = 0; i < n; i++) {
            trees[i] = sc.nextInt();  // N개의 줄에서 수 입력받아 배열에 저장
        }

        Arrays.sort(trees);
        int height = cut(trees,m);

        System.out.println(height);

    }
}
