import java.util.*;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        List<String> contatos = Arrays.asList("Carlos", "Ana", "Leticia", "Felipe", "Yasmim", "Otavio");
        Iphone iphone = new Iphone();

        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o modelo de iphone");
        String modelo = scanner.next();
        scanner.nextLine();

        System.out.println("Modelo de armazenamento");
        String armazenamento = scanner.next();

        iphone.tocar();
        iphone.selecionarMusica("Nome da Música");
        iphone.pausar();
        iphone.ligar(contatos);
        iphone.atender();
        iphone.iniciarCorreioDeVoz();
        iphone.exibirPagina("www.google.com");
        iphone.adicionarNovaAba("www.yahoo.com");
        iphone.atualizarPagina();

        }


    }
