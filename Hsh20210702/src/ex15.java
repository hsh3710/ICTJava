public class ex15 {

	public static void main(String[] args) {
		// 2021.07.09. 프로그래밍 -15- While 문
		
        int i;
		
		System.out.print("for 결과>> ");
		
		for(i=0; i<10; i++) {
			System.out.print(i+" ");
		}
           System.out.println(" "); 
           System.out.println("끝난 후 i의값 = "+i);
		
         i = 0;
         System.out.print("while 결과>> ");
         while(i<10) {
        	 System.out.print(i+" ");
        	 i++;
         }
         System.out.println(" "); 
         System.out.println("끝난 후 i의값  = "+i);
	}

}
