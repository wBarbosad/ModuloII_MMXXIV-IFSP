package Carta;
public abstract class Carta {
    private String nome;
    private boolean revelada;


    public abstract void realizarAcao(); //Precisa ser implementado nas classes filhas de Carta

    public void revelarCarta(){
        if(!revelada){
            revelada = true;
        }

        revelada = true;
        System.out.println("Nome : " + nome);
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public boolean isRevelada() {
        return revelada;
    }


    public void setRevelada(boolean revelada) {
        this.revelada = revelada;
    }


}
