package questao24;

import javax.swing.*;

/**
 * Created by Luanderson on 24/09/2014.
 */
public class Questao24
{
    public static void main(String[] Args)
    {
        double valorGasolina = 3.30;
        double valorAlcool = 2.90;
        double descontoAlcool;
        double descontoGasolina;
        double valorTotal;


        double litros = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de litros:"));
        String tipoCombustivel = JOptionPane.showInputDialog("Digite G Para gasolina e A para Alcool:");

        if (tipoCombustivel.equals("a"))
        {
            if (litros <= 20)
            {
                descontoAlcool = (valorAlcool*3)/100;
                valorAlcool = valorAlcool - descontoAlcool;
                valorTotal = valorAlcool*litros;
                JOptionPane.showMessageDialog(null,"Combustivel: Alcool \n"+"Valor de desconto por Litro: "+descontoAlcool+"\nValor a Pagar: R$ "+valorTotal);

            }
            if (litros > 20)
            {
                descontoAlcool = (valorAlcool*5)/100;
                valorAlcool = valorAlcool - descontoAlcool;
                valorTotal = valorAlcool*litros;
                JOptionPane.showMessageDialog(null,"Combustivel: Alcool \n"+"Valor de desconto por Litro: "+descontoAlcool+"\nValor a Pagar: R$ "+valorTotal);

            }
        }

        if (tipoCombustivel.equals("g"))
        {
            if (litros <= 20)
            {
                descontoGasolina = (valorGasolina*4)/100;
                valorGasolina = valorGasolina - descontoGasolina;
                valorTotal = valorGasolina*litros;
                JOptionPane.showMessageDialog(null,"Combustivel: Gasolina\n"+"Valor de desconto por Litro: "+descontoGasolina+"\nValor a Pagar: R$ "+valorTotal);

            }
            if (litros > 20)
            {
                descontoGasolina = (valorGasolina*6)/100;
                valorGasolina = valorGasolina - descontoGasolina;
                valorTotal = valorGasolina*litros;
                JOptionPane.showMessageDialog(null,"Combustivel: Gasolina\n"+"Valor de desconto por Litro: "+descontoGasolina+"\nValor a Pagar: R$ "+valorTotal);

            }
        }
    }
}
