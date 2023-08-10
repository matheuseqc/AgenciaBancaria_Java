public class Main {
    public static void main(String[] args) {
        AgenciaBancaria agencia = new AgenciaBancaria("001");

        ContaBancaria conta1 = new ContaBancaria("12345", "João", 1000.0);
        ContaBancaria conta2 = new ContaBancaria("54321", "Maria", 1500.0);

        agencia.adicionarConta(conta1);
        agencia.adicionarConta(conta2);

        conta1.depositar(500.0);
        conta2.sacar(200.0);

        agencia.listarContas();
    }
}