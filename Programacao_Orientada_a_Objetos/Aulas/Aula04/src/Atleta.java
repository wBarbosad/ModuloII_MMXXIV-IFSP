public class Atleta {
    String nome;
    int idade;
    String esporte;
    String modalidade;
    char genero;



    public void categoria(int idade){
        if(idade>10 && idade<=15){
            System.out.println("Juvenil A");
        }
        if(idade>15 && idade<18){
            System.out.println("Juvenil B");
        }
        if(idade>=18){
            System.out.println("Adulto");
        }
    }

    public void correr(){
        System.out.println("Correndo!");
    }

    
}
