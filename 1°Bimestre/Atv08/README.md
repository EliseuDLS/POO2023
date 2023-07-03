# Notebook Atv08
### Aluno: Eliseu da Luz 3°INF

Uma pequena companhia aérea acabou de comprar um computador para seu novo sistema automatizado de reservas. Você foi solicitado a desenvolver o novo sistema. Você escreverá um aplicativo para atribuir assentos em cada voo da companhia aérea (capacidade: 10 assentos).
O sistema deve exibir as seguintes alternativas: 

- Por favor digite 1 para Primeira Classe e digite 2 para Classe Econômica .  Se o usuário digitar 1, o sistema deve atribuir assentos na primeira classe (poltronas 1 a 5). Se o usuário digitar 2, o sistema deve atribuir um assento na classe econômica (poltronas 6 a 10). 

- O sistema deve ainda exibir um cartão de embarque indicando o número da poltrona da pessoa e se ela está na primeira classe ou na classe econômica.

- Utilize um array unidimensional do tipo primitivo boolean para representar o gráfico de assentos do avião. 

- Inicialize todos os elementos do array como false para indicar que todas as poltronas estão desocupadas. 

- À medida que cada assento é atribuído, configure o elemento correspondente do array como true para indicar que o assento não está mais disponível.

- O sistema nunca deve atribuir uma poltrona que já foi reservada. 

- Quando a classe econômica estiver lotada, o sistema deve perguntar à pessoa se ela aceita ficar na primeira classe (e vice-versa). Se sim, faça a atribuição apropriada de assento. Se não, exiba a mensagem "O próximo voo parte em 3 horas".

```
//importação da classe Scanner do pacote java.util
import java.util.Scanner; 

public class Atv08 {

    //prepara a entrada de dados
    final static Scanner LER = new Scanner(System.in); 
    //declaração e alocação do vetor assentos 
    final static String nomesClientes[] = new String[10]; 
    //declaração e alocação do vetor assentos 
    final static boolean assentos[] = new boolean[10];

    public static void CompraAssento(){
		System.out.println("Por favor digite (1) para Primeira Classe ou digite (2) para Classe Econômica");

        //entrada para a classe de compra
        int entrada = LER.nextInt();

        if (entrada == 1){ 
            int i = 0; // variavel para percorrer o vetor dos assentos
            boolean achouAssento = true; //variavel auxiliar para percorrer assentos e achar um assento false

            do { //para percorrer pelo menos uma vez
                if (i == 5){ //apenas 5 assentos da primeira classe
                    System.out.println("Todos os assentos da primeira classe estão cheios :( ");

                    for (int hj = 5; hj<11; hj++){ //percorrendo o vetor na classe economica
                        if (assentos[hj] == false){
                            System.out.println("Possuímos assentos disponíveis na classe econômica :) ");
                            System.out.println("Deseja comprar outro assento? Sim(1) Não(2)");

                            int a = LER.nextInt(); //entrada para a resposta 

                            if (a == 1){
                                CompraAssento(); //chama a função para a compra novamente
                            } else {
                                System.out.println("Não foi possível realizar a compra :( ");
                            }

                            break;
                        }
                    }
                    
                    break;
                }

                if (assentos[i] == false){ //se achou um assento vazio (false)
                    System.out.println("Por favor digite seu nome para efetuar a compra: "); 
                    String nomeCliente = LER.next(); //entrada do nome do cliente em String
                    nomesClientes[i] = nomeCliente; //adicionando no vetor o nome do cliente
                    assentos[i] = true; //colocando que o assento foi vendido
                    achouAssento = false; //achou um assento para de percorrer 

                //vai para a proxima posição (proximo assento)
                } else {
                    i += 1; 
                }

            //repete se nao achou um assento
            } while (achouAssento); 
        }

        if (entrada == 2){ 
            int i = 5; //variavel que começa em 5 (assentos de 5 a 10)
            boolean achouAssento = true; //auxiliando para achar um assentos

            do { //repete pelo menos uma vez
                if (i == 10){ //apenas 5 assentos da classe economica
                    System.out.println("Todos os assentos da classe econômica estão cheios :( ");

                    for (int hj = 0; hj<6; hj++){ //for de 0 até 5 (primeira classe)
                        if (assentos[hj] == false){
                            System.out.println("Possuímos assentos disponiveis na primeira classe! :) ");
                            System.out.println("Deseja comprar outro assento? Sim(1) Não(2)");

                            int a = LER.nextInt();

                            if (a == 1){
                                CompraAssento();
                            } else {
                                System.out.println("Não foi possível realizar a compra :( ");
                            }
                            break;
                        }
                    }
			
                    System.out.println("Infelizmente não há assentos disponiveis :( ");

                    break;
                }

                if (assentos[i] == false){ //se achou um assento vazio (false)
                    System.out.println("Por favor digite seu nome para efetuar a compra: "); 
                    String nomeCliente = LER.next(); //entrada do nome do cliente em String
                    nomesClientes[i] = nomeCliente; //adicionando no vetor o nome do cliente
                    assentos[i] = true; //colocando que o assento foi vendido
                    achouAssento = false; //achou um assento para de percorrer 
                } else {
                    i += 1;
                }

            } while(achouAssento);
        }
    }

    //primeira classe a ser executada no código
	public static void main(String[] args) {

        System.out.println("Bem-vindo ao novo sistema automatizado de reservas! :)");
        
         //repete 10x (10 assentos)
        for (int i = 0; i<10; i++){

            System.out.println("A seguir os assentos livres e ocupados: ");
            System.out.println("Primeira classe: ");

             //repete 10x (10 assentos)
            for (int a = 0; a<10; a++){

                //listando os assentos disponiveis
                System.out.println(assentos[a]+ "\t"+ nomesClientes[a]); 
                if (a == 4){
                System.out.println("Classe econômica: ");
                }
        }
            //chama o método para comprar os assentos
            CompraAssento();
        }

        //mensagem para o usuário
        System.out.println("Todas os assentos lotados :( Sinto muito!");
        System.out.println("Programa finalizado, tchau");
	}
}
