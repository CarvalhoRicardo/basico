import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class AboutMe {
    public static void main(String[] args){
        try{
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu primeiro nome: ");

            String nome = scanner.nextLine();

        System.out.println("Agora digite seu sobrenome: ");

            String sobrenome = scanner.nextLine();        
        
        System.out.println("Sua idade: "); 
        
            int idade = scanner.nextInt();

        System.out.println("Digite altura: ");

            double altura = scanner.nextDouble();

        System.out.println("ÓLa " + nome + " " + sobrenome);
        System.out.println("Você tem " + idade + " anos e " + altura + " cm de altura");

        scanner.close();
        }
        catch(InputMismatchException e){
            System.out.println("Os campos 'idade' e 'altura' precisam ter valores númericos");
        }
    }
}
