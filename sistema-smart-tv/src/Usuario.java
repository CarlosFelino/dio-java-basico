public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        //diminui o volume para 22 e depois aumenta para 23
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        //mostra canal padrão e depois o canal definido
        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Canal atual: " + smartTv.canal);


        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Volume atual: " + smartTv.volume);

        //Ligando e desligando a tv
        smartTv.ligar();
        System.out.println("Novo Status - TV ligada? " + smartTv.ligada);
        smartTv.desligar();
        System.out.println("Novo Status - TV ligada? " + smartTv.ligada);
    }
    
}
