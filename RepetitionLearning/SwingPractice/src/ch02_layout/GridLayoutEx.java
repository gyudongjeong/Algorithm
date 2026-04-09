package ch02_layout;

import javax.swing.*;
import java.awt.*;

//주제: GridLayout 형식의 프레임 생성.

public class GridLayoutEx extends JFrame {

	public GridLayoutEx() {
		setTitle("GridLayout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout grid = new GridLayout(4, 2); //GridLayout: 직사각형 격자로 나눔. // (4, 2) == (rows, columns)
		grid.setVgap(5); //setVgap: 컴포넌트들 간의 세로 간격 설정
		
		Container c = getContentPane();
		c.setLayout(grid);
		c.add(new JLabel(" 이름")); //1행 1열에 " 이름" 라벨 추가(맨 앞의 공백은 왼쪽의 간격을 확보하기 위한 용도) //JLabel 인스턴스: 짧은 text 문자열 or 이미지를 보여주는 공간.
		c.add(new JTextField("")); //1행 2열에 텍스트 입력 칸 추가(공백으로 초기화함) //JTextField: 1줄의 text 편집.
		c.add(new JLabel(" 학번")); //2행 1열에 " 학번" 라벨 추가
		c.add(new JTextField("")); //2행 2열에 텍스트 입력 칸 추가
		c.add(new JLabel(" 학과")); //3행 1열에 " 학과" 라벨 추가
		c.add(new JTextField("")); //3행 2열에 텍스트 입력 칸 추가
		c.add(new JLabel(" 과목")); //4행 1열에 " 과목" 라벨 추가
		c.add(new JTextField("")); //4행 2열에 텍스트 입력 칸 추가
		
		setSize(300, 200);
		setVisible(true);
	} //GridLayoutEx 생성자
	
	public static void main(String[] args) {
		new GridLayoutEx();
	} //main 메서드

} //GridLayoutEx 클래스

//출처: https://blog.naver.com/newbongman/224080669095