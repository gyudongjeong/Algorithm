package ch02_layout;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutEx extends JFrame {

	public FlowLayoutEx() {
		setTitle("FlowLayout"); // 프레임 제목
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //창을 닫으면 프로그램이 종료됨.
		Container c = getContentPane(); //'JFrame' 내부의 'ContentPane' 객체 반환.
		
		c.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40)); //레이아웃 설정 //FlowLayout : '좌 → 우'로 배치함. 우측 공간 부족 시, 다음 줄에 배치함. //(FlowLayout.LEFT, 30, 40) == (align, horizontal gap, vertical gap) == (정렬 방식, 버튼 간 가로 간격, 버튼 간 세로 간격)
		c.add(new JButton("add")); //'ContentPane'에 더하기 버튼(addition) 생성
		c.add(new JButton("sub")); //'ContentPane'에 빼기 버튼(subtract) 생성
		c.add(new JButton("mul")); //'ContentPane'에 곱하기 버튼(multiplication) 생성
		c.add(new JButton("div")); //'ContentPane'에 나누기 버튼(division) 생성
		c.add(new JButton("Calculate")); //'ContentPane'에 계산 버튼 생성
		
		setSize(300, 200); //프레임 크기
		setVisible(true); //프레임 출력
		
	} //FlowLayoutEx 생성자
	
	
	public static void main(String[] args) {
		new FlowLayoutEx(); //'FlowLayoutEx' 객체 생성.

	} //main 메서드

} //FlowLayoutEx 클래스: 'JFrame' 클래스를 상속받음.
