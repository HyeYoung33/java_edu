package 윈도우;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.Stack;
import java.awt.event.ActionEvent;

public class 메뉴판 {
	static int	count = 10;  // 도너츠의 개수

	public static void main(String[] args) {
		// 큰 프레임을 만들어야 함
		JFrame	f = new JFrame();
		
		// 프레임의 크기를 결졍해야 함.
		f.setSize(777,	619);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("D:\\khy\\my06\\도넛.jpg"));
		f.getContentPane().add(label, BorderLayout.CENTER);
		
		JButton btnNewButton = new JButton("-");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (count == 0) {
					f.setTitle("더 이상 뺄 수 없음");
				} else {
					
					//JOptionPane.showMessageDialog(null, "도너츠 빼기!");
					count--;
					//System.out.println("도너츠의 개수는 " + count);
					f.setTitle("도너츠의 개수는 " + count + "개");
				}
			}
		});
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 50));
		f.getContentPane().add(btnNewButton, BorderLayout.WEST);
		
		JButton btnNewButton_1 = new JButton("+");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//JOptionPane.showMessageDialog(null, "도너츠 더하기!");
				count++;
				//System.out.println("도너츠의 개수는 " + count);
				f.setTitle("도너츠의 개수는 " + count + "개");
			}
		});
		btnNewButton_1.setBackground(Color.MAGENTA);
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 50));
		f.getContentPane().add(btnNewButton_1, BorderLayout.EAST);
		
		// 프레임을 보여지게 설정해야 함.
		f.setVisible(true);
		

	}

}
