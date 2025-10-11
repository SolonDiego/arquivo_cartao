package model;

public class Titulo {

    Formatador f = new Formatador();

    private String registro;
    private String codCliente;
    private String estabelecimento;
    private String dataVenda;
    private String resumo;
    private String comprovante;
    private String nsu;
    private String numeroCartao;
    private String valorBruto;
    private String totalParcela;
    private String valorLiquido;
    private String valorOriginal;
    private String dataCredito;
    private String dataCreditoOriginal;
    private String nroParcela;
    private String tipoProduto;
    private String captura;
    private String rede;
    private String banco;
    private String agencia;
    private String conta;
    private String valorComissao;
    private String taxaServico;
    private String loja;
    private String codAutorizacao;
    private String cupomFiscal;
    private String bandeira;
    private String sequencia;

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(String codCliente) {
        this.codCliente = codCliente;
    }

    public String getEstabelecimento() {
        return estabelecimento;
    }

    public void setEstabelecimento(String estabelecimento) {
        this.estabelecimento = String.format("%015d", Long.parseLong(estabelecimento));
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = f.dateParse(dataVenda);
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = String.format("%09d", Long.parseLong(resumo));
    }

    public String getComprovante() {
        return comprovante;
    }

    public void setComprovante(String comprovante) {
        this.comprovante = String.format("%012d", Long.parseLong(comprovante));
    }

    public String getNsu() {
        return nsu;
    }

    public void setNsu(String nsu) {
        this.nsu = nsu;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getValorBruto() {
        return valorBruto;
    }

    public void setValorBruto(String valorBruto) {
        this.valorBruto = valorBruto.replace(",", "");
    }

    public String getTotalParcela() {
        return totalParcela;
    }

    public void setTotalParcela(String totalParcela) {
        this.totalParcela = String.format("%02d", Long.parseLong(totalParcela));
    }

    public String getValorLiquido() {
        return valorLiquido;
    }

    public void setValorLiquido(String valorLiquido) {
        this.valorLiquido = valorLiquido.replace(",", "");
    }

    public String getValorOriginal() {
        return valorOriginal;
    }

    public void setValorOriginal(String valorOriginal) {
        this.valorOriginal = valorOriginal;
    }

    public String getDataCredito() {
        return dataCredito;
    }

    public void setDataCredito(String dataCredito) {
        this.dataCredito = f.dateParse(dataCredito);
    }

    public String getDataCreditoOriginal() {
        return dataCreditoOriginal;
    }

    public void setDataCreditoOriginal(String dataCreditoOriginal) {
        this.dataCreditoOriginal = dataCreditoOriginal;
    }

    public String getNroParcela() {
        return nroParcela;
    }

    public void setNroParcela(String nroParcela) {
        this.nroParcela = String.format("%02d", Long.parseLong(nroParcela));
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = f.tipoProduto(tipoProduto);
    }

    public String getCaptura() {
        return captura;
    }

    public void setCaptura(String captura) {
        this.captura = captura;
    }

    public String getRede() {
        return rede;
    }

    public void setRede(String rede) {
        this.rede = rede;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getValorComissao() {
        return valorComissao;
    }

    public void setValorComissao(String valorComissao) {
        this.valorComissao = valorComissao.replace(",", "");
    }

    public String getTaxaServico() {
        return taxaServico;
    }

    public void setTaxaServico(String taxaServico) {
        this.taxaServico = taxaServico.replace(",", "");
    }

    public String getLoja() {
        return loja;
    }

    public void setLoja(String loja) {
        this.loja = f.indicarFilial(loja);
    }

    public String getCodAutorizacao() {
        return codAutorizacao;
    }

    public void setCodAutorizacao(String codAutorizacao) {
        this.codAutorizacao = codAutorizacao;
    }

    public String getCupomFiscal() {
        return cupomFiscal;
    }

    public void setCupomFiscal(String cupomFiscal) {
        this.cupomFiscal = cupomFiscal;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public String getSequencia() {
        return sequencia;
    }

    public void setSequencia(String sequencia) {
        this.sequencia = String.format("%06d", Long.valueOf(sequencia));
    }

    public String exibirLinha() {
        StringBuilder linha = new StringBuilder();
        linha.append(f.ASPAS);
        linha.append(getRegistro());
        linha.append(f.SEPARADOR);
        linha.append(getCodCliente());
        linha.append(f.SEPARADOR);
        linha.append(getEstabelecimento());
        linha.append(f.SEPARADOR);
        linha.append(getDataVenda());
        linha.append(f.SEPARADOR);
        linha.append(getResumo());
        linha.append(f.SEPARADOR);
        linha.append(getComprovante());
        linha.append(f.SEPARADOR);
        linha.append(getNsu());
        linha.append(f.SEPARADOR);
        linha.append(getNumeroCartao());
        linha.append(f.SEPARADOR);
        linha.append(getValorBruto());
        linha.append(f.SEPARADOR);
        linha.append(getTotalParcela());
        linha.append(f.SEPARADOR);
        linha.append(getValorLiquido());
        linha.append(f.SEPARADOR);
        linha.append(getValorOriginal());
        linha.append(f.SEPARADOR);
        linha.append(getDataCredito());
        linha.append(f.SEPARADOR);
        linha.append(getDataCreditoOriginal());
        linha.append(f.SEPARADOR);
        linha.append(getNroParcela());
        linha.append(f.SEPARADOR);
        linha.append(getTipoProduto());
        linha.append(f.SEPARADOR);
        linha.append(getCaptura());
        linha.append(f.SEPARADOR);
        linha.append(getRede());
        linha.append(f.SEPARADOR);
        linha.append(getBanco());
        linha.append(f.SEPARADOR);
        linha.append(getAgencia());
        linha.append(f.SEPARADOR);
        linha.append(getConta());
        linha.append(f.SEPARADOR);
        linha.append(getValorComissao());
        linha.append(f.SEPARADOR);
        linha.append(getTaxaServico());
        linha.append(f.SEPARADOR);
        linha.append(getLoja());
        linha.append(f.SEPARADOR);
        linha.append(getCodAutorizacao());
        linha.append(f.SEPARADOR);
        linha.append(getCupomFiscal());
        linha.append(f.SEPARADOR);
        linha.append(getBandeira());
        linha.append(f.SEPARADOR);
        linha.append(getSequencia());
        linha.append(f.ASPAS);
        return linha.toString();
    }

}
