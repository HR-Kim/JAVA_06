package kr.co.sist04.controlnamedloop;

import java.util.Scanner;

public class NamedLoop02 {

	public static void main(String args[]) {
		/** �޴� */
		int menu =0;
		/** ��ȣ */
		int num  =0;
		
		Scanner scanner=new Scanner(System.in);
		
		outter:
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
			
			for(;;) {
				System.out.print("����� ���� �Է� �ϼ���.(�������:0,��ü ����:99)>");
				
				num = scanner.nextInt();
				if(0==num) {//�������:for(;;)
					break;
				}
				
				if(99==num) {//��ü����
					break outter;
				}
				//(1) square : num*num
				//(2) square root: Math.sqrt(num)
				//(3) log: Math.log(num)
				
				switch(menu) {
					case 1://(1) square : num*num
						System.out.println("result="+(num*num));
						break;
					case 2://quare root: Math.square(num)
						System.out.println("result="+Math.sqrt(num));
						break;	
						
					case 3:// Math.log(num)
						System.out.println("result="+Math.log(num));
						break;
						
						
				}//--switch
				
			}//--for
			
			
			//System.out.println("������ �޴��� "+menu+"�� �Դϴ�.");
			
		}//--while
		System.out.println("���α׷� ����!");
		
	}//--main

}
