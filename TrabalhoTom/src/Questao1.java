import javax.swing.*;

/**
 * Created by Luanderson 14/09/2014.
 */
public class Questao1
{
    public static void main(String[] args)
    {
        Integer quantidade;
        double valorTotal = 0;
        double valorMaca1 = 1.00;
        double valorMaca2 = 1.30;


        quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantas maçãs foram compradas"));

        if (quantidade < 12)
        {
            valorTotal = (quantidade * valorMaca2);
        }
        if (quantidade >= 12)
        {
            valorTotal = (quantidade * valorMaca1);
        }
        JOptionPane.showMessageDialog(null,"O valor é: "+valorTotal);

    }

}
