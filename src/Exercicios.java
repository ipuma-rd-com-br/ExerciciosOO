public class Exercicios {

    /*
     conceitos:

     - classes
     - objetos
     - atributos
     - métodos
     - herança
     - polimorfismo
     - encapsulamento
     - abstração
     - interfaces

     - tipos primitivos
     - modificadores de acesso
     - construtores
     */

    /*
     package exercicio01:

     Sabemos que uma classe contém a especificação dos atributos e comportamentos que os objetos pertencentes a
     ela devem ter.

     Considerando que um objeto é a representação de uma instância de uma classe, pedimos que seja definida uma
     classe qualquer, com ao menos 3 atributos e 2 métodos.

     Defina também, na mesma package (diretório) uma classe Exercicio01, com um método "public static void main(String[] args)",
     que instancia 3 objetos dessa classe criada e, para cada instância, preencha seus atributos e execute, pelo menos,
     1 de seus métodos.
     */

    /*
     package exercicio02:

     Um triangulo é uma figura geométrica de 3 lados. Para calcular a área de um triângulo, basta multiplicar o valor
     do seu lado base com sua altura.

     Defina uma classe Triangulo, com os atributos base e altura e com um método que retorna o valor da sua área.

     Crie também uma classe Exercicio02, com método "... main()", que vai instanciar 3 triangulos diferentes e exibir no console
     (com System.out.println()) o valor das respectivas áreas.

     Importante: use o construtor da classe para definir o valor da base e altura do triangulo!
     */

    /*
     package exercicio03:

     Nosso sistema vai realizar o controle de livros em uma biblioteca. A regra é que um livro tem título, autor e numero
     de páginas. Outra regra importante é que uma vez criada uma instância (ou objeto) de um livro, o título, autor e número
     de páginas nunca possa ser modificado ao longo da existência desse objeto.

     Considerando essas premissas, crie uma classe Livro, com os atributos descritos acima, de tal forma que, uma vez criado
     um objeto de Livro, não se permita alterar seus atributos após a sua criação.

     Crie uma classe Exercicio03, com método "... main()", que instancia um objeto Livro e, após a instanciacao, tenta modificar o
     titulo do objeto livro sem sucesso, ou seja, o compilador tem que apontar erro na linha do comando em que o titulo
     do livro tenta ser modificado.
     */

    /*
     package exercicio04:

     Sabemos que na relação entre classes mae-filha, a classe filha herda todos os atributos e métodos de sua mae.

     Pedimos a definicao de: uma classe Pessoa, com os atributos nome, idade e cidade de nascimento; uma classe Cliente,
     que é filha de Pessoa, com atributo CPF; e uma classe Funcionario, também filha de Pessoa, com atributo Número de
     Matrícula.

     Crie uma classe Exercicio04, com método "... main()", que deve instanciar um objeto Cliente e um objeto Funcionario.
     Além disso, os atributos de cada objeto devem ser exibidos no console através de um método exibirDados(), que deve ser
     chamado a partir do objeto instanciado.
    */

    /*
     package exercicio05:

     Uma caneta, um lápis e uma pena-mosquito são objetos utilizados para escrever.

     Uma caneta tem material de plástico e escreve com tinta.
     Um lápis tem material de madeira e escreve com grafite.
     Uma pena-mosquito tem material de metal e escreve com nanquim.

     Crie 3 classes: Caneta, Lapis e PenaMosquito, cada um com o atributo material, que deve ser fixo, ou seja,
     canetas são de plastico, lapis são de madeira e penas-mosquito são de metal, uma vez criado cada objeto, seu material
     nunca pode ser modificado.

     Cada classe deve implementar o método escrever(), que ao ser executado deve exibir no console o texto:
     "Escrevendo com "+<conteudo do atributo material>.

     Se possível, use uma interface para definir o método escrever() a ser implementado por cada classe!

     Crie uma classe Exercicio05, com metodo "... main()", que deve instanciar um objeto de cada classe (Caneta, Lapis e
     PenaMosquito) e, para cada obejto, executar seu método escrever().
    */


}
