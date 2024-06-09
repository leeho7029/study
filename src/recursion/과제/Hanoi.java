package recursion.과제;

import com.sun.jdi.ArrayType;

import javax.sound.midi.Sequence;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Hanoi {
    /*
    세 개의 장대가 있고 첫 번째 장대에는 반경이 서로 다른 n개의 원판이 쌓여 있다. 각 원판은 반경이 큰 순서대로 쌓여있다.
    이제 수도승들이 다음 규칙에 따라 첫 번째 장대에서 세 번째 장대로 옮기려 한다.
    한 번에 한 개의 원판만을 다른 탑으로 옮길 수 있다.
    쌓아 놓은 원판은 항상 위의 것이 아래의 것보다 작아야 한다.
    이 작업을 수행하는데 필요한 이동 순서를 출력하는 프로그램을 작성하라. 단, 이동 횟수는 최소가 되어야 한다.
    */
    int i;
    int j;
    int k;
    int times;
    int[] array;
    int[] array2;
    int[] array3;

    public int[] top(int size) {
        array = new int[size];
        array2 = new int[size];
        array3 = new int[size];

        for(int n=1;n<=i;n++){
            array[n-1] = n;
        }

        return array;
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        Hanoi hanoi = new Hanoi();
        int[] array = hanoi.top(size);


    }
}
