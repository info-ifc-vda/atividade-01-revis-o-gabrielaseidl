import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) 
    {
        ArrayList<Dispositivo> lista = new ArrayList<>();

        LampadaInteligente lampada = new LampadaInteligente(1, "Quarto", false, "Amarela", 75);

        Termostato termostato = new Termostato(2, "Sala", false, 22, 25);

        CameraSeguranca camera = new CameraSeguranca(3, "Quintal", false, false);

        FechaduraInteligente fechadura = new FechaduraInteligente(4, "Porta", false, true);

        lista.add(lampada);
        lista.add(termostato);
        lista.add(camera);
        lista.add(fechadura);

        for (int i = 0; i < lista.size(); i++)
        {
                lista.get(i).ligar();
                lista.get(i).funcionar();
                lista.get(i).exibirStatus();
        }
    }
}