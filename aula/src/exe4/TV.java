package exe4;

public class TV implements IDevice {
    private boolean LigarDesligar;
    private int volume;
    private int canal;

    public TV(int volume, int canal) {
        this.LigarDesligar = false;
        this.volume = volume;
        this.canal = canal;
    }

    @Override
    public void Ligar() {
        this.LigarDesligar = true;
        System.out.println("TV ligada.");
    }

    @Override
    public void Desligar() {
        this.LigarDesligar = false;
        System.out.println("TV desligada.");
    }

    @Override
    public void AumentarVolume() {
        if (this.LigarDesligar && this.volume < 10) {
            this.volume++;
            System.out.println("Volume aumentado para " + this.volume + ".");
        }
    }

    @Override
    public void ReduzirVolume() {
        if (this.LigarDesligar && this.volume > 0) {
            this.volume--;
            System.out.println("Volume reduzido para " + this.volume + ".");
        }
    }

    @Override
    public void TrocarCanal() {
        if (this.LigarDesligar && this.canal < 50) {
            this.canal++;
            System.out.println("Canal trocado para " + this.canal + ".");
        }
    }
}