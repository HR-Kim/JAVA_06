package kr.co.sist05.exam;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=15;
		if(10<=x && x<=20) {
			System.out.printf("10<=x && x<=20=%b\n",10<=x && x<=20);
		}
		char ch ='a';
		if(!(' '==ch || '\t' ==ch)){
			System.out.printf("!(' '==ch || '\\t' ==ch)=%b\n"
					,!(' '==ch || '\t' ==ch));
		}
		ch ='x';
		if('x'==ch || ch=='X') {
			
		}
		
		ch ='8';
		if('0'<=ch && ch<='9') {
			
		}
		ch ='b';
		if( ('a'<=ch && ch<='z') || ('A'<=ch && ch<='Z')) {
			
		}
//1�� ���̰� �뷫 365.2422���̱� ������ 365�Ϸ� �ϰ� �뷫 4�⿡ �� ���� �Ϸ縦 ����ִ´�. �� �Ϸ�� 2�� 29���̴�. �׷��� �̷��� �ϸ� ��� 365.25���� �ǹǷ� 1�� ���̺��� ���.
//
//���� ������ ���� �ϴ�.
//
//1. 4�� ����� �ش� �������� �Ѵ�.
//2. �׷��� 100�� ����� �ش� ���⿡�� ����.
//3. �׷��� 400�� ����� �ش� ���� �������� �ִ´�.
		int year = 2019;
		int month = 28;
		if(year%400==0 || (year%4==0 && year%100!=0)) {
			month = 29;
		}
		boolean powerOn =false;
		if(powerOn==false) {//!powerOn
			
		}
		
		String str = "yes";
		if("yes".equals(str)) { //"yes".equalsIgnoreCase(str)
			
		}
		
		
	}
//	[4-1] ������ ������� ���ǽ����� ǥ���϶�.
//	1. int�� ���� x�� 10���� ũ�� 20���� ���� �� true�� ���ǽ�
//	2. char�� ���� ch�� �����̳� ���� �ƴ� �� true�� ���ǽ�
//	3. char�� ���� ch�� ��x' �Ǵ� ��X'�� �� true�� ���ǽ�
//	4. char�� ���� ch�� ����(��0��~��9��)�� �� true�� ���ǽ�
//	5. char�� ���� ch�� ������(�빮�� �Ǵ� �ҹ���)�� �� true�� ���ǽ�
//	6. int�� ���� year�� 400���� �����������ų� �Ǵ� 4�� ������������ 100���� ������������
//	���� �� true�� ���ǽ�
//	7. boolean�� ���� powerOn�� false�� �� true�� ���ǽ�
//	8. ���ڿ� �������� str�� ��yes���� �� true�� ���ǽ�
}
