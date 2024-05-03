import java.util.Scanner;

public class App {

    public static final Scanner SCAN = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("Informe uma palavra: ");
        String palavra = SCAN.nextLine();
        PegarFrase(palavra);

        System.out.println("Informe uma frase: ");
        String frase = SCAN.nextLine();

        String[] fraseArray = frase.split(" ");
        
        for(int i=0; i<fraseArray.length; i++){
            System.out.println(fraseArray[i]);
        }
    }

    public static final void PegarFrase(String frase){
        char[] vetorChar = frase.toCharArray();

        for(char Caracter : vetorChar){
            System.out.println(Caracter);
        }
    }
}
