package kr.co.sist05.exam;

public class Ex06 {
	//for to while
	public static void main(String[] args) {
//		for(int i=0; i<=10; i++) {
//            for(int j=0; j<=i; j++){
//            	 System.out.print("*");
//            }//for j    
//            System.out.println();
//        }//for i
		int i=0;
		while(i<=10) {
			int j=0;
			while(j<=i) {
				System.out.print("*");
				j++;
			}//while j
			
			System.out.println();
			i++;
		}//while i

	}

}
