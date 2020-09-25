package exercicio2;

public class Paypal implements  PagamentoOnline {


    private static final double PORCENTAGEM_TAXA = 0.02;
    private static final double JUROS_MENSAIS = 0.01;

    @Override
    public double taxaDepagamento(double valor) {
        return valor * PORCENTAGEM_TAXA;
}
    @Override
    public double juros(double valor, int meses) {
        return  valor * JUROS_MENSAIS * meses;


    }
}
