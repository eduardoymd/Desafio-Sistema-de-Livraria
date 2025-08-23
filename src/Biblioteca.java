import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {

    ArrayList<Livro> livros = new ArrayList<>();
    ArrayList<Autor> autor = new ArrayList<>();
    ArrayList<Emprestimo> emprestimos = new ArrayList<>();

    public void adicionarNovoLivro(Livro livro){
        livros.add(livro);
    }
    public void listarLivros(){
        for (int i = 0; i < livros.size(); i++) {
            System.out.printf(
                    "ID: %s | Título: %s | %s\n",
                    livros.get(i).getLivroId(),
                    livros.get(i).getTitulo(),
                    livros.get(i).isDisponivel() ? "Disponível" : "Indisponível"
            );
        }
    }
    public void realizarEmprestimo(Scanner scanner){
        listarLivros();
        System.out.println("===========================================");
        System.out.print("Digite a ID do Livro: ");
        int id = scanner.nextInt();
    }
    public Livro buscarLivroPorID(int id){
        for (Livro livro : livros) {
            if (livro.getLivroId() == id) {
                return livro;
            }
        }
        return null;
    }
}
