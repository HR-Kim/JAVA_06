package kr.co.sist05.exam;

public class Ex04 {
//1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오.
	public static void main(String[] args) {
    
		//1~ 10반복문
		
		int sum      =0;//누적
		int totalSum =0;//total누적
		for(int i=1;i<=10;i++) {
			sum+=i;
			totalSum+=sum;
		}
		System.out.println("totalSum:"+totalSum);

	}

}
