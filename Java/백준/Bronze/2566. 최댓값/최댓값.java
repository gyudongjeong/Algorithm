import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[9][9];

        for (int row = 0; row < arr.length; row++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int col = 0; col < arr.length; col++) {
                arr[row][col] = Integer.parseInt(st.nextToken());
            } //내부 for문1: 열
        } //외부 for문1: 행

        int max = Integer.MIN_VALUE; //최댓값
        int[] countArr = new int[2]; //최댓값의 위치(행과 열)
        countArr[0] = 1;
        countArr[1] = 1;

        for (int row1 = 0; row1 < arr.length; row1++) {
            for (int col1 = 0; col1 < arr.length; col1++) {
                if (arr[row1][col1] > max) {
                    max = arr[row1][col1];
                    countArr[0] = row1 + 1;
                    countArr[1] = col1 + 1;
                }
            } //내부 for2: 열
        } //외부 for2: 행

        System.out.println(max);
        System.out.print(countArr[0] + " " + countArr[1]);

    } //main 메서드
}