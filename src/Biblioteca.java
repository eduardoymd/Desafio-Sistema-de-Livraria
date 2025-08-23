import java.util.ArrayList;

public class Biblioteca {

    ArrayList<Livro> livros = new ArrayList<>();
    ArrayList<Autor> autor = new ArrayList<>();
    ArrayList<Emprestimo> emprestimos = new ArrayList<>();

    public void adicionarNovoLivro(Livro livro){
        livros.add(livro);
    }
    public void listarLivros(){
        for (int i = 0; i < livros.size(); i++) {
            System.out.printf("ID: %s | Título: %s | %s\n",livros.get(i).getId(), livros.get(i).getTitulo(), livros.get(i).isDisponivel());
        }
    }
    public void realizarEmprestimo(){

    }
}
