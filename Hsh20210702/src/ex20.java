public class ex20 {

	public static void main(String[] args) {
		// 2021.07.13. 프로그래밍 -20- 161p 연습문제 3번
		
		int sum=0, i=1;
		while(i < 100) {
			if(i%3 != 0) {
				i++;
				continue;
				
			}
			else sum += i;
			i++;
		}
		System.out.print(sum);
	}
}
		