package kr.co.sist05.exam;

public class Ex04 {
//1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)�� ����� ����Ͻÿ�.
	public static void main(String[] args) {
    
		//1~ 10�ݺ���
		
		int sum      =0;//����
		int totalSum =0;//total����
		for(int i=1;i<=10;i++) {
			sum+=i;
			totalSum+=sum;
		}
		System.out.println("totalSum:"+totalSum);

	}

}
