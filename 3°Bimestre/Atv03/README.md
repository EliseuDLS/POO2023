# Atv03
## Aluno: Eliseu da Luz 3°INF

Suponha que você está desenvolvendo um sistema de gerenciamento de veículos para uma concessionária. Você precisa modelar diferentes tipos de veículos, como carros e motos, e também precisa implementar funcionalidades específicas para cada tipo de veículo.


Crie uma classe base chamada "Veiculo". Ela deve ter atributos como "marca", "modelo" e "ano". Crie um construtor para inicializar esses atributos e métodos de acesso (getters e setters) para eles.


Crie duas classes filhas: "Carro" e "Moto", ambas herdam da classe "Veiculo". Essas classes devem ter atributos adicionais específicos, como "numeroDePortas" para carros e "cilindradas" para motos. Crie construtores para inicializar esses atributos e também implemente métodos de acesso.


Na classe "Veiculo", crie um método chamado "exibirDetalhes" que imprime as informações básicas do veículo (marca, modelo, ano). Agora, para cada classe filha (Carro e Moto), sobrescreva o método "exibirDetalhes" para também incluir os atributos específicos desses veículos.


Crie uma classe de teste chamada "TesteVeiculos" com o método "main". Dentro desse método, crie instâncias de carros e motos, configure seus atributos e chame o método "exibirDetalhes" para verificar se a sobreposição de métodos está funcionando corretamente.

```
package Atv03;
class Veiculo {
    private String marca;
    private String modelo;
    private int ano;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void exibirDetalhes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
}
```
```
package Atv03;

class Carro extends Veiculo {
    private int numeroDePortas;

    public Carro(String marca, String modelo, int ano, int numeroDePortas) {
        super(marca, modelo, ano);
        this.numeroDePortas = numeroDePortas;
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Número de portas: " + numeroDePortas);
    }
}
```
```
package Atv03;

class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String marca, String modelo, int ano, int cilindradas) {
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Cilindradas: " + cilindradas);
    }
}
```
```
package Atv03;

public class TesteVeiculos {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "MK4", 1993, 2);
        carro.exibirDetalhes();

        System.out.println();

        Moto moto = new Moto("BMW", "F 900 R", 2019, 895);
        moto.exibirDetalhes();
    }
}
```
