import java.util.HashSet;

public class HashTesting {

	
	public static void main(String[] args) {

		HashSet<String> h = new HashSet<String>();
		h.add("elefante");
		h.add("macaco"); 
		h.add("cachorro");
		h.add("gato"); 
		
		System.out.println(h.size());
		System.out.println("-------------------------");
		System.out.println(h);

		h.remove("elefante");
		
		System.out.println("-------------------------");
		System.out.println(h);
		System.out.println("-------------------------");
		
		System.out.println(h.size());

		
		
		
	}
}
