package exam;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class 기본입력2 {

	public static void main(String[] args) throws IOException {
		String s1 = JOptionPane.showInputDialog("입력하세요 1");
		String s2 = JOptionPane.showInputDialog("입력하세요 2");
		String s3 = s1 + s2;
		System.out.println(s3);
		
		
		JOptionPane.showMessageDialog(null, s3);
		
		FileWriter file = new FileWriter("win.txt");
		file.write(s3);
		file.close();
	}

}
