package tutorial7;

import java.util.Scanner;

public class Factor {

	public static void main(String[] args) {
		Scanner N = new Scanner(System.in);
		System.out.println("請輸入正整數");
		int n = N.nextInt();
		        int k = 2;
		      //從k開始除
		        int count =0 ; //計數
		        System.out.printf("%d因式分解為 : ",n);
		        if(n<=1)
		        System.out.printf("%S","此數沒因數");
		        else if(n == 2)
		        System.out.print("1*2");
		        else{  //數字為2以上開始做分解
		do{
		if(n%k == 0){
		while(n%k == 0){
		n/=k;
		count++;//為平方計數
		}
		if(count == 1)  //平方為1,不用^
		System.out.print(k+"*");
		else
		System.out.print(k+"^"+count+"*");
		count=0; }
		   else //不能整除則,除數k在加1
		            k++;
		}while(k < n);
		System.out.print(n);//最後分解完的值
		}
		
	}

}
