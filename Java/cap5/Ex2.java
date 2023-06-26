package cap5;
import java.util.Scanner;
import java.text.DecimalFormat;
/*
 * Autor - Davi Oliveira Sad
 * Última Atualização - 21/05/2023
 * Objetivo - Calcular um número E definido para E = 1 + 1/1! + 1/2! + 1/!N
 */
public class Ex2{
    //Main
    public static void main(String[] args) {
        //Declaração de variáveis
        Scanner scanner = new Scanner(System.in);
        float E = 0;
        int N = 0;
        //Entrada das parcelas
        System.out.println("Insira o numero de parcelas: ");
        N = scanner.nextInt();
        //Cálculo de E
        for (int i = 0; i<=N; i ++)
        {
            E += 1.0/fatorial(i);
        }
        DecimalFormat df = new DecimalFormat("#.00");
        String res = df.format(E);
        //Exibição
        System.out.println(res);

        scanner.close();

    }
    //Função cálculo fatorial
    public static float fatorial(int N){
        float fat = 1;
        //Cálculo do fatorial
        for (int i = N; i>1; i--)
        {
            fat *= i;
        }
        //Retorna o resultado do fatorial
        return fat;
    }
}
