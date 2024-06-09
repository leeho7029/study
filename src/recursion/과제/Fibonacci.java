package recursion.과제;

import java.util.Scanner;

public class Fibonacci {
    long result = 0;

    public long plus(long n){
        if(n==0){
            return 0;
        } else if (n==1){
            return 1;
        } else {
           return plus(n-1)+plus(n-2);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        Fibonacci fibo = new Fibonacci();
        long fibonacci = fibo.plus(n);
        System.out.println(fibonacci);
    }
}
