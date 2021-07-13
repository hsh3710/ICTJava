public class ex22 {

	public static void main(String[] args) {
		// 2021.07.13. 프로그래밍 -22- 배열
		
		int[] s = new int[10];
		
		for(int i = 0; i < s.length; i++) {
			s[i] = i;
		}
		
		for(int i = 0; i < s.length; i++) {
			System.out.print(s[i] + " ");
		}
	}
}