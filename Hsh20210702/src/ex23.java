public class ex23 {

	public static void main(String[] args) {
		// 2021.07.13. 프로그래밍 -23- 배열 137p 체크포인트 1번
		int sum = 0;
		
		int[] tenArray = new int[10];
		
		int size = tenArray.length;
		System.out.println("배열 tenArray의 크기 >> " + size);
		
		for(int i =0; i < tenArray.length; i++) {
			tenArray[i] = i + 1;
			sum += tenArray[i];
		}
			System.out.println("1 ~ 10까지의 합 >> "+ sum);
		
	}
}