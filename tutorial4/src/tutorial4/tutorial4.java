package tutorial4;

import java.util.Scanner;

public class tutorial4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int a= sc.nextInt();
//		int b= sc.nextInt();
//		System.out.println(add(a,b));
//		System.out.println(Sub(a,b));
//		System.out.println(muti(a,b));
//		System.out.println("qeqe\rqeq\fqewq");
//		String text="aaaacccccdddd";

//		System.out.println(text.replace('a', 'b'));

//		for(int i=0;i<text.length();i++) {
//			System.out.println(text.charAt(i));
//		}
//		System.out.println((text+text2));

//		int [] maze = new int[10];
		int [] maze = {11,22,33,44,55};
//		for(int i=0;i<maze.length;i++) {
//			maze[i] = sc.nextInt();
//		}
		printArray(maze);
//		getMaxValue(maze);
	}
	//�ۥ[��k
	public static int add(int x,int y) {
		return x+y;
	}
	//�۴��k
	public static int Sub(int x,int y) {
		return x-y;
	}
	//��*��k
	public static int muti(int x,int y) {
		return x*y;
	}
	//���誺��k
	public static int plus(int x) {
		return x*x;
	}
	//�N�r���ܦ��j�g
	public static String changeToUpcase(String text) {
		text = text.toUpperCase();
		return text;
	}
	//���^�Ǫ���k
	public static void echo(String text) {
		System.out.println(text);
	}
	//���^�Ǫ���k
	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	//�@�Ӥ��^�ǧ�X�}�C�����̤j�ƭ�
	public static void getMaxValue(int[] arr) {
		int temp=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>temp) {
				temp=arr[i];
				
			}
		}
		System.out.println("�̤j��:"+temp);
	}
}
