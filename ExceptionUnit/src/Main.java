import java.io.File;
import java.io.FileReader;

public class Main {

	public static void main(String[] args) {
		int num[] = {1, 2, 3, 4};
		try {
			System.out.println(num[5]); //ArrayIndexOutOfBoundsExceptionexception
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
        
		
		String text = null;
		
		try {
			System.out.println(text.length());
		}
		catch(Exception ex) {
			System.out.println(ex); //NullPointerException
		}
		
		 File file = new File("E://file.txt");
		 try {
			 FileReader fr = new FileReader(file); 
		 }
		 catch(Exception ex) {
			 System.out.println(ex); //FileNotFoundException:
		 }
		 
	
	}
	
	public void testMethod() {
		
	}

}
