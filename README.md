<h1>EXERCÍCIOS DE ORIENTAÇÃO A OBJETOS</h1>

Obs.: As classes criadas para cada exercício devem ser criadas em packages distintas. Exemplo: as classes do Exercício 01 devem ser criadas na package "exercicio01" e assim respectivamente para cada exercício.


<b>Exercício 01:</b>

package exercicio01:

Sabemos que uma classe contém a especificação dos atributos e comportamentos que os objetos pertencentes a ela devem ter.

Considerando que um objeto é a representação de uma instância de uma classe, pedimos que seja definida uma classe qualquer, com ao menos 3 atributos e 2 métodos.

Defina também, na mesma package (diretório) uma classe Exercicio01, com um método "public static void main(String[] args)", que instancia 3 objetos dessa classe criada e, para cada instância, preencha seus atributos e execute, pelo menos, 1 de seus métodos.


<b>Exercício 02:</b>

package exercicio02:

Um triangulo é uma figura geométrica de 3 lados. Para calcular a área de um triângulo, basta multiplicar o valor do seu lado base com sua altura e dividir o resultado por 2.

Defina uma classe Triangulo, com os atributos base e altura e com um método que retorna o valor da sua área.

Crie também uma classe Exercicio02, com método "... main()", que vai instanciar 3 triangulos diferentes e exibir no console (com System.out.println()) o valor das respectivas áreas.

Importante: use o construtor da classe para definir o valor da base e altura do triângulo!


<b>Exercício 03:</b>

package exercicio03:

Nosso sistema vai realizar o controle de livros em uma biblioteca. A regra é que um livro tem título, autor e numero de páginas. Outra regra importante é que uma vez criada uma instância (ou objeto) de um livro, o título, autor e número de páginas nunca possam ser modificados ao longo da existência desse objeto.

Considerando essas premissas, crie uma classe Livro, com os atributos descritos acima, de tal forma que, uma vez criado um objeto de Livro, não se permita alterar seus atributos após a sua criação.

Crie uma classe Exercicio03, com método "... main()", que instancia um objeto Livro e, após a instanciacao, tenta modificar o titulo do objeto livro sem sucesso, ou seja, o compilador tem que apontar erro na linha do comando em que o titulo do livro tenta ser modificado.


<b>Exercício 04:</b>

package exercicio04:

Sabemos que na relação entre classes mãe-filha, a classe filha herda todos os atributos e métodos de sua mãe.

Pedimos a definição de: uma classe Pessoa, com os atributos nome, idade e cidade de nascimento; uma classe Cliente, que é filha de Pessoa, com atributo CPF; e uma classe Funcionario, também filha de Pessoa, com atributo Número de Matrícula.

Crie uma classe Exercicio04, com método "... main()", que deve instanciar um objeto Cliente e um objeto Funcionario. Além disso, os atributos de cada objeto devem ser exibidos no console através de um método exibirDados(), que deve ser chamado a partir do objeto instanciado.


<b>Exercício 05:</b>

package exercicio05:

Uma caneta, um lápis e uma pena-mosquito são objetos utilizados para escrever.

Uma caneta tem material de plástico e escreve com tinta. Um lápis tem material de madeira e escreve com grafite. Uma pena-mosquito tem material de metal e escreve com nanquim.

Crie 3 classes: Caneta, Lapis e PenaMosquito, cada um com os atributos "ehFeitoDe" e "escreveCom", que devem ser fixos, ou seja, uma vez criado cada objeto, seus atributos nunca podem ser modificados.

Cada classe deve implementar o método escrever(), que ao ser executado deve exibir no console o texto: "Escrevendo com 'material usado pelo objeto para escrever' ".

Ex.: no caso de um objeto de Caneta, exibir "Escrevendo com tinta".

Se possível, use uma interface para definir o método escrever() a ser implementado por cada classe!

Crie uma classe Exercicio05, com método "... main()", que deve instanciar um objeto de cada classe (Caneta, Lapis e PenaMosquito) e, para cada obejto, executar seu método escrever().


<b>Exercício 06:</b>

package exercicio06:

Escreva uma classe chamada Exercicio06 com um método "... main()" que ao ser executado deve imprimir no console o seguinte:

"Encapsulamento é (escreva o que é encapsulamento com suas próprias palavras)."

"Polimorfismo é (escreva o que é polimorfismo com suas próprias palavras)."
