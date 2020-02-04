package 배열;

public class 배열연습3 {

	public static void main(String[] args) {

		int[] num = new int[10];
		
		System.out.println(num.length);
		for (int i = 0; i < num.length; i++) {
			num[i]	=	i;
		}

		for (int i = 0; i < num.length; i++) {
			System.out.println("num[" + i + "] = " + num[i]);
		}
		
	}

}
