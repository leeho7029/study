package DFSBFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DFSBFS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Scanner 객체 생성
        int n = sc.nextInt();  // 정점의 개수
        int m = sc.nextInt(); // 간선의 개수
        int v = sc.nextInt(); // 탐색시작할 정점의 번호
        int [][] matrix = new int[n][n]; //행렬
        for(int i=0; i<m; i++){
            int a = sc.nextInt();
            int b= sc.nextInt();
            matrix[a-1][b-1] = 1;
            matrix[b-1][a-1] = 1;
        }
        int [] arr = new int[n];
        boolean[] visited = new boolean[n];
        DFS(matrix, v,visited);
        System.out.println();
        visited=new boolean[n];
        BFS(matrix,v,visited,arr);
    }

    public static void DFS(int[][] matrix, int v, boolean[] visited){
        visited[v-1] = true;
        System.out.print(v+ " ");
        for(int i=0; i<matrix.length; i++){
            if(matrix[v-1][i]==1 && !visited[i]){
                DFS(matrix,i+1,visited);
            }
        }
    }

    public static void BFS(int[][] matrix, int v, boolean[] visited, int[] arr) {
        Queue<Integer> q = new LinkedList<>();
        q.add(v);
        visited[v-1] = true;
        while (!q.isEmpty()){
            v=q.poll(); // q의 첫번째 값 삭제
            System.out.print(v+ " ");
            for(int i=0; i<matrix.length; i++){
                if(matrix[v-1][i] == 1 && !visited[i]){
                    q.add(i+1);
                    visited[i] = true;
                }
            }
        }


    }



}
