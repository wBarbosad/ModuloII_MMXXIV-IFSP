package veiculos;

public class Moto implements Veiculo{
    private String nome;
    private String marca;
    private double preco;


    public Moto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public Moto(){ }
    @Override
    public void acelerar(){
        System.out.println("VRUUUUUUUUUUUUUM");
    }
    @Override
    public void frear(){
        System.out.println("Screeeechhhhhhhhhhhhhhhhhhhh");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }


    
}
