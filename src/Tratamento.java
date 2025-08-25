import java.util.InputMismatchException;
import java.util.Scanner;

public class Tratamento {
    private Scanner scanner;

    public Tratamento(Scanner scanner) {
        this.scanner = scanner;
    }
    public int lerInt(String mensagem){
        while(true){
            try {
                System.out.print(mensagem);
                return scanner.nextInt();
            }
            catch (InputMismatchException e){
                System.out.println("Entrada inválida.");
            }
            finally {
                scanner.nextLine();
            }
        }
    }
}

