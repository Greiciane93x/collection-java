# Collections em Java

__Contém as principais funcionalidades para se trabalhar com conjunto de elementos (coleções).__<br/> 


Para criar um objeto do tipo ArrayList, utilizando o operador new. 
Ao declarar a referência a uma ArrayList, passamos também o tipo de objeto 
com a qual ela trabalhará. <br/> 

Exemplo: ArrarList<String> nomes = new ArrayList<>(); <br/> 

>>String primeiroNome = "Assis";<br/> 
>>String segundoNome = "Ane"; <br/> 
>>String terceiroNome = "Greici"; <br/> 

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
>>


**Array** <br/> 
-- É uma estrutura de dados e serve para guardar elementos(valores primitivos ou referências)<br/> 
-- Usam colchetes <br/> 
-- Tem um tamanho fixo <br/> 
-- Também é um objeto <br/> 
-- São zero-based(o primeiro elemento se encontra na posição 0) <br/> 
-- É sempre inicializado com valores padrões <br/> 
-- Ao acessar uma posição inválida recebemos a exceção _ArrayIndexOutOfBoundException_ <br/> 
-- Possuem o atributo length para saber o tamanho <br/> 

**Acesso aos arrays** <br/> 

>>int[] idades = new int[5]; <br/>  
>>idades[0] = 29; <br/> 
>>idades[1] = 39; <br/> 
>>idades[2] = 49; <br/> 
>>idades[3] = 59; <br/> 
>>idades[4] = 69; <br/> 

**Arrays de referência** <br/> 
>>ContaCorrente[] conta = new ContaCorrente[5]; <br/> 

>>ContaCorrente cc1 = new ContaCorrente(22, 11);<br/> 
>>ContaCorrente cc2 = new ContaCorrente(22, 22);<br/> 
>>contas[0] = cc1;<br/> 
>>contas[1] = cc2;<br/> 

# Injeção de dependência <br/>  
- https://medium.com/@silvioper/inje%C3%A7%C3%A3o-de-depend%C3%AAncias-e-invers%C3%A3o-de-controle-com-exemplos-aa95f41c9f11 <br/> 
"Com o uso dessas técnicas de Injeção de Dependências, conseguimos realizar a Inversão de Controle <br/> 
e nos beneficiamos pois, com este desacoplamento, podemos reutilizar nosso código e também <br/> 
fica extremamente fácil a escrita de testes automatizados pois podemos criar mocks destas <br/> 
dependências e testar seus clients em situações controladas sem efeitos colaterais por <br/> 
comportamentos inesperados." 

Autoboxing e Unboxing 

int[] idades = new int[5];  //arrays primitivos 
String[] nomes = new String[5];  //arrays de referência 

int idade = 29; 
//Integer -- transforma o primitivo em objeto, e essa transformação se chama autoboxing
Integer idadeRef = new Integer(29);
List<Integer> numeros = new ArrayList<Integer>();  
List numeros = new ArrayList(); 
numeros.add(idadeRef); 


# Autoboxing e Unboxing <br/> 

int[] idades = new int[5];  //arrays primitivos <br/> 
String[] nomes = new String[5];  //arrays de referência <br/>  

int idade = 29; <br/> 
_//Integer -- transforma o primitivo em objeto, e essa transformação se chama autoboxing _ <br/> 
Integer idadeRef = new Integer(29); <br/> 
List<Integer> numeros = new ArrayList<Integer>(); <br/> 
List numeros = new ArrayList(); <br/> 
numeros.add(idadeRef); <br/> 



//Unboxing <br/> 
Integer idadeRef = Integer.valueOf(29); <br/> 
//Autoboxing <br/> 
int valor = idadeRef.intValue();  <br/> 
<hr/> 

_Comparator.class_ <br/> 

# Ordenando listas <br/> 
public static void main(String[] args){<br/> 
  Conta cc1 = new ContaCorrente(22,33); <br/> 
  cc1.deposita(333.0); <br/> 
  
  Conta cc2 = new ContaPoupanca(22,44); <br/> 
  cc2.deposita(444.0); <br/> 
  
  Conta cc3 = new ContaCorrente(22,11); <br/> 
  cc1.deposita(111.0); <br/> 
  
  Conta cc4 = new ContaPoupanca(22,22); <br/> 
  cc1.deposita(222.0); <br/> 
  
  List<Conta> lista = new ArrayList<>(); <br/>
  lista.add(cc1); <br/> 
  lista.add(cc2); <br/> 
  lista.add(cc3); <br/> 
  lista.add(cc4); <br/> 
  
  lista.sort(); <br/> 
  
  _NaoSeiainda.class_ implements Comparator<Conta{<br/> 
    @Override <br/> 
    public int compare(Conta c1, Conta c2){ <br/> 
    
      return 0; <br/> 
      }<br/> 
    
    }> <br/> 
  
  
  
  
 
 
  
  

}


