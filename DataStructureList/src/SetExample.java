import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
	public static void main(String [] args) {
		int count[] = {34, 22,10,60,30,22};
	      Set<Integer> set = new HashSet<Integer>();
	      try {
	         for(int i = 0; i < 5; i++) {
	            set.add(count[i]);
	         }
	         System.out.println(set);

	         TreeSet sortedSet = new TreeSet<Integer>(set);
	         System.out.println("TreeSet 內容:");
	         System.out.println(sortedSet);

	         System.out.println("第一個元素在 sortedSet為: "+ (Integer)sortedSet.first());
	         System.out.println("最後一個元素為: "+ (Integer)sortedSet.last());
	      }
	      
	      catch(Exception e) {
	    	  
	      }
	   
	      
	}
}
