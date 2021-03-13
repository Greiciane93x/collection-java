import java.util.Hashtable;
import java.util.Vector;

public class TesteCollection {

	
	public static void main(String[] args) {
		
		int arr[] = new int[] {1,2,3,4 }; 
		Vector<Integer> v = new Vector(); 
		
		Hashtable<Integer, String> h = new Hashtable(); 
		
		v.addElement(1);
		v.addElement(2);
		
		h.put(1, "teste1"); 
		h.put(2, "teste2"); 
		
		System.out.println(arr[0]);
		System.out.println(v.elementAt(0));
		System.out.println(h.get(1));
		
	}
}
