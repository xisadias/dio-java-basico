import java.util.Scanner;
import java.util.InputMismatchException;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua conta: ");
        int conta = scanner.nextInt();
        
        System.out.println("Digite sua agência: ");
        String agencia = scanner.next();

        System.out.println("Digite seu nome completo: ");
        String nome = scanner.next();

        System.out.println("Seu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Ola "+ nome + "!Obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua conta é " + conta + " agência " + agencia +  "e seu saldo R$" + saldo + " já está disponível para saque ");





    }
}
