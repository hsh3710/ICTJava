import java.util.Scanner;

public class ex19 {

	public static void main(String[] args) {
		// 2021.07.13. ���α׷��� -19- break ��
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("exit�� �Է��� �����մϴ�.");
		while(true) {
			System.out.print(">>");
			String text = scanner.nextLine();
			
			if(text.equals("exit"))
				break;
		}
		
		System.out.println("�����մϴ�...");
		scanner.close();
		
		
		
	}
}
		