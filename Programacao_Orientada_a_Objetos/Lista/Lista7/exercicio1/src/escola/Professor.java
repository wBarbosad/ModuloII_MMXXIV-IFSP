package escola;

public class Professor extends Usuario{
    private String disciplina;

    public Professor(String nome, String email, String disciplina){
        super(nome, email);
        this.disciplina = disciplina;

    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Departamento do professor: " + this.disciplina);
    }

}
