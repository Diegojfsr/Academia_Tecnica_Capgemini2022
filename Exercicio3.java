// Questão 03
// Duas palavras podem ser consideradas anagramas de si mesmas se as letras de uma palavra
// podem ser realocadas para formar a outra palavra. Dada uma string qualquer, desenvolva um
// algoritmo que encontre o número de pares de substrings que são anagramas.

// Exemplo 1)
// Entrada:
// ovo
// Saída:
// 3

// Explicação:
// A lista de todos os anagramas pares são: [o, o], [ov, vo] que estão nas posições [[0, 2], [0, 1],
// [1, 2]] respectivamente.


// Exemplo 2)
// Entrada:
// ifailuhkqq
// Saída:
// 3

// Explicação:
// A lista de todos os anagramas pares são: [i, i], [q, q] e [ifa, fai] que estão nas posições [[0, 3]],
// [[8, 9]] e [[0, 1, 2], [1, 2, 3]].


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Exercicio3 {
	public static void main(String[] args) {
    
		Scanner entrada = new  Scanner (System.in); // Metd de leitura pelo teclado

		String palavra;
		System.out.print(" DIGITE UMA PALAVRA: ");
		palavra = entrada.nextLine();  // Recebe o valor informado

    		ArrayList<String> anagrama = new ArrayList<String>(); // Arrey recebe todos os valores do contador
			/*
			ArrayList<String> letra = new ArrayList<String>();
			ArrayList<String> letra1 = new ArrayList<String>(); 
			ArrayList<String> letra2 = new ArrayList<String>(); 
			ArrayList<String> letra3 = new ArrayList<String>(); 
			*/
    
    		for(int i = 0; i < palavra.length(); i++) { 		// contador 1, sera comparado com o contador j
        		for(int j = 1; j < palavra.length(); j++) {		// contador 2, sera comparado com o contador i
            		if(palavra.charAt(i) == palavra.charAt(j) && i !=j && i < j) { 		// compara os valores de i com os de j
                		if(palavra.charAt(i) == palavra.charAt(i+1)) {

							
                			String l = palavra.substring(i, i + 1); 	
                			anagrama.add(l); 	// vetor anagrama recebe letra
							//letra.add(l);

                		} else {
                				String l1 = palavra.substring(i, j); 	// substring apartir de i e j 
                				String l2 = palavra.substring(i + 1, j + 1);
                				String l3 = palavra.substring(i, i + 1);

								// add array anagrama
                				anagrama.add(l1);
                				anagrama.add(l2);
                				anagrama.add(l3);

								//add array letra
								//letra1.add(l1);
								//letra2.add(l2);
								//letra3.add(l3);
                			}
            			}
        			}
    			}
				// Contadores de pares anagramas
				int quant = anagrama.size();
				System.out.println(" SAIDA: " + quant);
				System.out.println(" Lista de todos os anagramas pares: " + anagrama);
/*
				int quant1 = letra1.size();
				System.out.println(" SAIDA: " + quant1);
				System.out.println(" Anagramas pares: " + letra1);

				int quant2 = letra2.size();
				System.out.println(" SAIDA: " + quant2);
				System.out.println(" Anagramas pares: " + letra2);

				int quant3 = letra3.size();
				System.out.println(" SAIDA: " + quant3);
				System.out.println(" Anagramas pares: " + letra3);
    	
		
*/

	
	}



}



















/*
// CONTADOR DE LETRAS REPETIDAS

import java.util.*;

public class Exercicio3 {
	public static void main (String args[]){
    	Scanner leitor = new Scanner(System.in);
    		String palavra = "";
    		int vezes;
    		System.out.printf("DIGITE UM APALAVRA:");
    			palavra = leitor.nextLine();
    			vezes = repetido(palavra);
    				System.out.println("SAIDA: " + vezes);
	}
	
	static int repetido (String s) {
		int i = 0, j = 0, cont = 0;
		char c,d;
		char[] letra;
		boolean encontrou = false;

		letra = new char[s.length()];
			for (j = 0; j < s.length(); j++){
				for(i = j + 1 ; i < s.length();i++ ){
					c = s.charAt(i);
					d = s.charAt(j);

            		for (int l=0; l < s.length(); l++) {
                		if (d==letra[l]) {
                    		encontrou=true;                 
                    		break;
                		}
            		}
            		if ((c == d) && !encontrou) {
                		cont++;                                        
                		letra[j] = d;
            		}
            		encontrou=false;
        		}
    		}
    		return cont;
	}	
}

*/




/*

//CONTADOR DE LETRAS REPETIDAS
import java.util.*;

public class Exercicio3 {
	public static void main (String args[]){
    	Scanner leitor = new Scanner(System.in);
    		String palavra = "";
    		int vezes;
    			System.out.printf("Digite uma palavra para a busca:");
    		palavra = leitor.nextLine();
    		vezes = repetido(palavra);
    			System.out.println(vezes);
	}
	
	static int repetido (String s) {
		int i = 0, j = 0, cont = 0;
		char c,d;
		char[] letra;
		boolean encontrou = false;

		letra = new char[s.length()];
			for (j = 0; j < s.length(); j++){
				for(i = j + 1 ; i < s.length();i++ ){
					c = s.charAt(i);
					d = s.charAt(j);

            		for (int l=0; l < s.length(); l++) {
                		if (d==letra[l]) {
                    		encontrou=true;                 
                    		break;
                		}
            		}
            		if ((c == d) && !encontrou) {
                		cont++;                                        
                		letra[j] = d;
            		}
            		encontrou=false;
        		}
    		}
    		return cont;
	}	
}
			
*/	 



/*
CONTADOR DE LETRAS

public class Exercicio3 {
    public static void main(String[] args) {

        String frase= "Hojeeumnovodia";

        int tamanhoTotalFrase = frase.length();

        System.out.println("Tamanho da frase: " + tamanhoTotalFrase);

        int fraseSemEspaco = frase.replace(" ", "").length();
        System.out.println("Tamanho da frase sem espacos: " + fraseSemEspaco);
    }
}

*/




/*
CONTADOR DE LETRAS

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
public class Exercicio3 {
    public static void main(String[] args) 
    {
        String s = "Vê se tira notas boas!";
        Map<String, Integer> map = contar(s.replace(" ", "").toLowerCase());
        Imprimir(map);
    }

    public static Map<String, Integer> contar(String frase)
    {        
        Map<String, Integer> map = new TreeMap<>();                
        for(char item : frase.toCharArray())
        {
            Integer s = map.get(String.valueOf(item));
            if (s != null)
            {
                map.put(String.valueOf(item), ++s);
            }
            else
            {
                map.put(String.valueOf(item), 1);
            }
        }
        return map;
    }

    public static void Imprimir(Map<String, Integer> items)
    {       
        for(Map.Entry<String, Integer> a : items.entrySet())
        {
            System.out.println(a.getKey() + ": " +  a.getValue());
        }    
    }    
}


*/






/*

LEITOR DE ANAGRAMAS

public class Exercicio3 {
	
// Codigo Inicial, servira de base para o desenvolvimento.
	public static void main(String[] args) {
		String palavra = "tapa";
		imprimeAnagramas("", palavra);

	}

	public static void imprimeAnagramas(String prefix, String word) {
		if (word.length() <= 1) {
			System.out.println(prefix + word);
		} else {
			for (int i = 0; i < word.length(); i++) {
				String cur = word.substring(i, i + 1);
				String before = word.substring(0, i); 
				String after = word.substring(i + 1); 
				imprimeAnagramas(prefix + cur, before + after);
			}
		}
	}

}
*/