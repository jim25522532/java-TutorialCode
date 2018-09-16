import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;

public class Main {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		 FileInputStream in = null;
	      FileOutputStream out = null;

	      try {
	    	  FileReader fr=new FileReader("SomeText.txt");
	    	  BufferedReader br=new BufferedReader(fr);
	          String line;
	          
	         while ((line=br.readLine()) != null) {
	             System.out.print(line=br.readLine()+"\n");
	     	 }
	        
	   

	      }
	      
	      catch(Exception ex) {
	    	  System.out.println(ex);
	    	  
	      }
	
	
	}

}
