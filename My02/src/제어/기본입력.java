package 제어;

import javax.print.attribute.standard.JobOriginatingUserName;
import javax.swing.JOptionPane;

public class 기본입력 {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("당신의 이름은 ");
		System.out.println("당신이 입력한 이름은 " + name);
	}

}
