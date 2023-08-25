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