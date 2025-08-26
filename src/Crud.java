import java.util.Scanner;

public class Crud {
    Tratamento tratamento = new Tratamento(new Scanner(System.in));
    boolean continuar = true;

    public void crud(Scanner scanner, Biblioteca biblioteca) {
        while(continuar){
            int opcao = tratamento.lerInt(
                    "-----------------------------------------------------------------\n" +
                    "[1] Listar Livros\n" +
                    "[2] Realizar Empréstimo\n" +
                    "[3] Cadastrar Novo Livro\n" +
                    "-----------------------------------------------------------------\n" +
                    "Opção: ");
            switch (opcao){
                case 1:
                    System.out.println("\nLISTA DE LIVROS CADASTRADOS");
                    biblioteca.listarLivros();
                    break;
                case 2:
                    System.out.println("\nEPRÉSTIMO DE LIVRO");
                    biblioteca.realizarEmprestimo(scanner);
                    break;
                case 3:
                    System.out.println("\nCADASTRAR NOVO LIVRO");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }
}