# Atv01
### Aluno: Eliseu da Luz 3°INF

Suponha que temos os seguintes tipos de animais:

Mamíferos (superclasse):

Atributos: nome, idade.

Métodos: emitirSom() e mover().

Cachorros (subclasse de Mamíferos):

Atributo adicional: raça.

Método adicional: abanarRabo().

Aves (superclasse):

Atributos: nome, idade.

Métodos: emitirSom() e voar().

Pássaros (subclasse de Aves):

Atributo adicional: cor.

Método adicional: construirNinho().

1 - Crie as classes Mamíferos e Aves com seus respectivos atributos e métodos;

2 - Crie as classes Cachorros e Pássaros que herdam de Mamíferos e Aves, respectivamente;

3 - Implemente os construtores para cada classe para inicializar os atributos nome e idade;

4 - Crie um método para cada classe que exibe informações específicas do animal;

5 - Crie um programa principal (main) para instanciar objetos das classes Cachorros e Pássaros e teste os métodos implementados.

```
class Mamiferos {
    protected String nome;
    protected int idade;

    public Mamiferos(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void emitirSom() {
        System.out.println("O mamífero está emitindo um som :|");
    }

    public void mover() {
        System.out.println("O mamífero está se movendo :O");
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
```
```
class Cachorros extends Mamiferos {
    private String raca;

    public Cachorros(String nome, int idade, String raca) {
        super(nome, idade);
        this.raca = raca;
    }

    public void abanarRabo() {
        System.out.println("O cachorro está abanando o rabinho :)");
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Raça: " + raca);
    }
}
```
```
class Aves {
    protected String nome;
    protected int idade;

    public Aves(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void emitirSom() {
        System.out.println("A ave está emitindo um som :|");
    }

    public void voar() {
        System.out.println("A ave está voando :O");
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
```
```
class Passaros extends Aves {
    private String cor;

    public Passaros(String nome, int idade, String cor) {
        super(nome, idade);
        this.cor = cor;
    }

    public void construirNinho() {
        System.out.println("O pássaro está construindo um ninho :)");
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Cor: " + cor);
    }
}
```
```
public class Main {
    public static void main(String[] args) {
        Cachorros cachorro = new Cachorros("Cookie", 2, "Pug");
        cachorro.exibirInformacoes();
        cachorro.emitirSom();
        cachorro.mover();
        cachorro.abanarRabo();
        System.out.println();

        Passaros passaro = new Passaros("Blu", 3, "Azul");
        passaro.exibirInformacoes();
        passaro.emitirSom();
        passaro.voar();
        passaro.construirNinho();
    }
}
```
