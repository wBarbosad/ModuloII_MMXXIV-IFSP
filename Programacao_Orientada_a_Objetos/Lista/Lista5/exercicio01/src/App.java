import java.util.Scanner;

import loja.Loja;
import loja.Produto;

public class App {

    private static final Scanner SCAN = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        Loja loja1 = new Loja();
        Produto produto1 = new Produto();
        Produto produto2 = new Produto("Batata", 1, null);
        produto1.setNome("Arroz");
        produto1.setMarca("Camil");
        produto1.setPreco(31.36);

    

        System.out.println("Informe o método de pagamento: ");
        loja1.setFormaPagamento(SCAN.nextLine());

        
        loja1.setListaProdutos(produto1);
        loja1.setListaProdutos(produto2);
        loja1.getListaProdutos();

    }
}
