import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> wife = new ArrayList<String>();
	      wife.add("�ѱC");
	      wife.add("�p�T");
	      wife.add("�p�|");     
	      
	      
	      System.out.println(" ArrayList ����");
	      System.out.println("\t" + wife);

	      System.out.println(wife.get(1)); //�p�T
	      System.out.println(wife.remove(1)); //�p�T
	      System.out.println(wife.get(1)); //�p�|
	      wife.add("�p�T");
	      wife.add("�p�|");   
	      
	      for (String text : wife) {
				System.out.print(text+"\t");
		  }
	
	
	      List<String> guy = new LinkedList<String>();
	      guy.add("�Ѥ�");
	      guy.add("�Ѥ�");
	      guy.add("�j���ѳ�");
	      System.out.println();
	      System.out.println(" LinkedList ����");
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
