package tutorial8;



public class tutorial8 {
	static int year = 10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(year); //�o�̷|��ܦbclass���ŧi��year�ƭ�
		year = countYear();
		System.out.println(year);
	}
	public static int countYear(){
		System.out.println(year); //�o��O���tutorial8���O���ŧi��year�ܼ�
		int year = 20; //�b�o�䭫�s�ŧi�F�@���ܼƦW�٤@�ˬ�year�B�ƭȬ�20
		return year;
	}
}
