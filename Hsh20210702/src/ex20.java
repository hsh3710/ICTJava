public class ex20 {

	public static void main(String[] args) {
		// 2021.07.13. ���α׷��� -20- 161p �������� 3��
		
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
		