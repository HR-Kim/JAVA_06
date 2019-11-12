package kr.co.sist05.exam;

public class Ex10 {
//[4-10] int타입의 변수 num 이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를
//완성하라. 만일 변수 num의 값이 56789라면, ‘5+6+7+8+9’의 결과인 35를 출력하라. (1)
//에 알맞은 코드를 넣으시오.
//[주의] 문자열로 변환하지 말고 숫자로만 처리해야 한다.
	public static void main(String[] args) {
		int num = 56789;
		int sum = 0;
		// /, %연산 이용
		while(num>0) {
			sum+=num%10;//9,8..
			num=num/10;//5678,567
		}
		
		System.out.println("sum:"+sum);
		
		

	}

}
