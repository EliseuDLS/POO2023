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
