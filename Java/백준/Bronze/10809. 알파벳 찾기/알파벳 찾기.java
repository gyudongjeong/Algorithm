import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		//단어 입력 받기
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		
		//알파벳 배열 생성 및 요소 저장
		char[] charArr = new char[26];
		
		for(int i = 0; i < 26; i++) {
			charArr[i] = (char) ('a' + i);
		} //for
		
		//알파벳 배열을 순회하면서 해당 알파벳의 포함 여부를 확인 후, 출력함.
		for(int i = 0; i < 26; i++) {
			System.out.print(S.indexOf(charArr[i]) + " ");
		} //for
		
	} //main
	
}
