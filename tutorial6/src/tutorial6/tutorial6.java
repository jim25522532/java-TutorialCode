package tutorial6;

public class tutorial6 {
	public static void main(String[] args) {
		//�r��k�h�r���m��
		String text= "he\\llo world "; //���J�@��\
		System.out.println(text);
		text = "hello\tworld"; //���J�@��tab 
		System.out.println(text);
		text = "hello\b\btworld"; //���J�G�Ӫť�
		System.out.println(text);
		text = "hello\'tworld"; //���J�@�ӳ�޸�
		System.out.println(text);
		text = "hello'tworld"; //���J�@�ӳ�޸�
		System.out.println(text);
		text = "hello\"tworld"; //���J�@�����޸�
		System.out.println(text);
		//String��k����
		String ex1="�A�n��?";
		String ex2="�ګܦn";
		String ex3=ex1+ex2;
		System.out.println(ex3);
		
		//�P�_��Ӧr��O�_�۵� equals �P ==�Ϊk
		String ex4 = new String("123456");
		String ex5 = "123456";
		System.out.println(ex4);
		System.out.println(ex4.equals(ex5));
		System.out.println(ex4==ex5);
		//�j�p�g�ഫ
		String ex6="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(ex6.toLowerCase());
		String ex7="abcdefghijklmnopqrstuvwxyz";
		System.out.println(ex6.toUpperCase());
		System.out.println(reverseInt(1534236469));
		System.out.println(reverseInt(0));



		
		/**
		 * �d�Ҧr��P�Ʀr���A���m��
		 * ���g�@�Ө禡 �ǤJ�@��32bits��ƫ��A�Ʀr
		 * �N���Ʀr����æ^��
		 * ex:
		 * intput:123
		 * output:321
		 * intput:-123
		 * output:-321
		 */
		

	}
	public static int reverseInt(int x) {
		String reverTemp = "";
//		String reverInt = String.valueOf(x);
		String reverInt =  String.valueOf(x);
		if(x<0) {
			reverTemp="-";
			for(int i=reverInt.length()-1;i>0;i--) {
				reverTemp+=reverInt.charAt(i);
			}
		}
		else {
			for(int i=reverInt.length()-1;i>=0;i--) {
				reverTemp+=reverInt.charAt(i);
			}
		}

		
		return Integer.valueOf(reverTemp);
	}
	//���T��
//    public int reverse(int x) {
//        long k = x;
//        boolean isNegtive = false;        
//        if(k < 0){
//            k = 0 - k;
//            isNegtive = true;
//        }
//
//        long result = 0;
//        while(k != 0){
//            result *= 10;
//            result += k % 10;
//            k /= 10;
//        }
//
//        if(result > Integer.MAX_VALUE) return 0;
//        return isNegtive  ? 0 - ((int)result) : (int)result;
//    }
	//���j
	
}
