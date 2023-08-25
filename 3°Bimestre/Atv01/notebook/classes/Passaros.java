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