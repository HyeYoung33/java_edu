package 입출력;

import javax.swing.JFrame;

import com.sun.org.apache.bcel.internal.generic.NEW;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 중국집메뉴판 {
	private static JTextField t2;
	static int count 	= 	0;  //주문수 카운트
	static int sum		=	0;  //전체 금액 계산
	static int 짜장		=	0;  //주문수 카운트
	static int 우동		=	0;  //주문수 카운트
	static int 짬뽕		=	0;  //주문수 카운트
	
	private static JTextField t1;
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.YELLOW);
		f.getContentPane().setForeground(Color.CYAN);
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);

		JButton b1 = new JButton("");
		b1.setFont(new Font("굴림", Font.BOLD, 20));
		b1.setBounds(41, 68, 82, 23);
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("");
		b2.setFont(new Font("굴림", Font.BOLD, 20));
		b2.setBounds(135, 68, 82, 23);
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("");
		b3.setFont(new Font("굴림", Font.BOLD, 20));
		b3.setBounds(231, 68, 82, 23);
		f.getContentPane().add(b3);
		

		JLabel lblNewLabel = new JLabel("지불할 총 금액 :");
		lblNewLabel.setFont(new Font("굴림체", Font.BOLD, 25));
		lblNewLabel.setBounds(22, 387, 206, 31);
		f.getContentPane().add(lblNewLabel);
		
		t2 = new JTextField();
		t2.setFont(new Font("굴림체", Font.PLAIN, 25));
		t2.setBounds(240, 382, 168, 41);
		f.getContentPane().add(t2);
		t2.setColumns(10);
		
		JLabel img = new JLabel("");
		img.setIcon(new ImageIcon("D:\\khy\\my07\\짜장면.jpg"));
		img.setBackground(new Color(240, 240, 240));
		img.setBounds(41, 111, 415, 262);
		f.getContentPane().add(img);
		
		t1 = new JTextField();
		t1.setFont(new Font("굴림체", Font.PLAIN, 25));
		t1.setColumns(10);
		t1.setBounds(334, 19, 122, 41);
		f.getContentPane().add(t1);
		
		JButton btnNewButton = new JButton("짜장");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				img.setIcon(new ImageIcon("짜장.gif"));
				count++;
				짜장++;
				b1.setText(짜장 + "개");
				t1.setText(count + "개");
				sum	+= 5000;
				t2.setText(sum + "원");
			}
			
		});
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton.setBounds(41, 21, 82, 41);
		f.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("우동");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				img.setIcon(new ImageIcon("우동.png"));
				count++;
				우동++;
				b2.setText(우동	 + "개");
				t1.setText(count + "개");
				sum	+= 6000;
				t2.setText(sum + "원");
			}
		});
		button.setFont(new Font("굴림", Font.BOLD, 20));
		button.setBounds(135, 21, 84, 41);
		f.getContentPane().add(button);
		
		JButton button_1 = new JButton("짬뽕");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				img.setIcon(new ImageIcon("짬뽕.png"));
				count++;
				짬뽕++;
				b3.setText(짬뽕 + "개");
				t1.setText(count + "개");
				sum	+= 7000;
				t2.setText(sum + "원");
			}
		});
		button_1.setFont(new Font("굴림", Font.BOLD, 20));
		button_1.setBounds(231, 21, 91, 41);
		f.getContentPane().add(button_1);
		



		f.setVisible(true);

	}

}
