package kr.co.sist05.exam;

public class Ex07 {
//[4-6] �� ���� �ֻ����� ������ ��, ���� ���� 6�� �Ǵ� ��� ����� ���� ����ϴ� ��
//�α׷��� �ۼ��Ͻÿ�.
//6==i+j;
//	
	public static void main(String[] args) {
		int k=0;
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=6;j++) {
				if(6==i+j) {
					k++;
					System.out.printf("%d+%d=%d\n",i,j,i+j);
				}
			}
		}
		System.out.println("����:"+k);

	}

}
