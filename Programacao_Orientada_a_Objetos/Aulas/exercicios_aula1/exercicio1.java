import java.util.Scanner;

class exercicio1 {

    //12 vagões; Vetor de tamanho 12 recebe os pesos;
    // peso permitido 50 toneladas;
    public static final Scanner READ = new Scanner(System.in);
    public static final int QUANTIDADEdeVAGOES = 2;
    public static final int LIMITE_PESO = 50;
    public static void main(String[] args){
        int[] vagoes = new int[QUANTIDADEdeVAGOES];
        SetVAGOES(vagoes);
    }

    public static void SetVAGOES(int[] vagoes){
        for(int i =0; i<QUANTIDADEdeVAGOES; i++){
            System.out.println("Informe o peso da carga: ");
            vagoes[i] = Integer.parseInt(READ.nextLine());
        }
    }
    public static void validarPeso (int[] vagoes){
        for(int i=0; i<QUANTIDADEdeVAGOES; i++){
            if(vagoes[i]>=QUANTIDADEdeVAGOES){
                System.out.println("O vagão" + (i) + "está acima do peso permitido");

                if(vagoes[0]>=QUANTIDADEdeVAGOES){
                    System.out.println("O vagão" + (i+1) + "está acima do peso permitido");
                }
            }

        }
    }
}

/*
 * EXERCÍCIO 01:
 * public static void main(String[] args){
 * System.out.println("Informe um número: ");
 * int numero = Integer.parseInt(ler.nextLine());
 * for(int j = 0; numero>=j; --numero){
 * System.out.println(numero);
 * }
 * }
 */


 /*
  *  EXERCÍCIO 2;
  
    private static final Scanner READ = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\nInforme a idade do atleta: ");
        int idade = Integer.parseInt(READ.nextLine());
        ClassificarNadador(idade);
    }

    public static void ClassificarNadador(int idade) {
        if(idade<12){
            System.out.println("Categoria infantil");
        }
        if(idade>=12 && idade<=14){
            System.out.println("Categoria Juvenil A");
        }
        if(idade>=15 && idade<=17){
            System.out.println("Categoria juvenil B");
        }
        if(idade>=18){
            System.out.println("Adulto");
        }
    }

  */