package kr.co.sist05.exam;

public class Ex05 {
//[4-4] 1+(-2)+3+(-4)+... �� ���� ������ ��� ���س����� ��, ����� ���ؾ� ������
//	100�̻��� �Ǵ��� ���Ͻÿ�.
	public static void main(String[] args) {
		//1.�ݺ����� ���� Loop
		// 1.1. if(sum>=100)break;
		// int s =1;//-1,1-1....
		int sum = 0;//����
		int num = 0;//i*s
		int s   = 1;////-1,1-1,1...

		for(int i=1;true;i++,s=-s) {
			num  = i * s;
			sum +=num;
			
			if(sum>=100) {//sum 100���� ���ų� ũ�� �ݸ��� ����������.
				break;
			}
			System.out.printf("s=%2d,num=%4d, sum=%4d \n",s,num,sum);
		}
		
		System.out.println("num:"+num);
		System.out.println("sum:"+sum);
		
		
	}

}
