# Notebook Atv01
Crie uma classe em Java que seja capaz de apresentar a soma de todos os argumentos inteiros ou reais recebidos. Argumentos inválidos devem ser desconsiderados sem provocar a exibição de erros ou exceções.

# Código
// importação do pacote Scanner
import java.util.Scanner; 

// mecanismo responsável por gerenciar as entradas do teclado e colocar nas variáveis
Scanner LER = new Scanner(System.in);
        
// mensagem para o usuário
System.out.println("Olá, digite um número (inteiro ou real): ");
// LER pega o próximo float do teclado para colocar na variável num1
float num1 = LER.nextFloat(); 

// mensagem para o usuário
System.out.println("Agora, digite outro número  (inteiro ou real): "); 
// LER pega o próximo float do teclado para colocar na variável num2
float num2 = LER.nextFloat(); 

// fim do mecanismo LER
LER.close(); 

// cálculo da soma das 2 variáveis
float resultado = num1 + num2; 
        
// mensagem para o usuário junto com o valor da variável
System.out.println("A soma dos argumentos é : " + resultado);
