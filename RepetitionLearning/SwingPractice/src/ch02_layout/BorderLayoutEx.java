package ch02_layout;

import javax.swing.*;
import java.awt.*;

//주제: BorderLayout 형식의 프레임 생성.

public class BorderLayoutEx extends JFrame {
	
	public BorderLayoutEx() {
		setTitle("BorderLayout"); //프레임 제목
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //창 닫기 == 프로그램 종료
		
		Container c = getContentPane(); //'JFrame' 내부의 'ContentPane' 객체 반환.
		
		c.setLayout(new BorderLayout(30, 20)); //레이아웃 설정 //BorderLayout: 컨테이너를 5개 영역으로 나눔(각 위치 당 1개의 컴포넌트만 옴). //(30, 20) == (버튼 간 가로 간격, 버튼 간 세로 간격)
		c.add(new JButton("Calculate"), BorderLayout.CENTER); //5개 영역 中 가운데에 '계산' 버튼을 둠.
		c.add(new JButton("add"), BorderLayout.NORTH); //5개 영역 中 상단에 '더하기' 버튼을 둠.
		c.add(new JButton("sub"), BorderLayout.SOUTH); //5개 영역 中 하단에 '빼기' 버튼을 둠.
		c.add(new JButton("mul"), BorderLayout.EAST); //5개 영역 中 우측에 '더하기' 버튼을 둠.
		c.add(new JButton("div"), BorderLayout.WEST); //5개 영역 中 좌측에 '더하기' 버튼을 둠.
		
		setSize(300, 200); //프레임 크기
		setVisible(true); //프레임 출력
	} //BorderLayoutEx 생성자

	public static void main(String[] args) {
		new BorderLayoutEx(); //'BorderLayoutEx' 객체 생성.

	} //main 메서드

} //BorderLayoutEx 클래스: 'JFrame' 클래스를 상속받음.
