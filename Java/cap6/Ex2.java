package cap6;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Ex2 {
    public static void main(String[] args) {
        short tamanho = 10;
        int quantidade[] = new int[tamanho];
        float unitario[] = new float[tamanho];
        int valortotal = 0,posicao = 0;
        float maior = 0, comissao = 0;
        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        String com = null; 

        for (short i = 0; i< tamanho; i++)
        {
            System.out.println("Insira o valor unitário da peça " + (i+1));
            unitario[i] = s.nextFloat();
            System.out.println("Insira a quantidade vendida da peça " + (i+1));
            quantidade[i] = s.nextInt();
        }

        for (short i = 0; i<tamanho; i++)
        {
            System.out.println("Peça " + (i+1) + ": \nValor Unitário: " + unitario[i]);
            System.out.println("Quantidade vendida: " + quantidade[i]);
            System.out.println("Valor total de vendas: " + (unitario[i] * quantidade[i]));
            valortotal += (unitario[i] * quantidade[i]);
        }
        comissao = (float)(valortotal * 0.05);
        com = df.format(comissao);

        System.out.println("O valor total de vendas foi de: " + valortotal);
        System.out.println("A comissão do vendendor é de: " + com);
        maior = unitario[0] * quantidade [0];
        for (short i = 0; i<tamanho; i++)
        {
            if((unitario[i] * quantidade[i]) > maior)
            {
                maior = unitario[i] * quantidade [i];
                posicao = i;
            }
        }
        System.out.println("O mais vendido teve R$" + maior + " em vendas e estava na posição " + posicao);
        s.close();
    }
}
