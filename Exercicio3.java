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
