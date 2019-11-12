package kr.co.sist05.exam;

import java.util.Scanner;

public class Ex02 {
//[4-2] �⵵�� ���� �Է� �޾� �� �޿� �ϼ� ���ϱ�.
//switch ~ case	
	public static void main(String[] args) {
		//1. ����� �Է� �޴´�.(ex)2019-11
		// 1.1. '-'�� ������ return;
		// 1.2. ��� ���� �и� �Ѵ�.		
		//2. switch(��){
		//     
		//   }
		//   2.1. 31->1,3,5,7,8,10,12
		//   2.2. 30->4,6,9,11
		//   2.3. 28/29 -> 2
		//3. �ش���� �ϼ��� ����Ѵ�.
		
		System.out.println("����� �Է� �޴´�.(ex)2019-11)>");
		Scanner scanner=new Scanner(System.in);
		String yearMonth = scanner.nextLine();
		
		if(yearMonth.indexOf("-")<0) {
			System.out.println("�Է������� Ȯ���ϼ���(ex)2019-11)");
			return;
		}
		
		String[] tmpYearMonth = yearMonth.split("-");
		
		String yearStr = tmpYearMonth[0];
		String monthStr = tmpYearMonth[1];
		System.out.println("yearStr:"+yearStr);
		System.out.println("monthStr:"+monthStr);
		
		int year  = Integer.parseInt(yearStr);
		int month = Integer.parseInt(monthStr);
		int day   = 0;//�ش� ����� �ϼ�
		//2019-2  : 28
		//2019-11 : 30
		//2019-12 : 31		
		//2120-2  : 29
		
		switch(month) {
		    //4,6,9,11
		    case 2:
		    	if(year%400==0 || (year%4==0 && year%100!=0)) {
		    		day = 29;
				}else {
					day = 28;
				}
		    	break;
			case 4:
			case 6:
			case 9:
			case 11:
				day = 30;
			    break;
			default://31->1,3,5,7,8,10,12
				day = 31;
				break;
				
		}//--switch
		System.out.printf("%d��%d��=%d",year,month,day);
		
	}
//1�� ���̰� �뷫 365.2422���̱� ������ 365�Ϸ� �ϰ� �뷫 4�⿡ �� ���� �Ϸ縦 ����ִ´�. �� �Ϸ�� 2�� 29���̴�. �׷��� �̷��� �ϸ� ��� 365.25���� �ǹǷ� 1�� ���̺��� ���.
//
//���� ������ ���� �ϴ�.
//
//1. 4�� ����� �ش� �������� �Ѵ�.
//2. �׷��� 100�� ����� �ش� ���⿡�� ����.
//3. �׷��� 400�� ����� �ش� ���� �������� �ִ´�.
}
