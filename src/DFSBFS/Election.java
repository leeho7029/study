package DFSBFS;

import java.util.*;

public class Election {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] people = new int[n];
        int [] node = new int[n];
        for(int i=0; i<n;i++){
            people[i] = sc.nextInt();
        }
        boolean[] visited = new boolean[n];
        int[][] matrix = new int[n][n];
        for(int i=0; i<n; i++){
            int a = sc.nextInt();
            int b= sc.nextInt();
            int c= sc.nextInt();
            matrix[i][b-1] = people[b-1];
            matrix[i][c-1]= people[c-1];
            matrix[b-1][i] = people[b-1];
            matrix[c-1][i]=people[c-1];
        }
        BFS(matrix,1,visited,people,node);


    }
    public static void BFS(int[][] matrix, int v, boolean[] visited, int[] people, int[] node){
        Queue<Integer> q = new LinkedList<>();
        int[] arr = new int[matrix.length];
        int[] arr2 = new int[matrix.length];
        q.add(v);
        visited[v-1] = true;
        arr[0]=people[v-1];
        for (int k = 0; k < matrix.length; k++) {
            int max = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[k][j] > max) {
                    max = matrix[k][j];
                }
            }
        while(!q.isEmpty()){
            v=q.poll();
            System.out.print(v+ " ");
            for(int i=0; i< matrix.length; i++){
                if(matrix[v-1][i] !=0 && !visited[i] && matrix[v-1][i]>= max){

                    q.add(node[i]);
                    visited[i]=true;
                    arr[i]=people[v-1];//노드의 인구수
                    arr2[i]=v; //노드 순서
                }
            }
        }






    }
}
