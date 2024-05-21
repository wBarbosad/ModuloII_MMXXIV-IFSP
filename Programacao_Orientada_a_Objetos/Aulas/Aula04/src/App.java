import java.util.Scanner;

public class App {

    public static final Scanner SCAN = new Scanner(System.in);
    public static void main(String[] args){
        Musica musica = new Musica();
        musica.melodia = "Meteoro da paixão";
        musica.cifra = "Doré mi sá lá sí";
        musica.temLetra = true;
        musica.letra = "João roubou pão";

        Musico guitarrista = new Musico();
        guitarrista.ehCantor = false;
        guitarrista.idade = 15;
        guitarrista.instrumento = "Guitarra";
        guitarrista.nome = "Wesley";

        musica.musicos.add(guitarrista);
        guitarrista.cantarMusica();
        musica.ouvir();
    }
}
