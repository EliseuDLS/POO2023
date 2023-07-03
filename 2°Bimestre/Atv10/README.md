# Atv10
### Aluno: Eliseu da Luz 3°INF

- Crie uma classe chamada "Pessoa" com os seguintes atributos privados: "nome" (do tipo String), "idade" (do tipo int) e "altura" (do tipo double). Em seguida, implemente métodos públicos para acessar e modificar esses atributos, respeitando o princípio de encapsulamento.
- Crie uma classe para testar o funcionamento da classe "Pessoa".

```
public class Atv10 {
    private String nome;
    private int idade;
    private double altura;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}

```
```
public class TesteAtv10 {
    public static void main(String[] args) {
        Atv10 pessoa = new Atv10();

        // Modificando os atributos usando os métodos setters
        pessoa.setNome("Xelebis");
        pessoa.setIdade(49);
        pessoa.setAltura(1.85);

        // Acessando os atributos usando os métodos getters
        String nome = pessoa.getNome();
        int idade = pessoa.getIdade();
        double altura = pessoa.getAltura();

        // Exibindo os atributos na tela
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
    }
}
