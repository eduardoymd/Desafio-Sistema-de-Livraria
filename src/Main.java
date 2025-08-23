import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Crud crud = new Crud();
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

        Autor autor4 = new Autor(4, "Machado de Assis", LocalDate.of(1839, 6, 21));
        Livro livro4 = new Livro(4, "Dom Casmurro", autor4, true, LocalDate.of(1899, 1, 1), LocalDate.now());
        biblioteca.adicionarNovoLivro(livro4);

        Autor autor5 = new Autor(5, "Cecília Meireles", LocalDate.of(1901, 11, 7));
        Livro livro5 = new Livro(5, "Romanceiro da Inconfidência", autor5, true, LocalDate.of(1953, 1, 1), LocalDate.now());
        biblioteca.adicionarNovoLivro(livro5);

        Autor autor6 = new Autor(6, "Jorge Amado", LocalDate.of(1912, 8, 10));
        Livro livro6 = new Livro(6, "Capitães da Areia", autor6, true, LocalDate.of(1937, 6, 1), LocalDate.now());
        biblioteca.adicionarNovoLivro(livro6);

        crud.crud(scanner, biblioteca);

    }
}