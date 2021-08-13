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
		
		 Integer chaveProcura1 = 7;
		 Integer chaveProcura2 = 6; 
        if (hmap.containsKey( chaveProcura1) && hmap.containsKey(chaveProcura2)){
         System.out.println("Chave 1: \n" + chaveProcura1 +"\n"+ "Chave 2:\n"+"\n"+ chaveProcura2);
         System.out.println("Valor chave 1: \n" + hmap.get(chaveProcura1) +"\n Valor chave 2: \n"+ hmap.get(chaveProcura2) );
   
        }else{
               System.err.println("Chave n�o existe");
        }	
		
	}
}
