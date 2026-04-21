import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] input = new int[8];
		boolean isAsc = true;
		boolean isDesc = true;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < input.length; i++) {
			input[i] = Integer.parseInt(st.nextToken());
		} //for
		
		br.close();
		
		for (int i = 1; i < input.length; i++) {
			if(input[i - 1] > input[i]) isAsc = false; //if
			else if(input[i - 1] < input[i]) isDesc = false; //else if
		} //for

		if(isAsc) System.out.println("ascending");
		else if(isDesc) System.out.println("descending");
		else System.out.println("mixed");

	}

}
