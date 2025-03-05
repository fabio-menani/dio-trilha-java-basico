import funcoes.ReprodutorMusical;
import funcoes.AparelhoTelefonico;
import funcoes.NavegadorInternet;

public class Iphone {
    private ReprodutorMusical reprodutorMusical;
    private AparelhoTelefonico aparelhoTelefonico;
    private NavegadorInternet navegadorInternet;

    public Iphone() {
        this.reprodutorMusical = new MeuReprodutorMusical();
        this.aparelhoTelefonico = new MeuAparelhoTelefonico();
        this.navegadorInternet = new MeuNavegadorInternet();
    }

    public ReprodutorMusical getReprodutorMusical() {
        return reprodutorMusical;
    }

    public AparelhoTelefonico getAparelhoTelefonico() {
        return aparelhoTelefonico;
    }

    public NavegadorInternet getNavegadorInternet() {
        return navegadorInternet;
    }
}
