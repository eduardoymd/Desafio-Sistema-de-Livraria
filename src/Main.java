import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        Autor autor1 = new Autor(1, "Cormac McCarthy", LocalDate.of(1933,7,20));
        Livro livro1 = new Livro(1, "Meridiano de Sangue", autor1, true, LocalDate.of(1985, 4,1), LocalDate.now());
        biblioteca.adicionarNovoLivro(livro1);

        Autor autor2 = new Autor(2, "Fernando Pessoa", LocalDate.of(1933,7,20));
        Livro livro2 = new Livro(2, "Poemas Completos de Alberto Caeiro", autor2, true, LocalDate.of(1985, 4,1), LocalDate.now());
        biblioteca.adicionarNovoLivro(livro2);

        Autor autor3 = new Autor(3, "Clarice Lispector", LocalDate.of(1933,7,20));
        Livro livro3 = new Livro(3, "A hora da estrela", autor3, true, LocalDate.of(1985, 4,1), LocalDate.now());
        biblioteca.adicionarNovoLivro(livro3);

        biblioteca.listarLivros();

    }
}