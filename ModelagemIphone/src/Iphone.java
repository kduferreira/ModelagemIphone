import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Iphone  implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet{

    private  String musicaAtual;

    boolean correioDeVozAtivo = false;
    List<String> contatos =  Arrays.asList("Carlos", "Ana", "Leticia", "Felipe", "Yasmim", "Otavio");

    public Iphone() {

    }

    @Override
    public void ligar(List<String> contatos) {

             Random random = new Random();
         int indiceAleatorio = random.nextInt(contatos.size());
         String contatoAleatorio = contatos.get(indiceAleatorio);


        System.out.println("Ligando para"  + contatoAleatorio + ".....");

    }

    @Override
    public void atender() {
        System.out.println("Alo?");
    }

    @Override
    public void iniciarCorreioDeVoz() {


        if (!correioDeVozAtivo){
            System.out.println("Correio de voz iniciado. Deixe sua mensagem");
            correioDeVozAtivo = true;
        }else {
            System.out.println("Correio de voz ja esta ativo");
        }
    }

    @Override
    public void exibirPagina(String url) {

        System.out.println("Acessando o :" + url);
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("Adicionando aba para o " + url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando...");
    }


    @Override
    public void tocar() {

        System.out.println("tocando musica...");
    }

    @Override
    public void pausar() {
        System.out.println("Pause!");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Musica: " + musica + "Esta pronta para ser reproduzida");
    }









}
