package recursion.과제;

import java.util.Scanner;

public class Factorial {
    long result = 1;

    public long Factorial(long n){
        if(n==0 || n==1 ){
            return result;
        }else{
            result *= n;
            Factorial(n-1);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        Factorial fact = new Factorial();
        long factorial = fact.Factorial(n);
        System.out.println(factorial);
    }
}
