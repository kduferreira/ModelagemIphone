package IphoneModelagem;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet  {
  String musicaAtual;

@Override
public void exibirPagina(String url) {
	System.out.println(url);
	
}

public void atualizarPagina() {
	System.out.println("Atualizando o mapa");
}



@Override
public void adicionarNovaAba(String url) {
	System.out.println("Adicionando: " + url);
	
}

@Override
public void ligar() {
	System.out.println("Ligando");
	
}

@Override
public void antender() {
	System.out.println("Atendendo telefone");
	
}

@Override
public void inicarCorreioVoz() {
	System.out.println("iniciando o correio de voz");
	
}

@Override
public void tocar() {
	System.out.println("Tocando a musica");
	
}

@Override
public void pausar() {
	System.out.println("Pause");
	
	
}

@Override
public void selecionarMusica(String musica) {
	
	this.musicaAtual = musica;
	
}

  	
}
