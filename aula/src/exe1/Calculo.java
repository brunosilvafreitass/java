package exe1;

public class Calculo implements ICalculo{
    public double areaq(double lado) {
        return lado * lado;
    }

    public double areat(double base, double altura) {
        return (base * altura) / 2;
    }

    public double areac(double raio) {
        return Math.PI * raio * raio;
    }
    
}
