import java.util.Scanner;

/**
 * �D�̤j���]�ƻP
 * �̤p������
 * @author chengHai
 *
 */
public class Gcd {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter two integers
		System.out.print("��J��Ӽƭ�: ");
		int m = input.nextInt();
		int n = input.nextInt();

		// Calucate and display the GCD
		System.out.println(m+"�P"+n+"���̤j���]�Ƭ�"+gcd(m,n));

	}
	
	/** Method for computing GCD */
	public static int gcd(int m, int n) {
		System.out.println("m:"+m);
		System.out.println("n:"+n);
		if (m % n == 0)
			return n; // ��m,n�洫 �۰��l�Ƭ�0�� n���̤j���]��
		else //���j
			return gcd(n, m % n);
	}
	

}
