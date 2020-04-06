public abstract class ContaBancaria{
  int numeroConta;
  float saldo;

  public abstract void sacar(float valorAux);
  public abstract void depositar(float valorAux);

//region set methods
  public void setNumeroConta(int numeroContaAux){
    this.numeroConta = numeroContaAux;
  }
  public void setSaldo(float saldoAux){
    this.saldo = saldoAux;
  }
//end region

//region get methods
  public int getNumeroConta(){
    return this.numeroConta;
  }
  public float getSaldo(){
    return this.saldo;
  }
//end region
}