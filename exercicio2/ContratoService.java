package exercicio2;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ContratoService {

    private  PagamentoOnline pagamentoOnline;

    public ContratoService(PagamentoOnline pagamentoOnline){
     this.pagamentoOnline = pagamentoOnline;

    }
    public void processaContrato(Contrato contrato, int meses) {


        double parcela = contrato.getValorTotal() / meses;

        for (int i = 1; i <= meses; i++) {
            Date data = addMonths(contrato.getDataContrato(), i);
            SimpleDateFormat sdf = new SimpleDateFormat("dd//MM/yyyy");
            String data_formatada = sdf.format(data);

            System.out.println("Valor da parcela: " + parcela + "Vencimentos :" + data_formatada);

        }
    }

       private Date addMonths(Date date, int n){
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            cal.add(Calendar.MONTH, n);
            return cal.getTime();

        }

    }

