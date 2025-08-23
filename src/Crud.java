import java.util.Scanner;

public class Crud {

    boolean continuar = true;

    public void crud(Scanner scanner, Biblioteca biblioteca) {
        while(continuar){
            System.out.println("--------------------------");
            System.out.println("BIBLIOTECA");
            System.out.println("--------------------------");
            System.out.println("[1] Listar Livros");
            System.out.println("[2] Realizar Empréstimo");
            System.out.println("[3] Cadastrar Novo Livro");
            System.out.println("--------------------------");

            System.out.print("Opção: ");
            int opcao = scanner.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("LISTA DE LIVROS CADASTRADOS");
                    biblioteca.listarLivros();
                    break;
                case 2:
                    System.out.println("op2");
                    break;
                case 3:
                    System.out.println("op3");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }
}