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