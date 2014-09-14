import javax.swing.*;

/**
 * Created by Luanderson 14/09/2014.
 */
public class questão1
{
    public static void main(String[] args)
    {
        Integer quantidade;
        double valorTotal = 0;
        quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantas maçãs foram compradas"));

        if (quantidade < 12)
        {
            valorTotal = (quantidade * 1.30);
        }
        if (quantidade > 12)
        {
            valorTotal = (quantidade * 1.00);
        }
        JOptionPane.showMessageDialog(null,"O valor é: "+valorTotal);
    }
}
