//Vamos criar um exemplo de uma classe para representar uma SmartTv onde:
//1. Ela tenha as características: ligada(boolean), canal(int) e volume(int)
//2. Nossa TV poderá ligar e desligar e assim mudar o estado ligada
//3. Nossa Tv aumentará e diminuirá o volume sempre em +1 ou -1
//4. Nossa TV poderá mudar de canal de 1 em 1 ou definindo o número correspondente

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para " + volume);
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;

    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para " + volume);
    }

    public void aumentarCanal(){
        canal++;

    }

    public void diminuirCanal(){
        canal--;

    }
    
}
