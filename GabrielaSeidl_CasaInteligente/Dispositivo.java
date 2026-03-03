public abstract class Dispositivo {
    private int id;
    private String localizacao;
    private boolean ligado;

    public Dispositivo(int id, String localizacao, boolean ligado) 
    {
        this.id = id;
        this.localizacao = localizacao;
        this.ligado = ligado;
    }

    public void ligar() 
    {
        if (!ligado) {
            ligado = true;
            System.out.println("\nDispositivo ligado com sucesso!");
        }
        else
        {
            System.out.println("\nO dispositivo ja esta ligado.");
        }
    }

    public void desligar() 
    {
        if (ligado) {
            ligado = false;
            System.out.println("\nDispositivo desligado com sucesso!");
        } else {
            System.out.println("\nO dispositivo ja esta desligado.");
        }
    }

    public void exibirStatus() 
    {
        System.out.println("\n===========================");
        System.out.println("ID: " + id);
        System.out.println("Localizacao: " + localizacao);
        System.out.println("Ligado: " + ligado);
        System.out.println("===========================\n");
    }

    public boolean estaLigado() 
    {
        return ligado;
    }

    public abstract void funcionar();
}