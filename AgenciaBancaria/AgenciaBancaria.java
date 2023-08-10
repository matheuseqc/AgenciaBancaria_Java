import java.util.ArrayList;
import java.util.List;

public class AgenciaBancaria {
    private String numeroAgencia;
    private List<ContaBancaria> contas;

    public AgenciaBancaria(String numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
        this.contas = new ArrayList<>();
    }

    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    public void adicionarConta(ContaBancaria conta) {
        contas.add(conta);
    }

    public void removerConta(ContaBancaria conta) {
        contas.remove(conta);
    }

    public void listarContas() {
        System.out.println("Contas da agência " + numeroAgencia + ":");
        for (ContaBancaria conta : contas) {
            System.out.println("Número da conta: " + conta.getNumeroConta());
            System.out.println("Titular: " + conta.getNomeTitular());
            System.out.println("Saldo: " + conta.getSaldo());
            System.out.println("-------------------------");
        }
    }
}
