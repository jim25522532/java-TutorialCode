package tutorial7;

import java.util.Scanner;

public class mosPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		int total = sc.nextInt();
		String text[] = new  String[total]; //total要大於1
		for(int i=0;i<total;i++) {
			//每列輸入一組字串
			text[i] = sc.nextLine();; //輸入到字串中切勿使用nextLine		
		}

//		System.out.println(text.length); //total = 5 輸出5
		
		//5列 把text陣列長度找出
		//幾列 做幾次
		for(int i=1;i<text.length;i++)
		{
			//分割字串 空白字元
			String[] textSplit = text[i].split(" "); //空白分隔
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
