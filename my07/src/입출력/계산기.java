package 입출력;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 계산기 {
	private static JTextField num1;
	private static JTextField num2;
	private static JTextField result;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.ORANGE);
		f.setSize(422, 420);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\khy\\my07\\005.png"));
		lblNewLabel.setBounds(119, 10, 134, 102);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("숫자1 : ");
		lblNewLabel_1.setFont(new Font("굴림체", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(58, 146, 94, 24);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel label = new JLabel("숫자2 : ");
		label.setFont(new Font("굴림체", Font.PLAIN, 20));
		label.setBounds(58, 180, 94, 24);
		f.getContentPane().add(label);
		
		num1 = new JTextField();
		num1.setFont(new Font("맑은 고딕", Font.PLAIN, 25));
		num1.setBounds(137, 138, 134, 32);
		f.getContentPane().add(num1);
		num1.setColumns(10);
		
		num2 = new JTextField();
		num2.setFont(new Font("맑은 고딕", Font.PLAIN, 25));
		num2.setColumns(10);
		num2.setBounds(137, 180, 134, 32);
		f.getContentPane().add(num2);
		
		JButton btnNewButton = new JButton("더하기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String t11 = num1.getText();
				String t22 = num2.getText();
				int num11 = Integer.parseInt(t11);
				int num22 = Integer.parseInt(t22);
				int num33 = num11 + num22;
				String t33=String.valueOf(num33);
				result.setText(t33);
			}
		});
		
		btnNewButton.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		btnNewButton.setBounds(12, 257, 94, 32);
		f.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("뻬 기");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String t11 = num1.getText();
				String t22 = num2.getText();
				int num11 = Integer.parseInt(t11);
				int num22 = Integer.parseInt(t22);
				int num33 = num11 - num22;
				String t33=String.valueOf(num33);
				result.setText(t33);
			}
		});
		button.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		button.setBounds(114, 257, 77, 32);
		f.getContentPane().add(button);
		
		JButton button_1 = new JButton("곱하기");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String t11 = num1.getText();
				String t22 = num2.getText();
				double num11 = Double.parseDouble(t11);
				double num22 = Double.parseDouble(t22);
				double num33 = num11 * num22;
				String t33=String.valueOf(num33);
				result.setText(t33);
			}
			
		});
		button_1.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		button_1.setBounds(203, 257, 77, 32);
		f.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("나누기");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String t11 = num1.getText();
				String t22 = num2.getText();
				double num11 = Double.parseDouble(t11);
				double num22 = Double.parseDouble(t22);
				double num33 = num11 / num22;
				String t33=String.valueOf(num33);
				result.setText(t33);
			}
			
		});
		button_2.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		button_2.setBounds(293, 257, 87, 32);
		f.getContentPane().add(button_2);
		
		JLabel label_1 = new JLabel("결 과");
		label_1.setFont(new Font("굴림체", Font.PLAIN, 20));
		label_1.setBounds(58, 315, 94, 24);
		f.getContentPane().add(label_1);
		
		result = new JTextField();
		result.setFont(new Font("맑은 고딕", Font.PLAIN, 25));
		result.setColumns(10);
		result.setBounds(137, 315, 134, 32);
		f.getContentPane().add(result);
		
		
		f.setVisible(true);
	}
}
