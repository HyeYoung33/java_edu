package 순차문;

import javax.swing.JOptionPane;

public class 순차문3 {

	public static void main(String[] args) {
		//입력
		String data = JOptionPane.showInputDialog("현재 온도는?");
		// String -->  int
		int now = Integer.parseInt(data);
		
		//처리
		int back = now - 1;
		
		//출력
		System.out.println("집에 갈 때의 온도는 " + back + "도");
			

		
	}

}
