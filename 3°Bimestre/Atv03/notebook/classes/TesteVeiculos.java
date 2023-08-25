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