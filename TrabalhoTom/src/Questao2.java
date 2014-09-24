import javax.swing.*;

/**
 * Created by Luanderson on 14/09/2014.
 */
public class Questao2
{
    public static void main(String[] Args)
    {
        Integer numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um Numero"));

        if (numero %2 == 0 )
        {
            JOptionPane.showMessageDialog(null,"o numero: "+numero+" é Par");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"o numero: "+numero+" Não é Par");
        }

    }
}
