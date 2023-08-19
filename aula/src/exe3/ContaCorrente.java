package exe3;

public class ContaCorrente extends Conta implements IConta {

    private double saldoc =  0.03;  

    public ContaCorrente(int numero, String agencia, String titular, double saldo) {
        super(numero, agencia, titular, saldo);
    }

    @Override
    public void investimento() {
        depositar(saldo * saldoc);
    }

    public double getSaldoc() {
        return saldoc;
    }



    
}
