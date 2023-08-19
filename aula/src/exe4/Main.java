package exe4;

public class Main {
    public static void main(String[] args) {

        TV tv = new TV(5, 3);
        Radio radio = new Radio(10, 0);


        tv.Ligar();
        tv.AumentarVolume();
        tv.ReduzirVolume();
        tv.TrocarCanal();
        tv.Desligar();
        System.out.println("---------------");
        radio.Ligar();
        radio.AumentarVolume();
        radio.ReduzirVolume();
        radio.TrocarCanal();
        radio.Desligar();



    }
}
