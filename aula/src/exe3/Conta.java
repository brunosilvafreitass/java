package exe3;

public abstract class Conta {
    public int numero;
    public String agencia;
    public String titular;
    public double saldo;

    public Conta(int numero, String agencia, String titular, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor){
        saldo += valor;
        imprimir();
    }

    public void sacar(double valor){
        saldo -= valor;
        imprimir();
    }

    public abstract void investimento();

    public void imprimir(){
        System.out.println("Conta: " + numero);
        System.out.println("Agencia: " + agencia);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }
}
