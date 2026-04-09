package ch01_swing_frame;

import javax.swing.*; //JFrame, JButton 등
import java.awt.*; //Container, Color, FlowLayout 등

//주제 : 버튼 컴포넌트를 갖는 프레임 생성

public class ContentPaneEx extends JFrame {

	public ContentPaneEx() {
		setTitle("ContentPane과 JFrame"); //프레임 제목
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //창 닫기 시, 프로그램 종료 //EXIT_ON_CLOSE: 'System.exit' 메서드를 통해 앱을 종료함.
		
		Container contentPane = getContentPane(); //'Container' 타입 변수인 'contentPane' 생성 및 초기화 //ContentPane: 창의 본문 부분
		contentPane.setBackground(Color.ORANGE); //ContentPane의 배경색 설정
		contentPane.setLayout(new FlowLayout()); //레이아웃 설정 //FlowLayout : '좌 → 우'로 배치함. 공간 부족 시, 다음 줄로 이동함.
		
		contentPane.add(new JButton("OK")); //확인 버튼 생성 //ContentPane 영역에 버튼을 배치함.
		contentPane.add(new JButton("Cancel")); //취소 버튼 생성
		contentPane.add(new JButton("Ignore")); //무시 버튼 생성
		
		setSize(300, 150); //프레임 크기
		setVisible(true); //프레임 출력
	} //ContentPaneEx 생성자
	
	public static void main(String[] args) {
		new ContentPaneEx(); //객체 생성만 하고, 저장은 X. //'ContentPaneEx' 생성자 실행.

	} //main 메서드

} //ContentPaneEx 클래스: 'JFrame' 클래스를 상속받음.

//출처: https://blog.naver.com/newbongman/224080669095