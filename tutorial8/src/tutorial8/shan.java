package tutorial8;

public class shan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr= new int[3][2];
		arr[0][0]=3;
		arr[0][1]=6;
		arr[1][0]=2;
		arr[1][1]=5;
		arr[2][0]=1;
		arr[2][1]=4;
		//���פ��P�����|�ܦ��e��>���פ����arr�}�C�h�������^�ǭ�
		int [][] shanAfter = new int[2][3];
		shanAfter = shan(arr);
		for(int i=0;i<=1;i++) {
			for(int j=0;j<=2;j++) {
				System.out.println(shanAfter[i][j]);
			}
		}
	}
	public static int[][] shan(int[][] shanArr) {
		int [][] shanAfter = new int[2][3];
		//�p������ת�����?
		//���}�C����shanArr.length �|�o��3

		//����ᰪ�׳]�w����
		for(int j=0;j<=shanAfter.length;j++) {
			//�o��n�������e�צ��X�ӳ]�w
			for(int i=0;i<shanArr.length-1;i++) {
				//�k��O�쥻����		
				shanAfter[i][shanAfter.length-j] = shanArr[j][i];//�N����ƭȰ��洫		
			}

		}
		return shanAfter;
	}

}
