package kr.co.sist04.controlnamedloop;

public class NamedLoop01 {

	public static void main(String[] args) {
		//for���� Loop01
		Loop01:for(int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				
				//if(j==5)break;//���� for�� break
				//if(j==5)break Loop01;//��ü for�� break
				//if(j==5)continue;//j==5�� �ǳʶٱ�
				
				if(j==5)continue Loop01;//���� for�� break
				System.out.printf("%d*%d=%2d\n",i,j,i*j);
			}//--for j
		}//--for i

	}

}
