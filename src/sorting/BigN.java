package sorting;

import recursion.과제.Factorial;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BigN {
    long[] number(long n){
            long[] number = new long[(int) n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            number[i] = random.nextInt(1000) + 1; // 랜덤 long 값 할당
        }
       Arrays.sort(number);
        return number;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(n);
        BigN N = new BigN();
        long[] result = N.number(n);
        for(int i=0; i<n;i++){
            System.out.println(result[i]);
        }
    }
}
