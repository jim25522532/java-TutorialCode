import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> wife = new ArrayList<String>();
	      wife.add("老婆");
	      wife.add("小三");
	      wife.add("小四");     
	      
	      
	      System.out.println(" ArrayList 元素");
	      System.out.println("\t" + wife);

	      System.out.println(wife.get(1)); //小三
	      System.out.println(wife.remove(1)); //小三
	      System.out.println(wife.get(1)); //小四
	      wife.add("小三");
	      wife.add("小四");   
	      
	      for (String text : wife) {
				System.out.print(text+"\t");
		  }
	
	
	      List<String> guy = new LinkedList<String>();
	      guy.add("老公");
	      guy.add("老王");
	      guy.add("隔壁老陳");
	      System.out.println();
	      System.out.println(" LinkedList 元素");
	      System.out.println("\t" + guy);
	      
	      
	      List<List<String>> car = new ArrayList<List<String>>();
	      
	      car.add(new ArrayList<String>());
	      car.get(0).add("Benz");
	      car.add(new ArrayList<String>());
	      car.get(1).add("Benz");
	      car.add(new ArrayList<String>());
	      System.out.println(car);
	      System.out.println(car.size());
	      System.out.println(car.get(0).size());
	}

}
