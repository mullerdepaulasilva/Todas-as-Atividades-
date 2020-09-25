package exercicio2;

public interface PagamentoOnline {

    double taxaDepagamento(double valor);
    double juros(double valor, int meses);

}
