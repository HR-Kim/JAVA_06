package kr.co.sist03.controlcontinue;

import java.util.Scanner;

public class Continue02 {
//�޴��� ���� �ش�.
//(1) square : num*num
//(2) square root: Math.square(num)
//(3) log: Math.log(num)
//���ϴ� �޴��� (1~3)�� �����ϼ���.(����:0)
//�޴�:continue
//����:break	
	public static void main(String[] args) {
		/** �޴� */
		int menu =0;
		/** ��ȣ */
		int num  =0;
		
		Scanner scanner=new Scanner(System.in);
		while(true) {  //for(;;)
			System.out.println("(1) square      ");
			System.out.println("(2) square root ");
			System.out.println("(3) log         ");
			System.out.println("���ϴ� �޴��� (1~3)�� �����ϼ���.(����:0)");			
			
			menu = scanner.nextInt();
			if(menu == 0) {
				System.out.println("���α׷��� ���� �մϴ�.");
				break;
			}else if( !(1<=menu && menu<=3)) {
				System.out.println("�޴��� �߸� �����߽��ϴ�.(����:0)");
				continue;
			}
			
			System.out.println("������ �޴��� "+menu+"�� �Դϴ�.");
			
		}//--while
		
		
	}//--main

}







