public class Termostato extends Dispositivo implements Conectavel, Monitoravel {

    private double temperaturaAlvo;
    private double temperaturaAtual;
    private boolean conectado;

    public Termostato(int id, String localizacao, boolean ligado, double temperaturaAlvo, double temperaturaAtual) 
    {
        super(id, localizacao, ligado);
        this.temperaturaAlvo = temperaturaAlvo;
        this.temperaturaAtual = temperaturaAtual;
    }

    public void funcionar() 
    {
        if (estaLigado()) {
            System.out.println("\nAjustando temperatura para " + temperaturaAlvo + " C");
        } else {
            System.out.println("\nTermostato desligado.");
        }
    }

    public void conectarWifi() 
    {
        conectado = true;
        System.out.println("\nTermostato conectado ao WiFi.");
    }

    public void desconectarWifi() 
    {
        conectado = false;
        System.out.println("\nTermostato desconectado.");
    }

    public void gerarRelatorio() 
    {
        System.out.println("\nTemperatura atual: " + temperaturaAtual +
                           " C | Temperatura alvo: " + temperaturaAlvo + " C");
    }
}