package tutorial7;

public class maxOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=18467,b=41,n=10,q,r;
		
		
	    int [] arr = new int[100]; //�i�H�s100�ӼƦb�}�C�Ŷ�
	    //q,r���Ȧs�ഫ���ܼƨϥ� ��]:�n�ѧO
    	q=a/b; //�Ĥ@�����N������Ӽƨ��X��
        r=a%b; //�ѤU�����ɪ��n�B�z���p���I����
        System.out.println(r);
		for(int i=0;i<n;i++) {
			arr[i] =(r*10)/b; //�ڭn���C���B�⪺�Ӽ� ex:�Ĥ@�ӼƭȦs17
			r=(r*10)%b;       //�N17*10�b��41���l�� �� �N���~��B��p���I�ĤG�Ӽƭ�
		}
		System.out.println(q); //q���p���I�e���Ӽ�
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		
	}

}
