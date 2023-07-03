# Notebook Atv07
### Aluno: Eliseu da Luz 3°INF

Elabore uma classe que receba 5 notas de alunos por meio de showInputDialog, armazene essas notas em um array de cinco elementos, apresente em tela as cinco notas em ordem decrescente (da maior para a menor) e a média aritmética das notas.

```
//string para auxliar a classe JOptionPane
String aux; 

//declaração e alocação do vetor de 5 elementos
double vetor[] = new double[5];

//for para repetir 5 vezes a entrada da nota
for (int i = 0; i < 5; i++){

    //entrada de dados por meio da classe JOptionPane
    aux = JOptionPane.showInputDialog("Olá usuário! Digite a nota da sua prova: ");
    
    //conversão dos dados para o tipo float e armazenamento dos dados no vetor
    vetor[i] = Float.parseFloat(aux); 
}
//variavel para fazer o while repetir
boolean repetir;

do {
    //repetir recebe false para a variavel repetir
    repetir = false; 
     
    for (int i = 1; i < vetor.length; i++) {
        
        //se o vetor anterior for maior que o vetor na posição i
        if (vetor[i - 1] > vetor[i]) {
            //troca a ordem dos dois valores com ajuda da variavel temp
            double temp = vetor[i - 1];
            vetor[i - 1] = vetor[i];
            vetor[i] = temp;
            //repetir recebe true para se comparar novamente 
            repetir = true; 
        }
    }
    
} while (repetir);


//alocacao para a variavel ser a media das notas
double mediaAritimetica;

//alocacao e inicializacao da variavel 
double somaNotas = 0; 

//string para adicionar as notas ja ordenadas
String notasOrdenadas = "";

//for para somar todas as notas do vetor e colocar na variavel as notas ja ordenadas 
for (int i = 0; i < vetor.length; i++){ 

    //adicao da nota na variavel
    notasOrdenadas +=  vetor[i] + ", "; 
   
    //adicao da nota da posicao i do vetor
    somaNotas += vetor[i]; 
}

//calculo da media
mediaAritimetica = somaNotas / vetor.length; 

//imprimindo o resultado na tela
JOptionPane.showMessageDialog(null, "Notas organizadas = " + notasOrdenadas + " \n " + " Media das notas = " + mediaAritimetica);
