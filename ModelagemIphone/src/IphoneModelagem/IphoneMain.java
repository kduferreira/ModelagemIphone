package IphoneModelagem;

public class IphoneMain {
	public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.tocar();
        iphone.selecionarMusica("Nome da Música");
        iphone.pausar();
        iphone.ligar();
        iphone.antender();
        iphone.inicarCorreioVoz();
        iphone.exibirPagina("www.google.com");
        iphone.adicionarNovaAba("www.yahoo.com");
        iphone.atualizarPagina();
    }
}
