public class Main {
    public static void main(String[] args) {


        Conta cc = new ContaCorrente("Kauã Nilton Barbosa");
        Conta poupanca = new ContaPoupanca("Kauã Nilton");

        cc.depositar(1000);
        cc.imprimirInfosComuns();
        cc.transferir(500, poupanca);

        System.out.println();
        cc.imprimirInfosComuns();

        System.out.println();
        poupanca.imprimirInfosComuns();

        Banco.getInstancia().listarClientes();
        System.out.println();
        Banco.getInstancia().retornarInfoDaConta("Kauã Nilton", 2);

    }
}
