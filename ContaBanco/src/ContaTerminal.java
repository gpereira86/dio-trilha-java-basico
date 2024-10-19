import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o seu Nome:");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite a sua agência:");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número de sua conta:");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o seu saldo:");
        double saldo = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nomeCliente, agencia, numero, saldo);
    }
}
