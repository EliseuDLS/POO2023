# Notebook Atv02
Crie uma classe em Java que realize cada uma das seguintes tarefas:

a) Exibir a mensagem “Informe um inteiro: “, deixando o cursor na mesma linha;

b) Atribuir o produto de variáveis b e c para a variável a;

c) Utilizar um comentário para afirmar que um programa executa um cálculo de exemplo de folha de pagamento.

```
//Exemplo de programa de folha de pagamento

// importação do pacote Scanner
import java.util.Scanner; 

// mecanismo responsável por gerenciar as entradas do teclado e colocar nas variáveis
Scanner LER = new Scanner(System.in); 

// mensagem para o usuário
System.out.print("Informe um valor: ");
// LER pega o próximo double do teclado para colocar na variável varB
double varB = LER.nextDouble(); 

// declaração da variável varC
double varC = 9.7;
        
// fim do mecanismo LER
LER.close();

//declaraçao da variavel varA execução do cálculo de exemplo de folha de pagamento.
double varA = varB * varC;

// mensagem para o usuário junto com o valor da variável varA
System.out.print("O resultado dos produtos dos argumentos B e C é: ( " + varA + " )" );
```
