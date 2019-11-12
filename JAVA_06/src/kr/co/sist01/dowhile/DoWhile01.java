package kr.co.sist01.dowhile;

import java.util.Scanner;

public class DoWhile01 {
//최소 한번의 수행 보장.
//do{
// 문장	
//}while(조건);
	
// 1~ 100난수 :88
// 1~100숫자 맞추기
	
// 1.난수 발생
// 2.숫자입력 
//  2.1. 큰지 작은지 판단.	
//  do{
//		if(난수>입력){
//        작은수로 입력 하세요	
//      }else if(난수<입력){
//	           큰수로 입력 하세요	
//      }
//  }while(입력!=난수숫자);	
	
	public static void main(String[] args) {
		int input = 0;
		int answer= 0;
//난수 검증.		
//		for(int i=0;i<=1000;i++) {
//			answer = (int)(Math.random()*100)+1;
//			System.out.println(answer);
//			if(answer<0 || answer>=101) {
//				System.out.println("오류");
//			}
//		}
		answer = (int)(Math.random()*100)+1;
		
		//System.out.println("answer:"+answer);
		do {
			System.out.print("1~100사이 정수를 입력하세요.>");
			Scanner scanner=new Scanner(System.in);
			input = scanner.nextInt();
			
			if(input>answer) {
				System.out.println("더 작은수를 입력 하세요.");
			}else if(input<answer) {
				System.out.println("더 큰수를 입력 하세요.");
			}
			
		}while(input !=answer);	
		System.out.println("정답 입니다.");
	}
//  do{
//		if(난수>입력){
//        작은수로 입력 하세요	
//      }else if(난수<입력){
//	           큰수로 입력 하세요	
//      }
//  }while(입력!=난수숫자);
}




