package 순차문;

import javax.swing.JOptionPane;

public class 순차문2 {

	public static void main(String[] args) {
		String team = JOptionPane.showInputDialog("소속");
		String name = JOptionPane.showInputDialog("이름");
		String result = name + "은 " + team + "소속입니다.";
		JOptionPane.showMessageDialog(null, result);		

		
	}

}
