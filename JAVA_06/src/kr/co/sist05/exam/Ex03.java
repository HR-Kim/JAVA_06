package kr.co.sist05.exam;

public class Ex03 {
//[4-2-1] 1���� 20������ ���� �߿��� 2 �Ǵ� 3�� ����� �ƴ� ���� ������ ���Ͻÿ�.
	public static void main(String[] args) {
	    //1. 1���� 20������ ����
		//2. 2 �Ǵ� 3�� ����� �ƴ� �� ����
		int sum = 0;//��������
		
		for(int i=1;i<=20;i++) {
			//(i%2!=0 && i%3!=0)
			if( !(i%2==0 || i%3==0)) { 
				sum+=i;
			}
		}
		
		System.out.println("sum="+sum);
		//sum=73
		
	}

}
