package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Formatador {

    public final String SEPARADOR = "\";\"";
    public final String ASPAS = "\"";

    public String dateParse(String date) {

        String formatoData = "";
        try {
            Date data = new SimpleDateFormat("dd/MM/yyyy").parse(date);
            formatoData = new SimpleDateFormat("yyyyMMdd").format(data);

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return formatoData;

    }


    public String tipoProduto(String tipo) {
        return tipo.substring(0,1);
    }

    public String indicarFilial(String filial) {


        if(filial.equalsIgnoreCase("13995375")) {
            return "00000001";
        }else if(filial.equalsIgnoreCase("13995618")){
            return "00000003";
        }else if(filial.equalsIgnoreCase("17874793")) {
            return "00000004";
        }else if(filial.equalsIgnoreCase("20262973")) {
            return "00000005";
        }else if(filial.equalsIgnoreCase("22049843")) {
            return "00000007";
        }else if(filial.equalsIgnoreCase("23032413")) {
            return "00000008";
        }else if(filial.equalsIgnoreCase("23647906")) {
            return "00000009";
        }else if(filial.equalsIgnoreCase("26059983")) {
            return "00000010";
        }else if(filial.equalsIgnoreCase("38556626")) {
            return "00000011";
        }else if(filial.equalsIgnoreCase("29079829")) {
            return "00000012";
        }else if(filial.equalsIgnoreCase("38556804")) {
            return "00000013";
        }else if(filial.equalsIgnoreCase("38556944")) {
            return "00000014";
        }else if(filial.equalsIgnoreCase("56997183")) {
            return "00000015";
        }else if(filial.equalsIgnoreCase("39023516")) {
            return "00000016";
        }else if(filial.equalsIgnoreCase("40104494")) {
            return "00000017";
        }else if(filial.equalsIgnoreCase("42547180")) {
            return "00000018";
        }else if(filial.equalsIgnoreCase("47850361")) {
            return "00000019";
        }else if(filial.equalsIgnoreCase("53333454")) {
            return "00000020";
        }else if(filial.equalsIgnoreCase("53333713")) {
            return "00000021";
        }else if(filial.equalsIgnoreCase("84255978")) {
            return "00000022";
        }else if(filial.equalsIgnoreCase("73735302")||filial.equalsIgnoreCase("62598384")) {
            return "00000024";
        }else if(filial.equalsIgnoreCase("75324083")) {
            return "00000027";
        }else if(filial.equalsIgnoreCase("87156237")) {
            return "00000029";
        }else {
            return "SEMFILIAL";
        }


    }
}
