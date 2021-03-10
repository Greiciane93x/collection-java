import java.util.HashMap;

public class HashMapTesting {

	public static void main(String[] args) {
		HashMap<Integer, String> hmap = new HashMap<Integer, String>(); 
		
		hmap.put(1 , "Aa"); 
		hmap.put(2, "Bb"); 
		hmap.put(3, "Cc"); 
		hmap.put(4, "Dd"); 
		hmap.put(5, "Ee"); 
		hmap.put(6, "Ff"); 
		hmap.put(7, "Gg"); 
		hmap.put(8, "Hh"); 
		hmap.put(9, "Ii"); 
		hmap.put(10, "Jj"); 
		
		System.out.println("HashMap tem: " + hmap +"\n\n");
		System.out.println("--------------------------------------------------------------------------");
		
		 Integer keyToSearch1 = 7;
		 Integer keyToSearch2 = 11;
		 Integer keyToSearch3 = 7;
        if (hmap.containsKey( keyToSearch1)){
         System.out.println("Chave 1: " +keyToSearch1+
          " = "+ hmap.get(keyToSearch1));
        }else if(hmap.containsKey(keyToSearch2)) {
        	  System.out.println("Chave 2: " +keyToSearch2+
         " = "+ hmap.get(keyToSearch2));
        }else if(hmap.containsKey(keyToSearch3)) {
      	  System.out.println("Chave 2: " +keyToSearch3+
          " = "+ hmap.get(keyToSearch3));
        }else{
               System.err.println("Chave não existe");
        }

		
		
	}
}
