public class Garrafa<T extends Liquido>{ //indicação de genérico pela classe;
    private T conteudo; //T é um genérico podendo ser String, double, etc.

    public Garrafa(T conteudo){
        this.conteudo = conteudo;
    }
    public T getConteudo(){ //retorno um T pois T é um genérico retornando qualquer coisa;
        return this.conteudo;
    }
    public void setConteudo(T conteudo){
        this.conteudo = conteudo;
    }
}
