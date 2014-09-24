package questao15;
import javax.swing.*;
import java.util.Arrays;
/**
 * Created by Luciana-Pc on 24/09/2014.
 */
public class questao14
{
    public static void main(String[] args) {
        Integer tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos numeros vc deseja armazenar"));
        int vetor[] = new int[tamanho];
        for (int i = 0; i<tamanho; i++)
        {
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        }

        System.out.println("\n Ordenação:"+Arrays.toString(decrecente(vetor)));
    }
    public static int[] decrecente(int[] operador)
    {
        int temporario;
        for(int i=0; i < operador.length-1; i++)
        {

            for(int j=1; j < operador.length-i; j++)
            {
                if(operador[j-1] < operador[j]){
                    temporario=operador[j-1];
                    operador[j-1] = operador[j];
                    operador[j] = temporario;
                }
            }
            System.out.println((i+1)+"° Passo: "+Arrays.toString(operador));
        }
        return operador;
    }
}


