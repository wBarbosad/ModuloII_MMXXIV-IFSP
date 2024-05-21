public class Jogador {
    public int nivelHabilidade;
    public int velocidade;
    public String nome;
    public int pontosVida;
    public Jogador rival;

    public void jogarCarta(){
        System.out.println("Jogador jogou!");
    }

    public void ofenderRival(){
        System.out.println("Vacilão!");
    }

}
