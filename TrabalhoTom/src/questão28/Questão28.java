package questão28;

import javax.swing.*;

/**
 * Created by Luanderson-Pc on 24/09/2014.
 */
public class Questão28
{
    public static void main(String[] Args)
    {
        double[] valorProduto = new double[5];
        valorProduto[0] = 5.32;
        valorProduto[1] = 6.45;
        valorProduto[2] = 2.37;
        valorProduto[3] = 5.32;
        valorProduto[4] = 6.45;
        double[] codigoProduto = new double[5];
        codigoProduto[0] = 1001;
        codigoProduto[1] = 1324;
        codigoProduto[2] = 6548;
        codigoProduto[3] = 987;
        codigoProduto[4] = 7623;

        double valorTotal;

        double codFor = Integer.parseInt(JOptionPane.showInputDialog("Digite o Codigo do Produto"));
        double quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade comprada"));

        if (codFor == codigoProduto[0])
        {
            valorTotal = valorProduto[0] * quantidade;
            JOptionPane.showMessageDialog(null,"Valor Total: R$ "+valorTotal);
        }

        if (codFor == codigoProduto[1])
        {
            valorTotal = valorProduto[1] * quantidade;
            JOptionPane.showMessageDialog(null,"Valor Total: R$ "+valorTotal);
        }

        if (codFor == codigoProduto[2])
        {
            valorTotal = valorProduto[2] * quantidade;
            JOptionPane.showMessageDialog(null,"Valor Total: R$ "+valorTotal);
        }

        if (codFor == codigoProduto[3])
        {
            valorTotal = valorProduto[3] * quantidade;
            JOptionPane.showMessageDialog(null,"Valor Total: R$ "+valorTotal);
        }

        if (codFor == codigoProduto[4])
        {
            valorTotal = valorProduto[4] * quantidade;
            JOptionPane.showMessageDialog(null,"Valor Total: R$ "+valorTotal);
        }
    }
}
