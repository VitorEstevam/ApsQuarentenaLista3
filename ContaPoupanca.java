public class ContaPoupanca extends ContaBancaria{
  float limite;

  public ContaPoupanca(int numeroContaAux, float saldoAux, float limiteAux){
    this.setNumeroConta(numeroContaAux);
    this.setSaldo(saldoAux);
    this.setLimite(limiteAux);
  }

  //region set methods
  public void setLimite(float limiteAux){
    this.limite = limiteAux;
  }
  //end region

  //region get methods
  public float getLimite(){
    return this.limite;
  }
  //end region

  public void depositar(float valorAux){
    float saldoAtual = this.getSaldo();

    if(valorAux>0)
      this.setSaldo((saldoAtual+valorAux));
  }

  public void sacar(float valorAux){
    float saldoAtual = this.getSaldo();
    float limiteAtual =this.limite;

    if(valorAux>0 && (saldoAtual+limiteAtual)>valorAux)
      this.setSaldo((saldoAtual-valorAux));
  }
}