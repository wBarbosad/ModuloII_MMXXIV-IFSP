package escola;

public class Aluno extends Usuario{
    
    private String matricula;
    private boolean exibirNome;
    private boolean exibirEmail;
    private boolean exibirMatricula;

    public Aluno(String nome, String email, String matricula){
        super(nome, email);
        this.matricula = matricula;
    }

    @Override //Sobescrevi o método da superclasse
    public void exibirInformacoes(){
        System.out.println(getMatricula());
    }

    public void exibirInformacoes(boolean exibirNome, boolean exibirEmail, boolean exibirMatricula){
        if(this.exibirEmail == true){
            System.out.println(super.getEmail());
        }
        if(this.exibirMatricula == true){
            System.out.println(this.matricula);
        }
        if(this.exibirNome == true){
            System.out.println(super.getNome());
        }
    }

    public String getMatricula(){
        return this.matricula;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public boolean isExibirNome(){
        return this.exibirNome;
    }

    public void setExibirNome(boolean exibirNome) {
        this.exibirNome = exibirNome;
    }

    public boolean isExibirEmail() {
        return exibirEmail;
    }

    public void setExibirEmail(boolean exibirEmail) {
        this.exibirEmail = exibirEmail;
    }

    public boolean isExibirMatricula() {
        return exibirMatricula;
    }

    public void setExibirMatricula(boolean exibirMatricula) {
        this.exibirMatricula = exibirMatricula;
    }
    


}
