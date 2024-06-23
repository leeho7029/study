package sorting;

import java.util.Scanner;

public class Bubble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] bubble = new int[n];
        for(int i = 0; i<n; i++){
            bubble[i]=sc.nextInt();
        }

        for(int i=0; i<n;  i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (bubble[j] > bubble[j + 1]) {
                    int a = bubble[j];
                    bubble[j] = bubble[j + 1];
                    bubble[j+1] = a;
                }
            }
        }

        for(int i = 0; i < n; i++) {
            System.out.print(bubble[i] + " ");
        }

        sc.close();
    }
}

