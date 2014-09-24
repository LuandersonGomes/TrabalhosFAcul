package questã026;

import javax.swing.*;

/**
 * Created by Luciana-Pc on 24/09/2014.
 */
public class quetao26
{
    public static void main(String[] Args)
    {
        double[] valorProduto = new double[6];
        valorProduto[0] = 1.20;
        valorProduto[1] = 1.30;
        valorProduto[2] = 1.50;
        valorProduto[3] = 1.20;
        valorProduto[4] = 1.30;
        valorProduto[5] = 1.00;
        double[] codigoProduto = new double[6];
        codigoProduto[0] = 100;
        codigoProduto[1] = 101;
        codigoProduto[2] = 102;
        codigoProduto[3] = 103;
        codigoProduto[4] = 104;
        codigoProduto[5] = 105;

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
        if (codFor == codigoProduto[5])
        {
            valorTotal = valorProduto[5] * quantidade;
            JOptionPane.showMessageDialog(null,"Valor Total: R$ "+valorTotal);
        }
    }
}
