public class LampadaInteligente extends Dispositivo implements Conectavel, Agendavel {

    private String cor;
    private int intensidade;
    private boolean conectada;
    private String atividadeAgendada;

    public LampadaInteligente(int id, String localizacao, boolean ligado, String cor, int intensidade) 
    {
        super(id, localizacao, ligado);
        this.cor = cor;
        this.intensidade = intensidade;
    }

    public void funcionar() 
    {
        if (estaLigado()) {
            System.out.println("\nLampada funcionando na cor "+cor+" com intensidade "+intensidade+"%");
        }
        else 
        {
            System.out.println("\nA lampada esta desligada.");
        }
    }

    public void conectarWifi() 
    {
        conectada = true;
        System.out.println("\nLampada conectada ao WiFi.");
    }

    public void desconectarWifi() 
    {
        conectada = false;
        System.out.println("\nLampada desconectada do WiFi.");
    }

    public void agendarAtividade(String atividade) 
    {
        atividadeAgendada = atividade;
        System.out.println("\nAtividade agendada: " + atividade);
    }

    public void cancelarAgendamento() 
    {
        atividadeAgendada = null;
        System.out.println("\nAgendamento cancelado.");
    }
}