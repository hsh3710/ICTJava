import java.util.Scanner;

public class ex17 {

	public static void main(String[] args) {
		// 2021.07.13. 프로그래밍 -15- While 문
		
		int count=0;
		int sum=0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력하고 마지막에 -1을 입력하세요.");
		
		int n = scanner.nextInt();
		while(n != -1) {
			sum += n;
			count++;
			n = scanner.nextInt();
		}
		
	}
}
		