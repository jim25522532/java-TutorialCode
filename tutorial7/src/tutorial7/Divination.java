package tutorial7;

public class Divination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 
		 * 兩光法師占卜
		 */
		int m=5;
		int d=6;
		int S=(m*2+d)%3;
		if(S==0) {
			System.out.println("普通");
		}
		else if(S==1) {
			System.out.println("吉");
		}
		else if(S==2) {
			System.out.println("大吉");
		}

	}

}
