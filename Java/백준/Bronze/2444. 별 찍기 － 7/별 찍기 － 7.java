import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        for(int i = 1; i <= N; i++) {
            for (int j = N - i; j > 0; j--) {
                System.out.print(" ");
            } //내부 for문1-1 : 피라미드의 공백 출력 부분.

            for (int k = 1; k <= i + (i - 1); k++) {
                System.out.print("*");
            } //내부 for문1-2 : 피라미드의 별 출력 부분.
            System.out.println();
        } //외부 for문1(윗부분 == 피라미드) : 행의 수 부분.

        for(int i = 1; i < N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            } //내부 for문2-1 : 역피라미드의 공백 출력 부분.

            for (int k = (2 * N) - 2; k >= 2 * i; k--) {
                System.out.print("*");
            } //내부 for문2-2 : 역피라미드의 별 출력 부분.
            System.out.println();
        } //외부 for문2(아랫부분 == 역피라미드) : 행의 수 부분.
    }
}
