import java.util.Scanner;

public class ex17 {

	public static void main(String[] args) {
		// 2021.07.13. ���α׷��� -15- While ��
		
		int count=0;
		int sum=0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �Է��ϰ� �������� -1�� �Է��ϼ���.");
		
		int n = scanner.nextInt();
		while(n != -1) {
			sum += n;
			count++;
			n = scanner.nextInt();
		}
		
	}
}
		