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