package exceptions;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void  main(String[] args){

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Pessoa p1 = new Pessoa("Ana",sdf.parse("10/10/2001"));

       p1.verficaDataNascimento();
        } catch (ParseException e) {
            e.getMessage();
        }catch (DataInvalidaException e){
            e.getMessage();
        }

    }
}
