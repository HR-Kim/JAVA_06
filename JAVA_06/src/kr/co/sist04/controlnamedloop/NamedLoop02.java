package kr.co.sist04.controlnamedloop;

import java.util.Scanner;

public class NamedLoop02 {

	public static void main(String args[]) {
		/** 메뉴 */
		int menu =0;
		/** 번호 */
		int num  =0;
		
		Scanner scanner=new Scanner(System.in);
		
		outter:
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
			
			for(;;) {
				System.out.print("계산할 값을 입력 하세요.(계산종료:0,전체 종료:99)>");
				
				num = scanner.nextInt();
				if(0==num) {//계산종료:for(;;)
					break;
				}
				
				if(99==num) {//전체종료
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
			
			
			//System.out.println("선택한 메뉴는 "+menu+"번 입니다.");
			
		}//--while
		System.out.println("프로그램 종료!");
		
	}//--main

}
