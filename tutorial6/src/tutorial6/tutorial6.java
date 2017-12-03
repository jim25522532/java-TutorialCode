package tutorial6;

public class tutorial6 {
	public static void main(String[] args) {
		//字串逃逸字元練習
		String text= "he\\llo world "; //插入一個\
		System.out.println(text);
		text = "hello\tworld"; //插入一個tab 
		System.out.println(text);
		text = "hello\b\btworld"; //插入二個空白
		System.out.println(text);
		text = "hello\'tworld"; //插入一個單引號
		System.out.println(text);
		text = "hello'tworld"; //插入一個單引號
		System.out.println(text);
		text = "hello\"tworld"; //插入一個雙引號
		System.out.println(text);
		//String方法介紹
		String ex1="你好嗎?";
		String ex2="我很好";
		String ex3=ex1+ex2;
		System.out.println(ex3);
		
		//判斷兩個字串是否相等 equals 與 ==用法
		String ex4 = new String("123456");
		String ex5 = "123456";
		System.out.println(ex4);
		System.out.println(ex4.equals(ex5));
		System.out.println(ex4==ex5);
		//大小寫轉換
		String ex6="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(ex6.toLowerCase());
		String ex7="abcdefghijklmnopqrstuvwxyz";
		System.out.println(ex6.toUpperCase());
		System.out.println(reverseInt(1534236469));
		System.out.println(reverseInt(0));



		
		/**
		 * 範例字串與數字型態的練習
		 * 撰寫一個函式 傳入一個32bits整數型態數字
		 * 將此數字反轉並回傳
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
	//正確解
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
	//遞迴
	
}
