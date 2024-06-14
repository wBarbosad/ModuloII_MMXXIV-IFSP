import java.util.Scanner;
import exceptions.NomeInvalidoException;
import exceptions.PrecoInvalidoException;
import loja.Produto;

public class App {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean verificadorDeException = true;
        do{
            System.out.println("Informe um nome: ");
            String nome = scanner.nextLine();
            System.out.println("Informe o preço: ");
            int preco  = Integer.parseInt(scanner.nextLine());

            try{
                Produto produto = new Produto(nome, preco);
                System.out.println("Nome: " + produto.getNome() + "e preço = " + produto.getPreco());
                verificadorDeException = false;
            } 
            catch(NomeInvalidoException | PrecoInvalidoException e){
                System.out.println(e.getMessage());
            }
        } while(verificadorDeException);
        
    }
}