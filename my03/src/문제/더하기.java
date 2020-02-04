package 문제;

import javax.swing.JOptionPane;

public class 더하기 {

	public static void main(String[] args) {
		String data1 = JOptionPane.showInputDialog("수1을 입력 하세요");
		String data2 = JOptionPane.showInputDialog("수2을 입력 하세요");
		
		int num1 = Integer.parseInt(data1);
		int num2 = Integer.parseInt(data2);
		
		int result = num1 + num2;
		
		JOptionPane.showMessageDialog(null, data1 + "과 " + data2 + "의 합은 " + result + "입니다. ");	

	}

}
