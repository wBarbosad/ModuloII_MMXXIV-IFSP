public class App {
    
    public static void main(String[] args){
        do{
            try{
                Pessoa usuario = new Pessoa("A");
            } catch(Exception e){
              e.getMessage(); //Nome do erro lançado pelo método NomeInvalido;
            }
        } while(true);
    }
}


/*
 * 
 * try{ //tente fazer algo
 * 
 * }cath(){ //Se não der capture a exceção
 * 
 * }
 */