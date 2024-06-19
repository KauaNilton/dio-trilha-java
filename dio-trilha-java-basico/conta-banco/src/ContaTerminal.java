import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo = 200;

        System.out.println("Por favor, digite o seu nome!");
        System.out.print("Nome: ");
        nomeCliente = in.nextLine();

        System.out.println("Por favor, digite o número da Agência!");
        System.out.print("n. Agência: ");
        agencia = in.nextLine();

        System.out.println("Por favor, digite o número da conta!");
        System.out.print("n. Conta: ");
        numero = in.nextInt();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s," +
                " Conta %d e o seu saldo de R$%.2f já está disponível para saque!", nomeCliente, agencia, numero, saldo);

        in.close();

    }
}