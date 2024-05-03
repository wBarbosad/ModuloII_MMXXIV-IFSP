import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner scan = new Scanner(System.in);
       String nome = "Wesley";
       int idade = 24;

       String ComidaFavorita = "Pizza";

        String mensagem = String.format(
                """
                Nome: %s;
                Idade: %s
                """;, nome, idade);


        System.out.println(mensagem);
        
    }
}

// equalsIgoneCase == Verifica se o nome que está em parenteses é igual, excluindo a caixa alta;
// contais("") verifica sem tem algo, p. exmplo uma letra.

