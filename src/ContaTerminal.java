import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {


    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);

        String nome;
        float saldo;
        String agencia;
        int numero;

        try(Scanner sc = new Scanner(System.in)){

            System.out.print("Por favor, digite o numero da agencia: ");
            numero = sc.nextInt();
            sc.nextLine();

            System.out.print("Por favor digite a conta: ");
            agencia = sc.nextLine();

            System.out.print("Por favor, digite seu nome: ");
            nome = sc.nextLine();

            System.out.print("Por favor informe seu saldo: ");
            saldo = sc.nextFloat();

            String msg = "";
            msg += "Olá "+nome+", obrigado por abrir uma conta em nosso banco, ";
            msg += "sua agência é "+agencia+", ";
            msg += "conta "+numero+" ";
            msg += "e seu saldo "+saldo+" já está disponivel para saque";

            System.out.println(msg);

        }catch(NumberFormatException ex){
            System.out.println("Erro de formatação do dado digitado!\n"+ex.getMessage());
        }catch(InputMismatchException ex){
            System.out.println("Dado inválido!\n"+ex.getMessage());
        }

    }
}
