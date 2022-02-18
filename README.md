# Academia_Tecnica_Capgemini2022
<h4>Repositório destinado a armazenar e documentar o meu passo a passo e os meus desafios de programação durate a Academia Técnica Capgemini 2022!</h4>

<p>Todo os Exercicios foram resolvido utilizando a linguagem JAVA.</p>


<h4>Questão 1</h5>
<p>Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços. 
A base e altura da escada devem ser iguais ao valor de n. A última linha não deve conter nenhum espaço.</p>
<p>Exemplo:</p>
<p>Entrada:</p> 
<p>n = 5</p>

<p>Saída:</p> 

<p>      *  </p>
<p>     **  </p>
<p>    ***  </p>
<p>   ****  </p>
<p>  *****  </p>
<p> ******  </p>

#---------------------------------------------------------------------------------------------------------

<h4>Questão 2</h5>

<p>
Débora se inscreveu em uma rede social para se manter em contato com seus amigos. A
página de cadastro exigia o preenchimento dos campos de nome e senha, porém a senha precisa ser
forte. O site considera uma senha forte quando ela satisfaz os seguintes critérios:
</p>

<p> Possui no mínimo 6 caracteres.</p>
<p> Contém no mínimo 1 digito.</p>
<p> Contém no mínimo 1 letra em minúsculo.</p>
<p> Contém no mínimo 1 letra em maiúsculo.</p>
<p> Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+</p>

<p>
Débora digitou uma string aleatória no campo de senha, porém ela não tem certeza se é uma
senha forte. Para ajudar Débora, construa um algoritmo que informe qual é o número mínimo de
caracteres que devem ser adicionados para uma string qualquer ser considerada segura.
</p>

<p>Exemplo:</p>
<p>Entrada: Ya 3</p>
<p>Saída: 3 </p>

<p>Explicação:</p>
<p>
Ela pode tornar a senha segura adicionando 3 caracteres, por exemplo, &ab, transformando
a senha em Ya3&ab. 2 caracteres não são suficientes visto que a senha precisa ter um tamanho
mínimo de 6 caracteres.
</p>


#---------------------------------------------------------------------------------------------------------


<h4>Questão 3</h5>

<p>
Duas palavras podem ser consideradas anagramas de si mesmas se as letras de uma palavra
podem ser realocadas para formar a outra palavra. Dada uma string qualquer, desenvolva um
algoritmo que encontre o número de pares de substrings que são anagramas.
</p>

<p>Exemplo 1</p>
<p>Entrada:</p>
<p>ovo</p>
<p>Saída:</p>
<p>3</p>

<p>Explicação:</p>
<p>A lista de todos os anagramas pares são: [o, o], [ov, vo] que estão nas posições [[0, 2], [0, 1],
[1, 2]] respectivamente.</p>


<p>Exemplo 2</p>
<p>Entrada:</p>
<p>ifailuhkqq</p>
<p>Saída:</p>
<p>3</p>

<p>Explicação:</p>
<p>A lista de todos os anagramas pares são: [i, i], [q, q] e [ifa, fai] que estão nas posições [[0, 3]],
[[8, 9]] e [[0, 1, 2], [1, 2, 3]].</p>


