import biblioteca.Livro;

public class App {
    public static void main(String[] args){
        Livro livro1 = new Livro();
        livro1.setAutor("Olskvow");
        livro1.setNome("As aventuras");
        livro1.setTipoCapa("Mole");

        System.out.println("\n" + livro1.getNome());
        System.out.println(livro1.getAutor());
        System.out.println(livro1.getAnoLancamento());
        System.out.println(livro1.getTipoCapa());

    }
}
