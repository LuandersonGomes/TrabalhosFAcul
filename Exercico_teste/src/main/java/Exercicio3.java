import javax.swing.*;

/**
 * Created by Luanderson on 04/09/2014.
 */
public class Exercicio3
{
    public static void main(String[] Args)
    {
        Float[] numeros = new Float[10];
        Float soma = new Float(0);

        for (int contador = 0; contador <= 9; contador++)
        {
            numeros[contador] = Float.valueOf(Integer.parseInt(JOptionPane.showInputDialog("Digite Um Numero", null)));
            soma = soma + numeros[contador];
        }
        JOptionPane.showMessageDialog(null,"O Valor da soma é: "+soma);
    }
}
