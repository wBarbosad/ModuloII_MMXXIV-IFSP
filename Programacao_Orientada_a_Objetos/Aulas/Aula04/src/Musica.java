import java.util.ArrayList;

public class Musica {
    String melodia;
    String cifra;
    boolean temLetra;
    String letra;
    ArrayList<Musico> musicos = new ArrayList<Musico>();


    public void ouvir(){
        //musicos.size();
        //musicos.get(0)

        for(int i=0; i<musicos.size(); i++){
            if(musicos.get(i).ehCantor){
                musicos.get(i).cantarMusica();
            }
        }
    }

    public void imprimirDetalhes(){
        System.out.println(melodia);
        System.out.println( );
    }
}
