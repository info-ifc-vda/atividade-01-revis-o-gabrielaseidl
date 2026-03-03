public class FechaduraInteligente extends Dispositivo implements Conectavel {

    private boolean trancada;
    private boolean conectada;

    public FechaduraInteligente(int id, String localizacao, boolean ligado, boolean trancada) 
    {
        super(id, localizacao, ligado);
        this.trancada = trancada;
    }

    public void funcionar() 
    {
        if (estaLigado()) {
            trancada = !trancada;
            System.out.println("\nFechadura alterou estado. Trancada: " + trancada);
        }
        else 
        {
            System.out.println("\nFechadura desligada.");
        }
    }

    public void conectarWifi()
    {
        conectada = true;
        System.out.println("\nFechadura conectada ao WiFi.");
    }

    public void desconectarWifi()
    {
        conectada = false;
        System.out.println("\nFechadura desconectada.");
    }
}