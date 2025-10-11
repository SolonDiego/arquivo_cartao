package controller;

import model.Formatador;
import model.Titulo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    Formatador o = new Formatador();

    public void salvarArquivo(String entrada, String saida) {
        File file = new File(saida);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("\"0\";\"20220302\";\"183729\";\"20220301\";\"20220302\";\"V3.6\";\"00\";\"20220302183729\";\"000001\"");
            bw.newLine();
            for (String linhas : lerArquivo(entrada)) {
                bw.write(linhas);
                bw.newLine();
                //System.out.println(linhas);
            }
            //bw.write("\"9\";\"1\"");
            bw.close();
            fw.close();
            System.out.println("Arquivo Criado com Sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private List<String> lerArquivo(String entrada) {
        List<String> linha = new ArrayList<String>();
        int i = 1;
        try {
            FileReader file = new FileReader(entrada);
            BufferedReader br = new BufferedReader(file);
            br.readLine();
            while (br.ready()) {
                i+=1;
                linha.add(pegarDados(br.readLine(),i));
            }
            br.close();
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return linha;
    }

    private String pegarDados(String linha, int intertator) {
        Titulo titulo = new Titulo();
        String[] separado = linha.split(";");
        titulo.setRegistro("10");
        titulo.setCodCliente("0");
        titulo.setEstabelecimento(separado[16]);
        titulo.setDataVenda(separado[1]);
        titulo.setResumo(separado[14]);
        titulo.setComprovante(separado[10]);
        titulo.setNsu(separado[10]);
        titulo.setNumeroCartao(separado[17]);
        titulo.setValorBruto(separado[3].replace(".", ""));
        titulo.setTotalParcela(separado[22]);
        titulo.setValorLiquido(separado[7].replace(".", ""));
        titulo.setValorOriginal("");
        titulo.setDataCredito(separado[0]);
        titulo.setDataCreditoOriginal("");
        titulo.setNroParcela(separado[23]);
        titulo.setTipoProduto(separado[20]);
        titulo.setCaptura("0");
        titulo.setRede("3");
        titulo.setBanco(separado[24]);
        titulo.setAgencia(separado[25]);
        titulo.setConta(separado[26]);
        titulo.setValorComissao(separado[6]);
        titulo.setTaxaServico(separado[5].replace("%", ""));
        titulo.setLoja(separado[16]);
        titulo.setCodAutorizacao(separado[13]);
        titulo.setCupomFiscal("");
        titulo.setBandeira(separado[21]);
        titulo.setSequencia(Integer.toString(intertator));
        return titulo.exibirLinha();
    }

//	private String titulo() {
//		StringBuilder titulo = new StringBuilder();
//		titulo.append(o.ASPAS);
//		titulo.append("FILIAL");
//		titulo.append(o.SEPARADOR);
//		titulo.append("CPF");
//		titulo.append(o.SEPARADOR);
//		titulo.append("NOME");
//		titulo.append(o.SEPARADOR);
//		titulo.append("ANIVERSARIO");
//		titulo.append(o.SEPARADOR);
//		titulo.append("ENDERECO");
//		titulo.append(o.SEPARADOR);
//		titulo.append("NUMERO");
//		titulo.append(o.SEPARADOR);
//		titulo.append("COMPLEMENTO");
//		titulo.append(o.SEPARADOR);
//		titulo.append("BAIRRO");
//		titulo.append(o.SEPARADOR);
//		titulo.append("CIDADE");
//		titulo.append(o.SEPARADOR);
//		titulo.append("UF");
//		titulo.append(o.SEPARADOR);
//		titulo.append("CEP");
//		titulo.append(o.SEPARADOR);
//		titulo.append("TELEFONE1");
//		titulo.append(o.SEPARADOR);
//		titulo.append("TELEFONE2");
//		titulo.append(o.SEPARADOR);
//		titulo.append("E-MAIL");
//		titulo.append(o.SEPARADOR);
//		titulo.append("STATUS");
//		titulo.append(o.SEPARADOR);
//		titulo.append("STATUS COMPLEMENTO");
//		titulo.append(o.SEPARADOR);
//		titulo.append("QTD PARCELAS");
//		titulo.append(o.SEPARADOR);
//		titulo.append("TAXA");
//		titulo.append(o.SEPARADOR);
//		titulo.append("VALOR");
//		titulo.append(o.SEPARADOR);
//		titulo.append("VALOR PARCELA");
//		titulo.append(o.SEPARADOR);
//		titulo.append("FAIXA IDADE");
//		titulo.append(o.SEPARADOR);
//		titulo.append("SEXO");
//		titulo.append(o.SEPARADOR);
//		titulo.append("FAIXA RENDA");
//		titulo.append(o.ASPAS);
//		return titulo.toString();
//	}
}
