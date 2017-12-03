package leetcode;

public class InterisPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean x = isPalindrome(11);
		System.out.print(x);
	}
	public static boolean isPalindrome(int x) {
		if(x==0) {
			return true;
		}
		else if(x<0 || x%10 ==0) {
			return false;
		}

			int y=0;
			do {
	            if (y == x / 10 || y == x) {
	                return true;
	            }
	            y = y * 10 + x % 10;
	            x = x / 10;
	            System.out.println(x+"y"+y);
	        } while (x >= y);
			return false;
    }
}
