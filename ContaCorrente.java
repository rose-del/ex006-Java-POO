public class ContaCorrente {

    int numeroDaConta;
    Double saldo;
    String titularDaConta;

    public ContaCorrente(int numeroDaConta, Double saldo, String titularDaConta){
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
        this.titularDaConta = titularDaConta;

    }

    //Nós usamos o 'void' quando queremos que o método execute alguma ação, mas não precisamos de um valor de retorno.
    public void depositar(Double deposito) {
        saldo += deposito;
    }

    public void sacar(Double saque) {
        saldo -= saque;
    }

    public Double getExibirSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return String.format("\nConta: %d \nSaldo: %.2f \nTitular: %s", numeroDaConta, saldo, titularDaConta);
    }
}
