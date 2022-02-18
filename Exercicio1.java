// Questão 01
// Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços. 
// A base e altura da escada devem ser iguais ao valor de n. A última linha não deve conter nenhum espaço.
// Exemplo:
// Entrada: 
// n = 5

// Saída: 
//      *
//     **
//    ***
//   ****
//  *****
// ******



import java.util.Scanner; // Import o metd Scaner para leitura do teclado

public class Exercicio1 {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in); // Metd de leitura pelo teclado

    int num;
    System.out.print("DIGITE O TAMANHO DESEJADO: ");
    num = entrada.nextInt();  // Recebe o valor informado

    for(int linha = 0; linha < num; linha++) {

      for(int coluna = 0; coluna <= num-linha+1; coluna++) {
          System.out.print(" ");
      }

      for(int coluna = 0; coluna <= linha; coluna++) {
          System.out.print("*");
      }

      System.out.println(); // organiza e printa a saida 
    }

  }
}















/*
public class Exercicio1 {
  public static void main(String[] args) {
      for(int linha = 0; linha < 5; linha++) {

          for(int coluna = 0; coluna <= 5-linha+1; coluna++) {
              System.out.print(" ");
          }

          for(int coluna = 0; coluna <= linha; coluna++) {
              System.out.print("*");
          }

          System.out.println();
      }
  }
}

*/


















/*
public class Exercicio1 {
  public static void main(String[] args) {
      for(int linha = 0; linha < 5; linha++) {

          for(int coluna = 0; coluna <= 5-linha+1; coluna++) {
              System.out.print(" ");
          }

          for(int coluna = 0; coluna <= linha; coluna++) {
              System.out.print("*");
          }

          System.out.println();
      }
  }
}

*/












/*
import java.util.Scanner; // Import o metd Scaner para leitura do teclado

public class Exercicio1 {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int num;
    System.out.print("DIGITE O TAMANHO DESEJADO: ");
    num = entrada.nextInt();



    String vet[] = new String[num];  // Recebe o valor informado para o array
    vet[0] = "*"; 

        System.out.print(vet[0] + "\n");  // Printa OS * na tela

      for( int i = 1; i < num; i ++) { 
          vet[i] = vet[i -1] + "*"; 
        System.out.print(vet[i] + "\n"); 
      }

      
  }
}

*/




