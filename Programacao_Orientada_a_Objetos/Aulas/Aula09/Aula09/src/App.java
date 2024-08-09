import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Garrafa<Suco> garrafa = new Garrafa<>(new Suco()); //Um objeto que manipula um genêrico, sendo suco = T;?
        Garrafa<Refrigerante> garrafa2 = new Garrafa<>(new Refrigerante());
        Caixa<String> caixa = new Caixa();

        System.out.println(garrafa.getConteudo().getSabor()); //O T passa a ser do tipo Suco, então na garrafa temos Suco conteudo, depois tenho acesso ao que é do objeto Suco;
        System.out.println(garrafa.getConteudo().getSabor());


    }
}


/*Tudo em <> é um genérico */
