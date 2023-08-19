package exe3;

public class Main {
    public static void main(String[] args) {
        ContaPoupanca ContaPoupanca = new ContaPoupanca(0, "Brasil", "null", 500);
        ContaCorrente ContaCorrente = new ContaCorrente(2, "Bradesco", "Bruno", 2000);
        
        
        ContaPoupanca.depositar(50);
        System.out.println("--------------------");
        ContaPoupanca.sacar(20);
        System.out.println("--------------------");
        ContaCorrente.depositar(50);
        System.out.println("--------------------");
        ContaCorrente.sacar(20);
        System.out.println("--------------------");
        ContaPoupanca.investimento();
        System.out.println("--------------------");
        ContaCorrente.investimento();

    }
}
