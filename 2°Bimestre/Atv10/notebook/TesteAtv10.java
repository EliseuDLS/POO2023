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
