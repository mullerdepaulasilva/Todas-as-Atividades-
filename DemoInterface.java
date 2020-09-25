public class DemoInterface {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();

        cc.deposita(500);
        cp.deposita(500);

        cc.saca(100);
        cp.saca(150);

        GeradoDeExtrato extrato = new GeradoDeExtrato();
        extrato.geraExtrato(cc);
        extrato.geraExtrato(cp);

    }

}
