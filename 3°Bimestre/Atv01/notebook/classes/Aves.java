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