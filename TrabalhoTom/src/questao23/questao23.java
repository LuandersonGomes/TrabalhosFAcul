package questao23;

import javax.swing.*;

/**
 * Created by Luanderson on 24/09/2014.
 */
public class questao23
{
    public static void main(String[] Args)
    {
        Integer horasTrabalhadas;
        Integer valorHora;
        Integer horasExtras;
        Integer salarioTotal;
        Integer valorHoraExtra = 0;
        horasTrabalhadas = Integer.parseInt(JOptionPane.showInputDialog("Digite as Horas Trabalhadas"));
        valorHora = Integer.parseInt(JOptionPane.showInputDialog("Digite o Valor Hora de Trabalho"));



        if (horasTrabalhadas > 240)
        {
            horasExtras = horasTrabalhadas - 240;
            valorHoraExtra = (valorHora/2)*horasExtras;
            salarioTotal = (horasTrabalhadas * valorHora) + valorHoraExtra;
            JOptionPane.showMessageDialog(null,"Salario do Funcionario: R$ "+salarioTotal);

        }
        else
        {
            salarioTotal = (horasTrabalhadas * valorHora) + valorHoraExtra;
            JOptionPane.showMessageDialog(null,"Salario do Funcionario: R$ "+salarioTotal);
        }

    }
}
