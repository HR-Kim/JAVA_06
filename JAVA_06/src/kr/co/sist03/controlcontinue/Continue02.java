package kr.co.sist03.controlcontinue;

import java.util.Scanner;

public class Continue02 {
//메뉴를 보여 준다.
//(1) square : num*num
//(2) square root: Math.square(num)
//(3) log: Math.log(num)
//원하는 메뉴는 (1~3)을 선택하세요.(종료:0)
//메뉴:continue
//종료:break	
	public static void main(String[] args) {
		/** 메뉴 */
		int menu =0;
		/** 번호 */
		int num  =0;
		
		Scanner scanner=new Scanner(System.in);
		while(true) {  //for(;;)
			System.out.println("(1) square      ");
			System.out.println("(2) square root ");
			System.out.println("(3) log         ");
			System.out.println("원하는 메뉴는 (1~3)을 선택하세요.(종료:0)");			
			
			menu = scanner.nextInt();
			if(menu == 0) {
				System.out.println("프로그램을 종료 합니다.");
				break;
			}else if( !(1<=menu && menu<=3)) {
				System.out.println("메뉴를 잘못 선택했습니다.(종료:0)");
				continue;
			}
			
			System.out.println("선택한 메뉴는 "+menu+"번 입니다.");
			
		}//--while
		
		
	}//--main

}







