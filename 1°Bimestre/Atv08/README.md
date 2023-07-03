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
import java.util.Scanner;
public class Atv08 {
    private static boolean[] assentos = new boolean[11];  // Array para representar os assentos
    private static Scanner scanner = new Scanner(System.in);  // Scanner para ler entrada do usuário

    public static void main(String[] args) {
        while (true) {  // Loop principal do programa
            exibirMenu();  // Exibe o menu de opções
            int opcao = scanner.nextInt();  // Lê a opção escolhida pelo usuário

            // Verifica a opção escolhida e reserva o assento correspondente
            if (opcao == 1) {
                reservarAssento(true); // Primeira Classe
            } else if (opcao == 2) {
                reservarAssento(false); // Classe Econômica
            } else {
                System.out.println("Opção inválida. Por favor, escolha novamente.");
            }

            // Verifica se todos os assentos foram ocupados
            if (verificarAssentosOcupados()) {
                System.out.println("Todos os assentos foram ocupados. O próximo voo parte em 3 horas.");
                break;  // Sai do loop principal
            }
        }
    }

    // Exibe o menu de opções
    private static void exibirMenu() {
        System.out.println("Por favor, digite 1 para Primeira Classe ou digite 2 para Classe Econômica:");
    }

    // Reserva um assento na classe indicada (primeira classe ou classe econômica)
    private static void reservarAssento(boolean primeiraClasse) {
        int assento;

        if (primeiraClasse) {  // Se for primeira classe
            assento = obterProximoAssentoDisponivel(1, 5);  // Obtém o próximo assento disponível
            if (assento == -1) {  // Se não houver assentos disponíveis
                System.out.println("A Primeira Classe está lotada. Deseja aceitar um assento na Classe Econômica? (S/N)");
                String resposta = scanner.next();  // Lê a resposta do usuário
                if (resposta.equalsIgnoreCase("S")) {
                    reservarAssento(false); // Classe Econômica
                }
            } else {
                exibirCartaoEmbarque(assento, "Primeira Classe");  // Exibe o cartão de embarque
            }
        } else {  // Se for classe econômica
            assento = obterProximoAssentoDisponivel(6, 10);  // Obtém o próximo assento disponível
            if (assento == -1) {  // Se não houver assentos disponíveis
                System.out.println("A Classe Econômica está lotada. Deseja aceitar um assento na Primeira Classe? (S/N)");
                String resposta = scanner.next();  // Lê a resposta do usuário
                if (resposta.equalsIgnoreCase("S")) {
                    reservarAssento(true); // Primeira Classe
                }
            } else {
                exibirCartaoEmbarque(assento, "Classe Econômica");  // Exibe o cartão de embarque
            }
        }

        if (assento != -1) {
            assentos[assento] = true;  // Marca o assento como ocupado
        }
    }

    // Obtém o próximo assento disponível dentro do intervalo especificado
    private static int obterProximoAssentoDisponivel(int inicio, int fim) {
        for (int i = inicio; i <= fim; i++) {
            if (!assentos[i]) {
                return i;  // Retorna o assento disponível encontrado
            }
        }
        return -1; // Assento não disponível
    }

    // Exibe o cartão de embarque com o número do assento e a classe
    private static void exibirCartaoEmbarque(int numeroAssento, String classe) {
        System.out.println("=======================================");
        System.out.println("CARTÃO DE EMBARQUE");
        System.out.println("Assento: " + numeroAssento);
        System.out.println("Classe: " + classe);
        System.out.println("=======================================");
        System.out.println();
    }

    // Verifica se todos os assentos estão ocupados
    private static boolean verificarAssentosOcupados() {
        for (int i = 1; i <= 10; i++) {
            if (!assentos[i]) {
                return false;  // Retorna falso se encontrar um assento disponível
            }
        }
        return true;  // Retorna verdadeiro se todos os assentos estiverem ocupados
    }
}
