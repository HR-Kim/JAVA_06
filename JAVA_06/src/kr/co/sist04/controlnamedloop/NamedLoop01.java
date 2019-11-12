package kr.co.sist04.controlnamedloop;

public class NamedLoop01 {

	public static void main(String[] args) {
		//for문에 Loop01
		Loop01:for(int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				
				//if(j==5)break;//안쪽 for문 break
				//if(j==5)break Loop01;//전체 for문 break
				//if(j==5)continue;//j==5만 건너뛰기
				
				if(j==5)continue Loop01;//안쪽 for문 break
				System.out.printf("%d*%d=%2d\n",i,j,i*j);
			}//--for j
		}//--for i

	}

}
