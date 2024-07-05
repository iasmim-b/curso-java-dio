import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main (String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá, seja bem vindo! Me diga seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o número da sua conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Agora digite o numero da sua agência com o dígito: ");
        String agencia = scanner.next();

        System.out.println("Qual valor você gostaria de depositar inicialmente na sua conta? ");
        double saldo = scanner.nextDouble();

        System.out.println(" " + nomeCliente +", obrigada por criar uma conta em nosso banco!");
        System.out.println(" Sua conta é: " + numeroConta + ", agência: " + agencia + ", ");
        System.out.println( "e seu saldo de R$ " + saldo + " já esta disponivel para saque! ");

    }
}