package ch01_swing_frame;

import javax.swing.*;

//주제 : 프레임(= 컨테이너 = 창) 생성

public class MyFrame extends JFrame {

	public MyFrame() {
		setTitle("300x300 스윙 프레임 생성"); //프레임의 제목(창 위에 표시됨)
		setSize(300, 300); //setSize(int width, int height) //프레임 크기
		setVisible(true); //프레임 출력 //'false'인 경우 : [백그라운드에서] 실행은 됨. But, 화면에는 표시 X.
		
	} //MyFrame 생성자 : 'MyFrame' 객체 생성 시, 자동 실행됨.
	
	public static void main(String[] args) {
		MyFrame frame = new MyFrame(); //'MyFrame' 객체 생성 → 생성자가 실행됨.

	} //main 메서드

} //MyFrame 클래스 : 'JFrame' 클래스를 상속받음.

//코드의 문제점: 창을 닫아도 프로그램 종료 X.

//출처: https://blog.naver.com/newbongman/224080669095