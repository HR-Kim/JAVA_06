package kr.co.sist02.controlbreak;

public class Break01 {
//1���� ���������� ���� 100�̻��� �Ǵ� ���ڸ� ���ϼ���.
//break; �ش�Ǵ� ���� ���� ����.
	public static void main(String[] args) {
		/**��������*/
		int num = 0;
		
		/**��������*/
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




