package questão27;

import javax.swing.*;

/**
 * Created by Luanderson 24/09/2014.
 */
public class Questão27
{
    public static void main(String[] Args)
    {
        double credito;
        Integer saldoMedio  = Integer.parseInt(JOptionPane.showInputDialog("Digite seu saldo medio"));

        if (saldoMedio <= 200)
        {
            JOptionPane.showMessageDialog(null,"Saldo medio:"+saldoMedio+" Cliente não possui credito");

        }
        if (saldoMedio > 200 && saldoMedio <= 400 )
        {
            credito = (saldoMedio * 20) / 100;
            JOptionPane.showMessageDialog(null,"Saldo medio:"+saldoMedio+" valor do Crédito: "+credito);
        }
        if (saldoMedio > 400 && saldoMedio <= 600 )
        {
            credito = (saldoMedio * 40) / 100;
            JOptionPane.showMessageDialog(null,"Saldo medio:"+saldoMedio+" valor do Crédito: "+credito);
        }
        if (saldoMedio > 600)
        {
            credito = (saldoMedio * 60) / 100;
            JOptionPane.showMessageDialog(null,"Saldo medio:"+saldoMedio+" valor do Crédito: "+credito);
        }


    }
}
