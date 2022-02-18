// Questão 02
// Débora se inscreveu em uma rede social para se manter em contato com seus amigos. A
// página de cadastro exigia o preenchimento dos campos de nome e senha, porém a senha precisa ser
// forte. O site considera uma senha forte quando ela satisfaz os seguintes critérios:


//  * Possui no mínimo 6 caracteres.
//  * Contém no mínimo 1 digito.
//  * Contém no mínimo 1 letra em minúsculo.
//  * Contém no mínimo 1 letra em maiúsculo.
//  * Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+


// Débora digitou uma string aleatória no campo de senha, porém ela não tem certeza se é uma
// senha forte. Para ajudar Débora, construa um algoritmo que informe qual é o número mínimo de
// caracteres que devem ser adicionados para uma string qualquer ser considerada segura.

// Exemplo:
// Entrada: Ya 3
// Saída: 3 

// Explicação:
// Ela pode tornar a senha segura adicionando 3 caracteres, por exemplo, &ab, transformando
// a senha em Ya3&ab. 2 caracteres não são suficientes visto que a senha precisa ter um tamanho
// mínimo de 6 caracteres.



import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) { //chamada para os metodos

        Scanner entrada = new  Scanner (System.in); // Metd de leitura pelo teclado
            String senha;
                System.out.print(" INFORME A SENHA: ");
                senha = entrada.nextLine();  // Recebe o valor informado

                // Inicio do Bloco de comando para verificar se a senha atende aos criterios
                int tamanho = senha.length();
                    if( tamanho < 5 ) {  // Se a senha tiver  5 ou meno scaracteres, Escrever:
                        System.out.println("VOCÊ INFORMOU APENAS: " + tamanho + " DIGITOS."); 
                        System.out.println("A senha precisa ter 6 ou mais Caracteres!");  
                        System.out.println("Incluindo Letras Maiusculas, Letras Minusculas, Numeros e Caracteres Especiais"); 

                    //------------------------------------------------------------------------------------------------------------
                    } else if( senha.matches("[A-Z]*")) {  // Se a senha tiver so letras maiusculas, Escrever:
                        System.out.println("Sua senha está FRACA!");
                        System.out.println("Você inseriu apenas, Letras Maiusculas");  
                        System.out.println("Uma Senha FORTE deve Incluir: Letras Maiusculas, Letras Minusculas, Numeros e Caracteres Especiais"); 
                    //--------------------------------------------------------------------------------------------------------------

                    } else if( senha.matches("[A-Z0-9]*")) {  // Se a senha tiver so letras maiusculas, Escrever:
                        System.out.println("Sua senha está FRACA!");
                        System.out.println("Você inseriu apenas, Letras Maiusculas e Numeros");
                        System.out.println("Uma Senha FORTE deve Incluir: Letras Maiusculas, Letras Minusculas, Numeros e Caracteres Especiais");  

                    //------------------------------------------------------------------------------------------------------------
                    } else if( senha.matches("[a-z]*")) {  // Se a senha tiver so letras mimusculas, Escrever:
                        System.out.println("Sua senha está FRACA!");
                        System.out.println("Você inseriu apenas, Letras Minusculas");
                        System.out.println("Uma Senha FORTE deve Incluir: Letras Maiusculas, Letras Minusculas, Numeros e Caracteres Especiais"); 
                    //------------------------------------------------------------------------------------------------------------

                    } else if( senha.matches("[a-z0-9]*")) {  // Se a senha tiver so letras maiusculas, Escrever:
                        System.out.println("Sua senha está FRACA!");
                        System.out.println("Você inseriu apenas, Letras Minusculas e Numeros"); 
                        System.out.println("Uma Senha FORTE deve Incluir: Letras Maiusculas, Letras Minusculas, Numeros e Caracteres Especiais");

                    //------------------------------------------------------------------------------------------------------------
                    } else if( senha.matches("[a-zA-ZÁÂÃÀÇÉÊÍÓÔÕÚÜáâãàçéêíóôõúü]*")) {  // Se a senha tiver so letras maiusculas e minusculas, Escrever:
                        System.out.println("Sua senha está FRACA!");
                        System.out.println("Você inseriu apenas, Letras Maiusculas e Minusculas");
                        System.out.println("Uma Senha FORTE deve Incluir: Letras Maiusculas, Letras Minusculas, Numeros e Caracteres Especiais");
                    //------------------------------------------------------------------------------------------------------------

                    } else if( senha.matches("[0-9]*")) {  // Se a senha tiver  so numeros, Escrever:
                        System.out.println("Sua senha está FRACA!");
                        System.out.println("Você inseriu apenas, Numeros");
                        System.out.println("Uma Senha FORTE deve Incluir: Letras Maiusculas, Letras Minusculas, Numeros e Caracteres Especiais");

                    //------------------------------------------------------------------------------------------------------------
                    } else if( senha.matches("[0-9a-zA-ZÁÂÃÀÇÉÊÍÓÔÕÚÜáâãàçéêíóôõúü]*")) {  // Se a senha tiver so letras maiusculas e minusculas e numeros, Escrever:
                        System.out.println("Sua senha está FRACA!");
                        System.out.println("Você inseriu apenas, Letras Maiusculas, Minusculas e Numeros");
                        System.out.println("Uma Senha FORTE deve Incluir: Letras Maiusculas, Letras Minusculas, Numeros e Caracteres Especiais");


                    //------------------TESTES COM CARACTERES ESPECIAIS------------------------------------------------------------------------------------------------------------------------- 

                    } else if( senha.matches("[@_!#$%^&*()<>?/|}{~:]*")) { // Se a senha so tiver caracteres especiais, Escrever:
                        System.out.println("Sua senha está FRACA!");
                        System.out.println("Você inseriu apenas, Caracteres Especiais"); 
                        System.out.println("Uma Senha FORTE deve Incluir: Letras Maiusculas, Letras Minusculas, Numeros e Caracteres Especiais");

                    //------------------------------------------------------------------------------------------------------------
                    } else if( senha.matches("[A-Z]+[@_!#$%^&*()<>?/|}{~:]*")) {  // Se a senha so tiver Letras Miusculas e caracteres especiais, Escrever:
                        System.out.println("Sua senha está FRACA!");
                        System.out.println("Você inseriu apenas, Letras Maiusculas e Caracteres Especiais"); 
                        System.out.println("Uma Senha FORTE deve Incluir: Letras Maiusculas, Letras Minusculas, Numeros e Caracteres Especiais");
                    //------------------------------------------------------------------------------------------------------------

                    } else if( senha.matches("[a-z]+[@_!#$%^&*()<>?/|}{~:]*")) {  // Se a senha so tiver Letras Minusculas e caracteres especiais, Escrever:
                        System.out.println("Sua senha está FRACA!");
                        System.out.println("Você inseriu apenas, Letras Minusculas e Caracteres Especiais"); 
                        System.out.println("Uma Senha FORTE deve Incluir: Letras Maiusculas, Letras Minusculas, Numeros e Caracteres Especiais");

                    //------------------------------------------------------------------------------------------------------------
                    } else if( senha.matches("[0-9]+[@_!#$%^&*()<>?/|}{~:]*")) {  // Se a senha so tiver Numeros e caracteres especiais, Escrever:
                        System.out.println("Sua senha está FRACA!");
                        System.out.println("Você inseriu apenas, Numeros e Caracteres Especiais"); 
                        System.out.println("Uma Senha FORTE deve Incluir: Letras Maiusculas, Letras Minusculas, Numeros e Caracteres Especiais");
                    //------------------------------------------------------------------------------------------------------------

                    } else if( senha.matches("[A-Za-z_-]+[@_!#$%^&*()<>?/|}{~:]*")) {  // Se a senha so tiver Letras Maiusculas, Minusculas e caracteres especiais, Escrever:
                        System.out.println("Sua senha está FRACA!");
                        System.out.println("Você inseriu apenas, Letras Maiusculas, Minusculas e Caracteres Especiais"); 
                        System.out.println("Uma Senha FORTE deve Incluir: Letras Maiusculas, Letras Minusculas, Numeros e Caracteres Especiais");

                    //------------------------------------------------------------------------------------------------------------
                    } else if( senha.matches("[A-Z0-9_-]+[@_!#$%^&*()<>?/|}{~:]*")) {  // Se a senha so tiver Letras Maiusculas, Numeros e caracteres especiais, Escrever:
                        System.out.println("Sua senha está FRACA!");
                        System.out.println("Você inseriu apenas, Letras Maiusculas, Numeros e Caracteres Especiais"); 
                        System.out.println("Uma Senha FORTE deve Incluir: Letras Maiusculas, Letras Minusculas, Numeros e Caracteres Especiais");
                    //------------------------------------------------------------------------------------------------------------

                    } else if( senha.matches("[a-z0-9_-]+[@_!#$%^&*()<>?/|}{~:]*")) {  // Se a senha so tiver Letras Minusculas, Numeros e caracteres especiais, Escrever:
                        System.out.println("Sua senha está FRACA!");
                        System.out.println("Você inseriu apenas, Letras Minusculas, Numeros e Caracteres Especiais"); 
                        System.out.println("Uma Senha FORTE deve Incluir: Letras Maiusculas, Letras Minusculas, Numeros e Caracteres Especiais");

                    //------------------------------------------------------------------------------------------------------------
                    } else if( senha.matches("[A-Za-z0-9_-]+[@_!#$%^&*()<>?/|}{~:]*")) {  // Se a senha so tiver Letras Maiusculas, Minusculas, Numeros e caracteres especiais, Escrever:
                        System.out.println("Sua senha está FORTE!");
                        System.out.println("Você inseriu: Letras Maiusculas, Minusculas, Numeros e Caracteres Especiais."); 
                        System.out.println("-----------------------------------------------------------------------------"); 
                        System.out.println("PARABÉNS, SUA SENHA É SEGURA!!!"); 
                    }                    
    }  
}