package exam;

import javax.swing.JOptionPane;

public class 소속 {

	public static void main(String[] args) {
		String team = JOptionPane.showInputDialog("당신의 소속은 ");
		String join	=	team + "스터디";
		System.out.println("당신의 소속은 " + join + "입니다.");
		

	}

}
