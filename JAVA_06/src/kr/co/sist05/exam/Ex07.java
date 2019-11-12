package kr.co.sist05.exam;

public class Ex07 {
//[4-6] 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프
//로그램을 작성하시오.
//6==i+j;
//	
	public static void main(String[] args) {
		int k=0;
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=6;j++) {
				if(6==i+j) {
					k++;
					System.out.printf("%d+%d=%d\n",i,j,i+j);
				}
			}
		}
		System.out.println("갯수:"+k);

	}

}
