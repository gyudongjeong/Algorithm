import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] dots = new int[N][2];
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 2; j++) {
				dots[i][j] = Integer.parseInt(st.nextToken());
			} //for j
		} //for i
		
		Arrays.sort(dots, (a, b) -> {
			if(a[0] == b[0]) {
				return a[1] - b[1];
			} //if
			return a[0] - b[0];
			
		}); //sort
		
		for(int i = 0; i < N; i++) {
			System.out.print(dots[i][0] + " " + dots[i][1] + "\n");
		} //for

	} //main

}