package kr.co.sist05.exam;

public class Ex09 {
//[4-9] ���ڷ� �̷���� ���ڿ� str�� ���� ��, �� �ڸ��� ���� ���� ����� ����ϴ� ��
//�带 �ϼ��϶�. ���� ���ڿ��� "12345"���, ��1+2+3+4+5���� ����� 15�� ����� ��µ�
//��� �Ѵ�. (1)�� �˸��� �ڵ带 �����ÿ�.
//[Hint] StringŬ������ charAt(int i)�� ���
	public static void main(String[] args) {
		String str = "12345";
		
		int sum = 0;//total  ���庯��
		for(int i=0;i<str.length();i++) {
			char tmp = str.charAt(i);
			//System.out.println(tmp);
			
			sum+=tmp -'0';//sum+=Integer.parseInt(tmp+"");
		}
		System.out.println("sum="+sum);

	}

}
