import java.util.ArrayList;
import java.util.Collections;

public class TesteLista {

	public static void main(String[] args) {
		String nome1 = "Greiciane"; 
		String nome2 = "Bruno"; 
		String nome3 = "Alice"; 
		
		ArrayList<String> nomes = new ArrayList<>(); 
		
		nomes.add(nome1); 
		nomes.add(nome2); 
		nomes.add(nome3); 
		
		Collections.sort(nomes);
		
		
		System.out.println(nomes);
		
		//nomes.remove(0); 
		
		System.out.println(nomes);
		
		for(String nome : nomes) {
			System.out.println("Nomes:  \n"+ nome);
		}
		
		String primeiroNome = nomes.get(0); 
		
		System.out.println("O primeiro nome é: " + primeiroNome);
		
		for(int i = 0; i < nomes.size(); i++) {
			System.out.println("nome: " + nomes.get(i));
		}
		
		nomes.forEach(nome -> {
			System.out.println("-----------------");
			System.out.println("Nomes: " + nome);
		});
		
		
	}
}
