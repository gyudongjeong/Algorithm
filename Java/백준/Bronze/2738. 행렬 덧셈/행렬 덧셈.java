import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); //행의 크기 입력 받기
        int M = Integer.parseInt(st.nextToken()); //열의 크기 입력 받기
        int[][] A = new int[N][M]; //행렬 A
        int[][] B = new int[N][M]; //행렬 B
        int[][] rs = new int[N][M]; //결과 행렬

        //행렬 A의 요소 삽입 반복문
        for (int row = 0; row < N; row++) {
            st = new StringTokenizer(br.readLine());

            for (int col = 0; col < M; col++) {
                A[row][col] = Integer.parseInt(st.nextToken());
            } //내부 for문1: 열 반복 순회 및 요소 삽입
        } //외부 for문1: 행 반복 순회

        //행렬 B의 요소 삽입 반복문
        for (int row = 0; row < N; row++) {
            st = new StringTokenizer(br.readLine());

            for (int col = 0; col < M; col++) {
                B[row][col] = Integer.parseInt(st.nextToken());
            } //내부 for문2: 열 반복 순회 및 요소 삽입
        } //외부 for문2: 행 반복 순회

        //행렬 A + 행렬 B
        for (int row = 0; row < N; row++) {
            for (int col = 0; col < M; col++) {
                rs[row][col] += (A[row][col] + B[row][col]);
                System.out.print(rs[row][col] + " ");
            }
            System.out.println();
        } //외부 for문3: 행 반복 순회

    } //main 메서드
}
