package tutorial7;

import java.util.Scanner;

public class mosPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		int total = sc.nextInt();
		String text[] = new  String[total]; //total�n�j��1
		for(int i=0;i<total;i++) {
			//�C�C��J�@�զr��
			text[i] = sc.nextLine();; //��J��r�ꤤ���Ũϥ�nextLine		
		}

//		System.out.println(text.length); //total = 5 ��X5
		
		//5�C ��text�}�C���ק�X
		//�X�C ���X��
		for(int i=1;i<text.length;i++)
		{
			//���Φr�� �ťզr��
			String[] textSplit = text[i].split(" "); //�ťդ��j
			System.out.print("\n");
			for(int j=0;j<textSplit.length;j++) {

//				System.out.println("textSplit"+textSplit[j]);
				switch(textSplit[j]){
					case ".-":System.out.print("A");break;
					case "-...":System.out.print("B");break;
					case "-.-.":System.out.print("C");break;
					case "-..":System.out.print("D");break;
					case ".":System.out.print("E");break;
					case "..-.":System.out.print("F");break;
					case "--.":System.out.print("G");break;
					case "....":System.out.print("H");break;
					case "..":System.out.print("I");break;
					case ".---":System.out.print("J");break;
					case "-.-":System.out.print("K");break;
					case ".-..":System.out.print("L");break;
					case "--":System.out.print("M");break;
					case "-.":System.out.print("N");break;
					case "---":System.out.print("O");break;
					case ".--.":System.out.print("P");break;
					case "--.-":System.out.print("Q");break;
					case ".-.":System.out.print("R");break;
					case "...":System.out.print("S");break;
					case "-":System.out.print("T");break;
					case "..-":System.out.print("U");break;
					case "...-":System.out.print("V");break;
					case ".--":System.out.print("W");break;
					case "-..-":System.out.print("X");break;
					case "-.--":System.out.print("Y");break;
					case "--..":System.out.print("Z");break;
		
				}

			}
		}
	}

}
