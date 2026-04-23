import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//문자열 입력 받기
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		s = s.strip(); //문자열 공백 제거
		
		//toCharArray: 문자열 → 문자 배열로 변환
		char[] charArray = s.toCharArray();
		
		int count = 0; //총 공백 수
		char target = ' ';
        
		for(int i = 0; i < s.length(); i++) {
			if(charArray[i] == target) {
				count++;
			} //if: 공백 개수 세기
		} //for: 문자 배열 순회
		
		//단어의 개수 출력: 단어의 개수 == (공백 + 1)개
		if(s.isBlank()) {
            System.out.println(0);
        } else {
        System.out.println(count + 1);
        }
        
        sc.close(); //Scanner 종료

	} //main

}
