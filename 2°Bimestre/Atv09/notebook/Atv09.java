public class Atv09{
    public static void main(String[] args) {
        //declaração, alocação e inicializacao do vetor
        int[] vetor = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        //chamanda do metodo imprimirNumeros para printar o array 
        imprimirNumeros(vetor);

        //declaração, alocação e inicializacao do vetor 2
        int[] vetor2 = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};

        //chamanda do metodo imprimirNumeros para printar o array 
        imprimirNumeros2(vetor2);

        //chamanda do metodo somaNumeros para somar os dois vetores 
        somaNumeros(vetor, vetor2);
        
    }
    
    // Declaração do método imprimirNumeros que recebe um array de inteiros e imprime os números
    public static void imprimirNumeros(int[] array) {
        System.out.println("\nSaída do vetor 1:");
        //estrutura de repetição for que percorre o vetor e faz um print de cada posição
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }

    public static void imprimirNumeros2(int[] array) {
        System.out.println("\nSaída do vetor 2:");
        //estrutura de repetição for que percorre o vetor e faz um print de cada posição
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }

    public static void imprimirNumeros3(int[] array) {
        System.out.println("\nSaída dos vetores somados:");
        //estrutura de repetição for que percorre o vetor e faz um print de cada posição
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }

    //declaracao do método somaNumeros que faz a soma de dois array como parametro 
    public static void somaNumeros (int[] array, int[] array2) {
        
        //declaração e alocação do vetor "arraysoma" com o tamanho do vetor
        int[] arraySoma = new int[array.length];

        //estrutura de repetição que realiza a soma dos array e atribui o valor para outro arrray
        for (int i = 0; i < array.length; i++) {
            arraySoma[i] = array[i] + array2[i];
        }

        //chama o método imprimirNumeros2 para printar a soma dos vetores
        imprimirNumeros3(arraySoma);
    } 
}