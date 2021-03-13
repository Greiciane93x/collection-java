# collection-java
backup 


Para criar um objeto do tipo ArrayList, utilizando o operador new. 
Ao declarar a referência a uma ArrayList, passamos também o tipo de objeto 
com a qual ela trabalhará.

Exemplo: ArrarList<String> nomes = new ArrayList<>();

String primeiroNome = "Assis"; 
String segundoNome = "Ane"; 
String terceiroNOme = "Greici"; 

**para adicionar itens nessa lista, fazemos assim:**

nomes.add(primeiroNome); 
nomes.add(segundoNome); 
nomes.add(terceiroNome); 

**para remover itens nessa lista:** 

nomes.remove(0); 

Para percorrer a lista, fazemos: 

for(String nome : nomes){
    System.out.println("Nome:", + nome); 
  
}

