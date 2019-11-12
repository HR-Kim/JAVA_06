package kr.co.sist05.exam;

public class Ex05 {
//[4-4] 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이
//	100이상이 되는지 구하시오.
	public static void main(String[] args) {
		//1.반복문은 무한 Loop
		// 1.1. if(sum>=100)break;
		// int s =1;//-1,1-1....
		int sum = 0;//총합
		int num = 0;//i*s
		int s   = 1;////-1,1-1,1...

		for(int i=1;true;i++,s=-s) {
			num  = i * s;
			sum +=num;
			
			if(sum>=100) {//sum 100보다 같거나 크면 반목문을 빠져나간다.
				break;
			}
			System.out.printf("s=%2d,num=%4d, sum=%4d \n",s,num,sum);
		}
		
		System.out.println("num:"+num);
		System.out.println("sum:"+sum);
		
		
	}

}
