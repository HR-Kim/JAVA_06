package kr.co.sist02.controlbreak;

public class Break01 {
//1부터 순차적으로 더해 100이상이 되는 숫자를 구하세요.
//break; 해당되는 블럭을 벗어 나라.
	public static void main(String[] args) {
		/**증가변수*/
		int num = 0;
		
		/**누적변수*/
		int sum = 0;
		
		while(true) {
			if(sum>100) {
				break;
			}
			
			++num;
			sum+=num;
			//System.out.printf("num=%d \t sum=%d\n",num,sum);
		}//--while

		System.out.printf("num=%d \t sum=%d",num,sum);
	}

}




