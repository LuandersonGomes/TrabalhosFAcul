package questao20;

import javax.swing.*;

/**
 * Created by Luanderson on 24/09/2014.
 */
public class questao20
{
    public static void main(String[] Args)
    {
        String nomes[] = new String[10];
        String nomeSolic;

        for (int i = 0; i < 10; i++)
        {
            nomes[i] = JOptionPane.showInputDialog("Digite um nome para ser gravado");
        }
        nomeSolic = JOptionPane.showInputDialog("Digite o nome que deseja pesquisar");
        for (int i = 0; i < 10; i++)
        {
            if (nomeSolic.equals(nomes[i]))
            {
                JOptionPane.showMessageDialog(null,"Achei");

            }
        }
        JOptionPane.showMessageDialog(null,"não achei");

    }
}
