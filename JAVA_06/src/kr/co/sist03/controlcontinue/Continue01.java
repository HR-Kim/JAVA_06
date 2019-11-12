package kr.co.sist03.controlcontinue;

public class Continue01 {
//continue	반복처리를 건너 뛴 다음, 블록의 시작위치로 돌아가서 다음 작업 진행							
//continue: 건너뛰기
	public static void main(String[] args) {
		//1~ 10 3의배수는 건너뛰기.
		//for
		//if(3의배수)continue
		for(int i=1;i<=10;i++) {
			if(i%3==0) {
				continue;
			}
			System.out.println(i);
		}//--for
		
		

	}

}
