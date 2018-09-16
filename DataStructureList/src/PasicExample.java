import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PasicExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> row = new ArrayList<Integer>();
		
		Scanner input = new Scanner(System.in);
		
		int height = input.nextInt();
		
		row.add(1);
		
		if(height==1) {
//			System.out.print(String.format("%6d",row.get(0)));
		}
		else {
			
//			System.out.println(String.format("%12d",row.get(0)));
				for(int col = 1 ; col < 10 ; col++) {
					
					//列的次數  (欄要印的次數) = height (高)
					for(int i=1;i<col;i++) {

						row.add(row.get(i-1) * (col-i+1) / i);
//						
						
					}
					
					printRow(row,10-col);
					row.clear();
					row.add(0, 1);
				}

			
			
				
		}
		
		
	}
	
	public static void printRow(List<Integer>  row , int height) {
	
		for(int i=1;i<=height;i++) {
			System.out.print(" ");
		}
		for(int i=0;i<row.size();i++) {

			System.out.print(String.format("%d",row.get(i)));
		}
		System.out.print(String.format("%d",row.get(0)));
		System.out.println("");
	}
	
	
//	public static void createRow(List<Integer>  row , int height) {
//		
//		for(int i=1;i<=height;i++) {
//			
//			row.add(row.get(i-1) * (height-i+1) / i);
//			
//			
//		}
//		printRow(row);
//	}

}
