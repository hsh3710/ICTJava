public class ex23 {

	public static void main(String[] args) {
		// 2021.07.13. ���α׷��� -23- �迭 137p üũ����Ʈ 1��
		int sum = 0;
		
		int[] tenArray = new int[10];
		
		int size = tenArray.length;
		System.out.println("�迭 tenArray�� ũ�� >> " + size);
		
		for(int i =0; i < tenArray.length; i++) {
			tenArray[i] = i + 1;
			sum += tenArray[i];
		}
			System.out.println("1 ~ 10������ �� >> "+ sum);
		
	}
}