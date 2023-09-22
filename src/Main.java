import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    };

public static void AbrirMenu(){
    var livros = new ArrayList<Livro>();
    var continuar = true;
    while (continuar){System.out.println("Menu:");
        System.out.println("1. Cadastrar novo livro");
        System.out.println("2. Cadastrar novo item (DVD,Revista)");
        System.out.printf("3. Verificar avaliação do livro");
        System.out.println("0. Sair");

        var opcao = scanner.nextInt();
        scanner.nextLine();

        if(opcao == 1){

        }
    }

}


    public static Livro CadastrarLivro() {
        var novoLivro = new Livro();
        System.out.println("Livro ");
        novoLivro.setNome(scanner.nextLine());

        return novoLivro;
    }
}





