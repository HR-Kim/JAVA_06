package kr.co.sist03.controlcontinue;

public class Continue01 {
//continue	�ݺ�ó���� �ǳ� �� ����, ����� ������ġ�� ���ư��� ���� �۾� ����							
//continue: �ǳʶٱ�
	public static void main(String[] args) {
		//1~ 10 3�ǹ���� �ǳʶٱ�.
		//for
		//if(3�ǹ��)continue
		for(int i=1;i<=10;i++) {
			if(i%3==0) {
				continue;
			}
			System.out.println(i);
		}//--for
		
		

	}

}
