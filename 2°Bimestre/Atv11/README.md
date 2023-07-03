# Atv11
### Aluno: Eliseu da Luz 3°INF

Você foi contratado para desenvolver um programa que gerencie empréstimos financeiros. Sua tarefa é implementar a classe Emprestimo em Java, que representa cada empréstimo realizado. Cada objeto da classe Emprestimo será responsável por calcular e armazenar as parcelas correspondentes ao empréstimo.

A classe Emprestimo deve ser construída com os seguintes atributos: valorTotal (representando o valor total do empréstimo), taxaJuros (indicando o percentual de juros mensal) e numeroParcelas (representando a quantidade de parcelas do empréstimo).

Além disso, a classe deve possuir um método chamado proximaParcela(), que não recebe parâmetros e retorna o valor da próxima parcela a ser paga. Cada vez que esse método é invocado, ele deve retornar o valor correspondente à próxima parcela. Caso não haja mais parcelas a serem pagas, o método deve retornar -1.

Seu programa deve criar dois objetos Emprestimo, chamados E1 e E2, com valores diferentes para valorTotal, taxaJuros e numeroParcelas. Após a criação dos objetos, seu programa deve exibir as parcelas dos empréstimos em paralelo, ou seja, a primeira parcela de E1 deve ser exibida junto com a primeira parcela de E2, a segunda parcela de E1 com a segunda parcela de E2 e assim por diante. O programa deve continuar exibindo as parcelas enquanto houver parcelas restantes em pelo menos um dos empréstimos.

Você deve implementar a solução em Java, criando a classe Emprestimo com o construtor e o método descritos, além de utilizar um loop e as chamadas adequadas para exibir as parcelas dos empréstimos em paralelo.
