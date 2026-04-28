import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine());
		
		Stack<Integer> stack = new Stack<Integer>();
		
		int sum = 0;
		
		for(int i = 0; i < K; i++) {
			int num = Integer.parseInt(br.readLine());
			
			if(num == 0) { //if: 입력한 정수가 0이면, 스택의 요소 1개를 뺌.
				sum -= stack.pop();
			} else { //else: 입력한 정수가 0이 아닌 경우
				stack.push(num); //스택에 해당 정수를 넣음.
				sum += num; //해당 정수를 sum에 더함.
			} //if else
		} //for
		
		System.out.println(sum);
		
	} //main
	
}
