package 문제;

public class 문제4 {

	public static void main(String[] args) {
		int[] num = {11,22,33,44};
		int j = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] == 33) {
				j	= i +1;
				System.out.println("33은 " + j + "번째 방에 있습니다. ");
			}
		}
	}

}
