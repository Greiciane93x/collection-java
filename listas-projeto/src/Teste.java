
public class Teste {
	
	//Array
	public static void main(String[] args) {
		
		int idades [] = new int[5]; // inicializa o array com  0
		
//		idades[0] = 29; 
//		idades[1] = 39; 
//		idades[2] = 9; 
//		idades[3] = 19; 
//		idades[4] = 69; 
//	
//		
//		int idade4 = idades[4]; 
//		
//		System.out.println(idade4);
//		
//		System.out.println(idades.length);
		
		for(int i = 0; i < idades.length; i++) {
			idades[i] = i * i; 
		}
		
		for(int i = 0; i < idades.length; i++) {
			System.out.println(idades[i] = i * i);  
		}
		
		
	}

}
