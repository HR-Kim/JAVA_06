package kr.co.sist05.exam;

public class Ex03 {
//[4-2-1] 1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오.
	public static void main(String[] args) {
	    //1. 1부터 20까지의 정수
		//2. 2 또는 3의 배수가 아닌 수 총합
		int sum = 0;//누적변수
		
		for(int i=1;i<=20;i++) {
			//(i%2!=0 && i%3!=0)
			if( !(i%2==0 || i%3==0)) { 
				sum+=i;
			}
		}
		
		System.out.println("sum="+sum);
		//sum=73
		
	}

}
