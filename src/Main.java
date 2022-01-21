public class Main {
    public static void main(String[] args) {

        Cliente alysson = new Cliente();
        alysson.setNome("Alysson");

        Conta cc = new ContaCorrente(alysson);
        cc.depositar(100);
        cc.depositar(100);

        Conta poupanca = new ContaPoupanca(alysson);
        cc.transferir(50, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
