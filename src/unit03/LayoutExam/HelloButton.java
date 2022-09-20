package unit03.LayoutExam;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HelloButton extends JFrame{

	HelloButton(){
		
		//패널을 만들어서 프레임에 붙이기
		JPanel p = new JPanel();
		p.setBackground(Color.blue);
		add(p);
		
		//컴포넌트 버튼을 생성해서, 패널에 붙이기
		JButton btn = new JButton("버튼");
		p.add(btn);
		
		//프레임 초기설정
		setTitle("안녕 버튼");
		setSize(300, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setVisible(true);
		
	}
		
	
	public static void main(String[] args) {
		new HelloButton();
	}

}
