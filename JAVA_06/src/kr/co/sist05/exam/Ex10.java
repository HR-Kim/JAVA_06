package kr.co.sist05.exam;

public class Ex10 {
//[4-10] intŸ���� ���� num �� ���� ��, �� �ڸ��� ���� ���� ����� ����ϴ� �ڵ带
//�ϼ��϶�. ���� ���� num�� ���� 56789���, ��5+6+7+8+9���� ����� 35�� ����϶�. (1)
//�� �˸��� �ڵ带 �����ÿ�.
//[����] ���ڿ��� ��ȯ���� ���� ���ڷθ� ó���ؾ� �Ѵ�.
	public static void main(String[] args) {
		int num = 56789;
		int sum = 0;
		// /, %���� �̿�
		while(num>0) {
			sum+=num%10;//9,8..
			num=num/10;//5678,567
		}
		
		System.out.println("sum:"+sum);
		
		

	}

}
