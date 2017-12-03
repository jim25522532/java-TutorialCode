package tutorial7;

import java.util.Scanner;

public class mosPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		String text[] = new  String[total];
		for(int i=0;i<total;i++) {
			text[i] = sc.nextLine();
			System.out.println(text[i]);
		}

		for(int i=0;i<text.length;i++)
		{
			String[] textSplit = text[i].split(" ");
			System.out.println(text[i]+"i");
			for(int j=0;j<textSplit.length;j++) {
				System.out.println(textSplit[j]);
				switch(textSplit[j]){
					case ".-":System.out.println("A");break;
					case "-...":System.out.println("B");break;
					case "-.-.":System.out.println("C");break;
					case "-..":System.out.println("D");break;
					case ".":System.out.println("E");break;
					case "..-.":System.out.println("F");break;
					case "--.":System.out.println("G");break;
					case "....":System.out.println("H");break;
					case "..":System.out.println("I");break;
					case ".---":System.out.println("J");break;
					case "-.-":System.out.println("K");break;
					case "...":System.out.println("S");break;
					case "---":System.out.println("O");break;
				/**
				 * 剩下的要怎麼做?
				 * 請試著做看看
				 */
				}
			}
		}
	}

}
