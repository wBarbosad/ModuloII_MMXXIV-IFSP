package biblioteca;
public class Livro {

    private String autor;
    private String tipoCapa;
    private int quantidadePaginas;
    private String nome;
    private String referencias;
    private int anoLancamento;

    public Livro(String nome, int anoLancamento, String tipoCapa, int quantidadePaginas){ //construtor que inicia as coisas por padrão.
        this.nome = nome;
        this.anoLancamento = anoLancamento; 
        this.tipoCapa = tipoCapa;
        this.quantidadePaginas = quantidadePaginas;
    }
    public Livro(){ }
    

    public void setAutor(String autor){

        if(autor.isBlank()){
            this.autor = "Desconhecido";
        } else{
            this.autor = autor;
        }
    }

    public void setTipoCapa(String tipoCapa){

        if(tipoCapa == "Mole"){
            System.out.println("Nesta biblioteca não contém capa mole!");
        } else{
            this.tipoCapa = tipoCapa;
        }
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public int getAnoLancamento(){
        return this.anoLancamento;
    }

    public String getAutor(){
        return this.autor;
    }
    public String getTipoCapa(){
        return this.tipoCapa;
    }
}
