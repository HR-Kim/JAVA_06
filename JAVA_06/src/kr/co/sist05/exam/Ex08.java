package kr.co.sist05.exam;

public class Ex08 {
//[4-8] ������ 2x+4y==10�� ��� �ظ� ���Ͻÿ�. ��, x�� y�� �����̰� ������ ������
//0<=x<=10, 0<=y<=10 �̴�.
	public static void main(String[] args) {

		for(int x=0;x<=10;x++) {
			for(int y=0;y<=10;y++) {
				if((2*x+4*y)==10) {
					System.out.printf("x=%d,y=%d\n"
							,x,y);
				}
			}
		}
		

	}

}
