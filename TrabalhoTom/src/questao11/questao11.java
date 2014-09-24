package questao11;

import javax.swing.*;

/**
 * Created by Luanderson on 24/09/2014.
 */
public class questao11
{
    public static void main(String[] Args)
    {
        Integer numeros[] = new Integer[30];
        Integer numerosolic;
        Integer total = 0;

        for (int i = 0; i < 30; i++)
        {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero para ser gravado"));
        }
        numerosolic = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero que deseja pesquisar"));
        for (int i = 0; i < 30; i++)
        {
            if (numerosolic.equals(numeros[i]))
            {
                total = total + 1;


            }
        }
        JOptionPane.showMessageDialog(null, "Numero se repete:"+total+" Vezes");
    }
}
