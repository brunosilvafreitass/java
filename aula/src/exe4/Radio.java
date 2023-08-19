package exe4;

public class Radio implements IDevice {

    private boolean LigarDesligar;
    private int volume;
    private int estacao;

    

    public Radio(int volume, int estacao) {
        this.LigarDesligar = false;
        this.volume = volume;
        this.estacao = estacao;
    }


    @Override
    public void Desligar() {
        this.LigarDesligar = false;
        System.out.println("Radio desligada.");
        
    }

    @Override
    public void Ligar() {
        this.LigarDesligar = true;
        System.out.println("Radio ligada.");
        
    }

    @Override
    public void AumentarVolume() {
        if (this.LigarDesligar && this.volume < 100) {
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
        if (this.LigarDesligar && this.estacao < 1000) {
            this.estacao += 10;
            System.out.println("Estacao trocado para " + this.estacao + ".");
        }
        
    }

    
    
}
