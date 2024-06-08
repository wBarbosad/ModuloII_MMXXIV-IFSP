package Carta;

public class CartaExplosao extends Carta {
    
    //Como um bastract nçao precisa ser instanciada eu posso instanciar outras classes usando ela como tipo, de modo a poder utilizar as ferramentas
    // que ela contém. Portanto, ao extanciar ela em outras classes, os seus filhos tem acesso a sua mãe.
    //Acesso os métodos e os atributos dela pelos seus filhos
    
    public void realizarAcao(){
        System.out.println("O jogador explodiu");
    }

    //public final class CartaExplosão ==> Não pode ser extanciada;
    //métodos com final não podem mudar, sempre vai ser daquela forma;


    //para pegar os atributos da class abstract uso super.

    //@Overwire == sobrepor o método da mãe
    //Sobrecarga = utilizar o mesmo nome no construtor entretanto com parâmetros diferentes;
    //Quando tem um construtor na mãe devo iniciar o parÂmetro/construtor com o super() e passar o prÂmetro

    //
}
