package exceptions;

public class NomeInvalidoException extends Exception {  //Criando o meu próprio exception e ele deve ser filha de exception
    public NomeInvalidoException(){ 
        super("O nome é obrigatório") //O construtor de exception tem um parâmetro de mensagem
    }
}
