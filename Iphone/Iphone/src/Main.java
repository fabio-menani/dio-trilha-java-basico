
public class Main {
    public static void main(String[] args) {
        Iphone meuSmartphone = new Iphone();

        // Testando o Reprodutor Musical
        meuSmartphone.getReprodutorMusical().selecionarMusica("Anitta - Show das Poderosas");
        meuSmartphone.getReprodutorMusical().tocar();
        meuSmartphone.getReprodutorMusical().pausar();

        // Testando o Aparelho Telefônico
        meuSmartphone.getAparelhoTelefonico().ligar("+55(11)99999-9999");
        meuSmartphone.getAparelhoTelefonico().atender();
        meuSmartphone.getAparelhoTelefonico().iniciarCorreioVoz();

        // Testando o Navegador na Internet
        meuSmartphone.getNavegadorInternet().exibirPagina("https://github.com/digitalinnovationone/trilha-java-basico/blob/main/desafios/poo/README.md#funcionalidades-a-modelar");
        meuSmartphone.getNavegadorInternet().adicionarNovaAba();
        meuSmartphone.getNavegadorInternet().atualizarPagina();
    }
}
