public class CameraSeguranca extends Dispositivo implements Conectavel, Monitoravel, Atualizavel {

    private boolean gravando;
    private boolean conectado;

    public CameraSeguranca(int id, String localizacao, boolean ligado, boolean gravando)
    {
        super(id, localizacao, ligado);
        this.gravando = gravando;
    }

    public void funcionar()
    {
        if (estaLigado()) {
            gravando = true;
            System.out.println("\nCamera esta gravando.");
        } else {
            System.out.println("\nCamera desligada.");
        }
    }

    public void conectarWifi()
    {
        conectado = true;
        System.out.println("\nCamera conectada ao WiFi.");
    }

    public void desconectarWifi()
    {
        conectado = false;
        System.out.println("\nCamera desconectada.");
    }

    public void gerarRelatorio()
    {
        System.out.println("\nStatus de gravacao: " + gravando);
    }

    public void atualizarFirmware()
    {
        System.out.println("\nFirmware atualizado com sucesso!");
    }
}