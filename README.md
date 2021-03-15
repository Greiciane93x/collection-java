# Collection em Java
__backup __


Para criar um objeto do tipo ArrayList, utilizando o operador new. 
Ao declarar a referência a uma ArrayList, passamos também o tipo de objeto 
com a qual ela trabalhará. <br/> 

Exemplo: ArrarList<String> nomes = new ArrayList<>(); <br/> 

>>String primeiroNome = "Assis";<br/> 
>>String segundoNome = "Ane"; <br/> 
>>String terceiroNOme = "Greici"; <br/> 

**para adicionar itens nessa lista, fazemos assim:** <br/> 

>>nomes.add(primeiroNome); <br/> 
>>nomes.add(segundoNome); <br/> 
>>nomes.add(terceiroNome); <br/> 

**para remover itens nessa lista:** <br/> 

>>nomes.remove(0); <br/> 

Para percorrer a lista, fazemos: <br /> 

>>for(String nome : nomes){ <br/> 
>>    System.out.println("Nome:", + nome);  <br/> 
  
>>} <br/> 

**Para acessar elementos específicos, podemos utilizar:** <br/> 
>>String nome = nomes.get(0); <br/> 


**Para percorrermos uma lista completa, precisamos saber quantos elementos
temos nessa lista.**  <br/> 

>>for(int i =0; i < nomes.size(); i++){ <br/> 
>>    nomes.get(1); <br/> 
>>} <br/> 


**No Java 8, podemos percorrer assim:** <br/> 
>>nomes.forEach(nome -> { <br/> 
>>    System.out.printn(nome);  <br/> 
>>})
