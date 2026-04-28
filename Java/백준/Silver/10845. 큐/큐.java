import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); //명령의 수
		Deque<Integer> queue = new ArrayDeque<Integer>();
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());			
			String command = st.nextToken();
			
			if(command.equals("push")) { //정수를 큐에 넣음.
				int num = Integer.parseInt(st.nextToken());
				queue.addLast(num);
			} else if(command.equals("pop")) {
				sb.append((queue.isEmpty()) ? -1 : queue.poll()).append("\n"); //큐의 Front에 있는 정수를 빼고, 출력함.
			} else if(command.equals("size")) {
				sb.append(queue.size()).append("\n");
			} else if(command.equals("empty")) {
				sb.append((queue.isEmpty()) ? 1 : 0).append("\n");
			} else if(command.equals("front")) {
				sb.append((queue.isEmpty()) ? -1 : queue.peek()).append("\n");
			} else if(command.equals("back")) {
				sb.append((queue.isEmpty()) ? -1 : queue.getLast()).append("\n");
			} //if
			
		} //for
        br.close();
		
		System.out.print(sb);

	} //main

}
