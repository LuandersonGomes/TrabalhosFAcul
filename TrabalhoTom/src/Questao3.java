import javax.swing.*;

/**
 * Created by Luanderson on 14/09/2014.
 */
public class Questao3
{
    public static void main(String[] Args)
    {
        int contador = 1;

        while (contador < 2)
        {
            Integer idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do nadador"));

            if (idade <= 7)
            {
                JOptionPane.showMessageDialog(null,"Categoria Intatil A");
            }

            if (idade <= 10 && idade >7)
            {
                 JOptionPane.showMessageDialog(null,"Categoria Infatil B");
            }

            if (idade <= 13 && idade > 10)
            {
                JOptionPane.showMessageDialog(null,"Categoria Juvenil A");
            }

            if (idade <= 17 && idade > 13)
            {
                JOptionPane.showMessageDialog(null,"Categoria Juvenil B");
            }

            if (idade >17)
            {
                JOptionPane.showMessageDialog(null,"Categoria Adulto");
            }



        }
    }
}
