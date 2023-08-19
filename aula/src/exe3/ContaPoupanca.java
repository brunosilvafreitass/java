package exe3;

public class ContaPoupanca extends Conta implements IConta {

    private double saldop = 0.05;

    public ContaPoupanca(int numero, String agencia, String titular, double saldo) {
        super(numero, agencia, titular, saldo);
    }


    @Override
    public void investimento() {
        depositar(saldo * saldop);
    }


    public double getSaldop() {
        return saldop;
    }




}
