package kr.co.sist05.exam;

import java.util.Scanner;

public class Ex02 {
//[4-2] 년도와 월을 입력 받아 그 달에 일수 구하기.
//switch ~ case	
	public static void main(String[] args) {
		//1. 년월을 입력 받는다.(ex)2019-11
		// 1.1. '-'가 없으면 return;
		// 1.2. 년과 월을 분리 한다.		
		//2. switch(월){
		//     
		//   }
		//   2.1. 31->1,3,5,7,8,10,12
		//   2.2. 30->4,6,9,11
		//   2.3. 28/29 -> 2
		//3. 해당월에 일수를 출력한다.
		
		System.out.println("년월을 입력 받는다.(ex)2019-11)>");
		Scanner scanner=new Scanner(System.in);
		String yearMonth = scanner.nextLine();
		
		if(yearMonth.indexOf("-")<0) {
			System.out.println("입력형식을 확인하세요(ex)2019-11)");
			return;
		}
		
		String[] tmpYearMonth = yearMonth.split("-");
		
		String yearStr = tmpYearMonth[0];
		String monthStr = tmpYearMonth[1];
		System.out.println("yearStr:"+yearStr);
		System.out.println("monthStr:"+monthStr);
		
		int year  = Integer.parseInt(yearStr);
		int month = Integer.parseInt(monthStr);
		int day   = 0;//해당 년월에 일수
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
		System.out.printf("%d년%d월=%d",year,month,day);
		
	}
//1년 길이가 대략 365.2422일이기 때문에 365일로 하고 대략 4년에 한 번씩 하루를 집어넣는다. 그 하루는 2월 29일이다. 그러나 이렇게 하면 평균 365.25일이 되므로 1년 길이보다 길다.
//
//따라서 다음과 같이 하다.
//
//1. 4의 배수인 해는 윤년으로 한다.
//2. 그러나 100의 배수인 해는 윤년에서 뺀다.
//3. 그러나 400의 배수인 해는 도로 윤년으로 넣는다.
}
