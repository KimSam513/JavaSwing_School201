package unit03.LayoutExam;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HelloButton extends JFrame{

	HelloButton(){
		
		//�г��� ���� �����ӿ� ���̱�
		JPanel p = new JPanel();
		p.setBackground(Color.blue);
		add(p);
		
		//������Ʈ ��ư�� �����ؼ�, �гο� ���̱�
		JButton btn = new JButton("��ư");
		p.add(btn);
		
		//������ �ʱ⼳��
		setTitle("�ȳ� ��ư");
		setSize(300, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setVisible(true);
		
	}
		
	
	public static void main(String[] args) {
		new HelloButton();
	}

}
