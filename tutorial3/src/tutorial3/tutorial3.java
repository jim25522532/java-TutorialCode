package tutorial3;

import java.util.Scanner;

public class tutorial3 {
	public static void main(String[] args) {
		//if敘述
		int a=5,b=4;
		if(true) {
			System.out.println("我進來囉");//當()內的表達是成真,則會進入if敘述內
		}
		//當if中間有表達式
		if(a>b) {
			System.out.println("a>b的判斷成立會得到true的結果");
			//a>b的結果成立會得到true的結果,後進入if敘述
		}
		//邏輯運算子結合
		if(a>b && a>6) {
			System.out.println("a>b 且 a要大於6才會進來"); //&&為當兩邊運算式結果要成真
		}
		else {
			System.out.println("當if條件不成立,則會做else內的敘述");//我是else
		}
		
		Scanner sc= new Scanner(System.in);
//		int year = sc.nextInt();
		//判斷是否為閏年
//		if(year%4==0 && year%100!=0 || year%400==0) {
//			System.out.println("閏年");
//		}
//		else {
//			System.out.println("平年");
//		}
		int score = sc.nextInt();
		switch(score/10){
			case 10:
				System.out.println("S");
			case 9:
				System.out.println("S");
				break;
			case 8:
				System.out.println("A");
				break;
			case 7:
				System.out.println("B");
				break;
			case 6:
				System.out.println("C");
				break;
			default:
				System.out.println("不及格");
				break;
		}
	}
}
