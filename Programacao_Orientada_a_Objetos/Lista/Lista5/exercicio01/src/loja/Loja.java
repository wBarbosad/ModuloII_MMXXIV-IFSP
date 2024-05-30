package loja;

import java.util.ArrayList;

public class Loja {
    private String formaPagamento;
    private ArrayList<Produto> produtos = new ArrayList<>();


    
    public void setListaProdutos(Produto produto){
        this.produtos.add(produto);
        this.produtos.size();
        System.out.println(this.produtos.size());
    }
    public void getListaProdutos(){
        for (int i = 0; i <produtos.size(); i++) {
            System.out.println(produtos.get(i).getNome());
        }
    }
    public void setFormaPagamento(String formaPagamento){
        this.formaPagamento = formaPagamento;
    }
    public String getFormaPagamento(){
        return this.formaPagamento;
    }
}
