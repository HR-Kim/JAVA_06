package kr.co.sist01.dowhile;

import java.util.Scanner;

public class DoWhile01 {
//�ּ� �ѹ��� ���� ����.
//do{
// ����	
//}while(����);
	
// 1~ 100���� :88
// 1~100���� ���߱�
	
// 1.���� �߻�
// 2.�����Է� 
//  2.1. ū�� ������ �Ǵ�.	
//  do{
//		if(����>�Է�){
//        �������� �Է� �ϼ���	
//      }else if(����<�Է�){
//	           ū���� �Է� �ϼ���	
//      }
//  }while(�Է�!=��������);	
	
	public static void main(String[] args) {
		int input = 0;
		int answer= 0;
//���� ����.		
//		for(int i=0;i<=1000;i++) {
//			answer = (int)(Math.random()*100)+1;
//			System.out.println(answer);
//			if(answer<0 || answer>=101) {
//				System.out.println("����");
//			}
//		}
		answer = (int)(Math.random()*100)+1;
		
		//System.out.println("answer:"+answer);
		do {
			System.out.print("1~100���� ������ �Է��ϼ���.>");
			Scanner scanner=new Scanner(System.in);
			input = scanner.nextInt();
			
			if(input>answer) {
				System.out.println("�� �������� �Է� �ϼ���.");
			}else if(input<answer) {
				System.out.println("�� ū���� �Է� �ϼ���.");
			}
			
		}while(input !=answer);	
		System.out.println("���� �Դϴ�.");
	}
//  do{
//		if(����>�Է�){
//        �������� �Է� �ϼ���	
//      }else if(����<�Է�){
//	           ū���� �Է� �ϼ���	
//      }
//  }while(�Է�!=��������);
}




