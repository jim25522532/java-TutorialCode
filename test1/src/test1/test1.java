package test1;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		float r = sc.nextFloat();
//		float pi = 3.14f;
//		System.out.println(r*r*pi);
//		char x,y;
//		x= sc.next().charAt(0);
//		y= sc.next().charAt(0);
//		System.out.println("x:"+(int)x); //轉int型態
//		System.out.println("y:"+(int)y);
//		int a =sc.nextInt();
//		int b= sc.nextInt();
//		if(a>b) {
//			System.out.println(a);
//		}
//		else {
//			System.out.println(b);
//		}
//		int flag=0;
//		for(int i=1;i<=a;i++) {
//			if(i!=1 && i!=a && a%i==0) {
//				flag =1;
//				System.out.println(i);//整除
//			}
//			
//		}
//		if(flag==0) {
//			System.out.println("此數值為質數");
//		}
		int year=sc.nextInt();
		if(year <=0) {
			System.out.println("年分要大於0");
		}
		else {
			int yearType=0;
			if(year%4==0 && year%100!=0 || year%400==0) {
				yearType=1;
			}
			else {
				yearType = 2;
			}
			switch(yearType) {
				case 1:System.out.println("閏年");break;
				case 2:System.out.println("平年");break;
				default:System.out.println("請輸入可辨識的數字");
			}
		}
	}

}
