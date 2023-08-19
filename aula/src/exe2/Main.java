package exe2;

public class Main {
    public static void main(String[] args) {

        CaclularAbstrato calculo = new CaclularAbstrato();

        System.out.println("quadrado: " + calculo.areaq(4)); 
        System.out.println("triângulo: " + calculo.areat(3, 5)); 
        System.out.println("circunferência: " + calculo.areac(5)); 

    }
    
}
