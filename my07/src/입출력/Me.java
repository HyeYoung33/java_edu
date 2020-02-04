package 입출력;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Me {
	private static JTextField name;
	private static JTextField age;
	private static JTextField shoe;
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		
		f.getContentPane().setBackground(Color.GREEN);
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("이름");
		lblNewLabel.setFont(new Font("굴림체", Font.PLAIN, 40));
		lblNewLabel.setBounds(38, 61, 88, 68);
		f.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("나이");
		label.setFont(new Font("굴림체", Font.PLAIN, 40));
		label.setBounds(38, 160, 88, 68);
		f.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("신발");
		label_1.setFont(new Font("굴림체", Font.PLAIN, 40));
		label_1.setBounds(38, 258, 88, 68);
		f.getContentPane().add(label_1);
		
		name = new JTextField();
		name.setFont(new Font("굴림", Font.BOLD, 40));
		name.setBounds(138, 82, 177, 47);
		f.getContentPane().add(name);
		name.setColumns(10);
		
		JButton btnNewButton = new JButton("출력");
		btnNewButton.setBackground(Color.RED);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n = name.getText();
				if (n.equals("") || n.equals("다시입력")) {
					name.setText("다시입력");
				} else {
					System.out.println("이름 출력 : " + n + "님");
				}
				
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 40));
		btnNewButton.setBounds(337, 81, 121, 48);
		f.getContentPane().add(btnNewButton);
		
		age = new JTextField();
		age.setFont(new Font("굴림", Font.BOLD, 40));
		age.setColumns(10);
		age.setBounds(138, 173, 177, 47);
		f.getContentPane().add(age);
		
		JButton button = new JButton("출력");
		button.setBackground(Color.RED);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = age.getText();
				//내년 나이를 구해서, 나이 출력 아래에 넣오 보세요.
				int a2 = Integer.parseInt(a);
				int nextYear = a2 + 1;
				System.out.println("나이 출력 : " + a + "세");
				System.out.println("내년 나이 : " + nextYear + "세");
			}
		
		});
		button.setFont(new Font("굴림", Font.BOLD, 40));
		button.setBounds(337, 172, 121, 48);
		f.getContentPane().add(button);
		
		shoe = new JTextField();
		shoe.setFont(new Font("굴림", Font.BOLD, 40));
		shoe.setColumns(10);
		shoe.setBounds(138, 271, 177, 47);
		f.getContentPane().add(shoe);
		
		JButton button_1 = new JButton("출력");
		button_1.setBackground(Color.RED);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = shoe.getText();
				System.out.println("신발 사이즈 출력 : " + s + "mm");
			}
		});
		button_1.setFont(new Font("굴림", Font.BOLD, 40));
		button_1.setBounds(337, 270, 121, 48);
		f.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("모두 출력");
		button_2.setBackground(Color.RED);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("모두 출력");
//				System.out.println("이름 출력 : " + n + "님");
//				System.out.println("나이 출력 : " + a + "세");
//				System.out.println("신발 사이즈 출력 : " + s + "mm");
				System.out.println("이름 출력 : " + name.getText() + "님");
				System.out.println("나이 출력 : " + age.getText() + "세");
				System.out.println("신발 사이즈 출력 : " + shoe.getText() + "mm");
			}
		});
		button_2.setFont(new Font("굴림", Font.BOLD, 40));
		button_2.setBounds(138, 363, 220, 47);
		f.getContentPane().add(button_2);
		// 연산자 => 접근연산자(~에)
		
		
		f.setVisible(true);
		

	}
}
