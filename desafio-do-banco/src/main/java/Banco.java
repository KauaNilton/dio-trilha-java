import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Banco {
    private static final String NOME_DO_BANCO = "Banco DIO";
    private static final String CONTA_CORRENTE = "Conta Corrente";
    private static final String CONTA_POUPANCA = "Conta Poupança";
    private static Banco instancia;
    private final String nome = NOME_DO_BANCO;
    private List<Conta> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }

    public static Banco getInstancia() {
        if (instancia == null) {
            instancia = new Banco();
        }
        return instancia;
    }

    public void atualizarListaDeContas(Conta conta) {
        contas.add(conta);
    }

    public void retornarInfoDaConta(String nome, int numero) {
        boolean contaEncontrada = false;
        String tipoDaConta;
        for (Conta conta : contas) {
            if (conta.getNumero() == numero && conta.getCliente().getNome().equals(nome)) {
                if (conta instanceof ContaCorrente) tipoDaConta = CONTA_CORRENTE;
                else tipoDaConta = CONTA_POUPANCA;

                System.out.println("=== " + this.nome + " ===" + "\n" + tipoDaConta);
                conta.imprimirInfosComuns();
                contaEncontrada = true;
                break;
            }
        }
        if (!contaEncontrada) System.out.println("Cliente não encontrado.");
    }


    public void listarClientes() {
        System.out.printf("===   Lista de clientes %s   ===\n", this.nome);
        for (Conta c : contas) {
            System.out.println(String.format("Cliente: %s | Número: %d | Agência: %d",
                    c.getCliente().getNome(), c.getNumero(), c.getAgencia()));
        }
    }
}

