public class ContaCorrente extends ContaBancaria{
  float taxaOperacao;

  public ContaCorrente(int numeroContaAux, float saldoAux, float taxaOperacaoAux){
    this.setNumeroConta(numeroContaAux);
    this.setSaldo(saldoAux);
    this.setTaxaOperacao(taxaOperacaoAux);
  }

//region set methods
  public void setTaxaOperacao(float taxaOperacaoAux){
    this.taxaOperacao = taxaOperacaoAux;
  }
//end region

//region get methods
  public float getTaxaOperacao(){
    return this.taxaOperacao;
  }
//end region

  public void depositar(float valorAux){
    float saldoAtual = this.getSaldo();
    float taxaAtual =this.taxaOperacao;

    if(valorAux>0 && valorAux>this.taxaOperacao)
      this.setSaldo((saldoAtual+valorAux)-taxaAtual);
  }

  public void sacar(float valorAux){
    float saldoAtual = this.getSaldo();
    float taxaAtual =this.taxaOperacao;

    if(valorAux>0 && saldoAtual>(valorAux+this.taxaOperacao))
      this.setSaldo((saldoAtual-valorAux)-taxaAtual);
  }

}