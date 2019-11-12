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
//1년 길이가 대략 365.2422일이기 때문에 365일로 하고 대략 4년에 한 번씩 하루를 집어넣는다. 그 하루는 2월 29일이다. 그러나 이렇게 하면 평균 365.25일이 되므로 1년 길이보다 길다.
//
//따라서 다음과 같이 하다.
//
//1. 4의 배수인 해는 윤년으로 한다.
//2. 그러나 100의 배수인 해는 윤년에서 뺀다.
//3. 그러나 400의 배수인 해는 도로 윤년으로 넣는다.
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
//	[4-1] 다음의 문장들을 조건식으로 표현하라.
//	1. int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식
//	2. char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식
//	3. char형 변수 ch가 ‘x' 또는 ’X'일 때 true인 조건식
//	4. char형 변수 ch가 숫자(‘0’~‘9’)일 때 true인 조건식
//	5. char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식
//	6. int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로 나눠떨어지지
//	않을 때 true인 조건식
//	7. boolean형 변수 powerOn가 false일 때 true인 조건식
//	8. 문자열 참조변수 str이 “yes”일 때 true인 조건식
}
